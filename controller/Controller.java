package controller;

import java.util.Date;
import java.io.FileNotFoundException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;
import model.*;

/**
 *
 * @author Jilyan
 */
public class Controller {

	private EventHandler eh = new EventHandler();
        
        public void importActivities(){
            eh.importEventCSVFile();
            eh.importTaskCSVFile();
        }

	public void createEvent(String eventName, String date, String eventType, LocalTime lStart, LocalTime lEnd, String done) throws FileNotFoundException {
		Date eventDate = convertDate(date);
		if (eventType.equalsIgnoreCase("event")) {
			Activity addEvent = new Event(eventName, eventDate, eventType, lStart, lEnd, done);
			eh.addActivity(addEvent);
		} else {
			Activity addTask = new Task(eventName, eventDate, eventType, lStart, lEnd, done);
			eh.addActivity(addTask);
		}
	}

	public ArrayList<Activity> viewActivities(String date, String actType) throws FileNotFoundException {
		Date fullDate = convertDate(date);
		if (actType.equalsIgnoreCase("Event")) {
			eh.viewEvent(fullDate);
			return eh.getViewList();
		} else if (actType.equalsIgnoreCase("Task")) {
			eh.viewTask(fullDate);
			return eh.getViewList();
		}
		eh.getAll(fullDate);
		return eh.getViewList();
	}

	public Date convertDate(String d) {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		Date fullDate = null;
		try {
			fullDate = null;

			fullDate = format.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fullDate;
	}

	public LocalTime convertTime(int hour, int min) {
		Time start = new Time(hour, min, 0);
		return start.toLocalTime();
	}
	
	public void deleteActivity (Activity act) throws FileNotFoundException {
		eh.deleteActivity(act);
	}
	
	public void markDone(Activity act, String done) throws FileNotFoundException {
		eh.changeStatus(act, done);
	}
}
