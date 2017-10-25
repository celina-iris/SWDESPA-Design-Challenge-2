package model;

import java.io.FileNotFoundException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DataProcessor {

	private ArrayList<Activity> activityList = new ArrayList<Activity>();
	private FileReadWrite fr = new csvFile();

	private ArrayList<String> temp = new ArrayList<String>();

	private ArrayList<String> names = new ArrayList<String>();
	private ArrayList<String> dates = new ArrayList<String>();
	private ArrayList<String> types = new ArrayList<String>();
	private ArrayList<String> startT = new ArrayList<String>();
	private ArrayList<String> endT = new ArrayList<String>();
	private ArrayList<String> dones = new ArrayList<String>();

	private ArrayList<Date> dateList = new ArrayList<Date>();
	private ArrayList<LocalTime> lStart = new ArrayList<LocalTime>();
	private ArrayList<LocalTime> lEnd = new ArrayList<LocalTime>();

	public void readDC(String filename, String type) {
                activityList.clear();
		fr.Read(filename);
		setArrayList();
		convertDate();
		convertTime();
		convertActivity(type);
		/*put if here for the conversion of activity kasi iba ang pag instantiate pag abstract*/
	}

	public void writeDC(String filename, ArrayList<Activity> activity) throws FileNotFoundException {
		/*no need to specify if event or task)*/
		convertToString(activity);
		fr.Write(names, dates, types, startT, endT, dones, filename);
	}

	public void setArrayList() {
		temp = fr.getNames();
		names.addAll(temp);
		temp = fr.getDates();
		dates.addAll(temp);
		temp = fr.getTypes();
		types.addAll(temp);
		temp = fr.getStartTime();
		startT.addAll(temp);
		temp = fr.getEndTime();
		endT.addAll(temp);
		temp = fr.getDone();
		dones.addAll(temp);
	}

	public void convertDate() {
		for (int i = 0; i < dates.size(); i++) {

			DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
			Date fullDate = new Date();
			fullDate = null;
			try {
				fullDate = format.parse(dates.get(i));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			dateList.add(fullDate);
		}
	}

	public void convertActivity(String type) {
		Activity newActivity;

		for (int i = 0; i < names.size(); i++) {
			if (type.equalsIgnoreCase("Event")) {
				newActivity = new Event(names.get(i), dateList.get(i), types.get(i),
						lStart.get(i), lEnd.get(i), dones.get(i));
				activityList.add(newActivity);
			} else if (type.equalsIgnoreCase("Task")) {
				newActivity = new Task(names.get(i), dateList.get(i), types.get(i),
						lStart.get(i), lEnd.get(i), dones.get(i));
				activityList.add(newActivity);
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void convertTime() {
		String[] sT;
		ArrayList<Integer> sH = new ArrayList<Integer>();
		ArrayList<Integer> sM = new ArrayList<Integer>();
		Time start;

		for (int i = 0; i < startT.size(); i++) {
			sT = startT.get(i).split(":");
			sH.add(Integer.parseInt(sT[0]));
			sM.add(Integer.parseInt(sT[1]));
			start = new Time(sH.get(i), sM.get(i), 0);
			lStart.add(start.toLocalTime());
		}
		String[] eT;
		ArrayList<Integer> eH = new ArrayList<Integer>();
		ArrayList<Integer> eM = new ArrayList<Integer>();
		Time end;

		for (int i = 0; i < endT.size(); i++) {
                    if (endT.get(i).equalsIgnoreCase("null")){
                        lEnd.add(null);
                    }
                    else{
			eT = endT.get(i).split(":");
			eH.add(Integer.parseInt(eT[0]));
			eM.add(Integer.parseInt(eT[1]));
			end = new Time(eH.get(i), eM.get(i), 0);
			lEnd.add(end.toLocalTime());
                    }        
		}

	}

	public ArrayList<Activity> getActivity() {
		return activityList;
	}

	public void convertToString(ArrayList<Activity> activity) {
		names.clear();
		dates.clear();
		types.clear();
		startT.clear();
		endT.clear();
		dones.clear();

		for (int i = 0; i < activity.size(); i++) {
			names.add(activity.get(i).getEventName().toString());
			dates.add(convertDateString(activity.get(i).getEventDate()));
			types.add(activity.get(i).getEventType().toString());
			startT.add(activity.get(i).getlStart().toString());
                        if (activity.get(i).getEventType().equalsIgnoreCase("Event"))
                            endT.add(activity.get(i).getlEnd().toString());
                        else
                            endT.add("null");
			dones.add(activity.get(i).getDone().toString());
		}
	}

	public String convertDateString(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String str = "";
		int d = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);

		str += Integer.toString(month) + "/";
		str += Integer.toString(d) + "/";
		str += Integer.toString(year);

		return str;
	}
}
