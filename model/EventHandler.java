package model;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class EventHandler {

	private static ArrayList<Activity> eventList = new ArrayList<Activity>();
	private static ArrayList<Activity> taskList = new ArrayList<Activity>();
	private ArrayList<Activity> viewList = new ArrayList<Activity>();
	private DataProcessor dp = new DataProcessor();

	public EventHandler() {

	}

	public void getAll(java.util.Date date) throws FileNotFoundException {
		viewList.clear();
		for (int i = 0; i < taskList.size(); i++) {
			if (date.equals(taskList.get(i).actDate)) {
				viewList.add(taskList.get(i));
			}
		}
		for (int i = 0; i < eventList.size(); i++) {
			if (date.equals(eventList.get(i).actDate)) {
                                checkEvent(eventList.get(i));
				viewList.add(eventList.get(i));
			}
		}
	}

	public void deleteActivity(Activity act) throws FileNotFoundException {
		int i = searchOneActivity(act);

		if (act.getEventType().equalsIgnoreCase("Event")) {
			if (i < eventList.size()) {
				eventList.remove(i);
				exportEventCSVFile();
				System.out.println("foouunndd iiiittttt");
			}
		} else if (act.getEventType().equalsIgnoreCase("Task")) {
			if (i < eventList.size()) {
				taskList.remove(i);
				exportTaskCSVFile();
			}
		}
	}

	public void addActivity(Activity act) throws FileNotFoundException {
		boolean valid = false;
		if (act.getEventType().equalsIgnoreCase("Event")) {
			valid = checkValidityEvent(act);
		} else {
			valid = checkValidityTask(act);
		}
		if (valid) {
			if (act.getEventType().equalsIgnoreCase("Event")) {
                                Date d = new java.util.Date();  
				eventList.add(act);
				arrange(eventList);
				exportEventCSVFile();

			} else if (act.getEventType().equalsIgnoreCase("Task")) {
				taskList.add(act);
				arrange(taskList);
				exportTaskCSVFile();
			}
		}
	}

	public boolean checkValidityTask(Activity act) {
		Activity temp;
		for (int i = 0; i < eventList.size(); ++i) {
			temp = eventList.get(i);
			if (temp.getEventDate().equals(act.getEventDate())) {
				if (temp.getlStart().equals(act.getlStart())) {
					//8-9 & 8 || 8-9 & 9
					return false;
				}
				if (temp.getlEnd().isBefore(act.getlStart())) {
					//7-9 & 8
					return false;
				}
			}
		}

		for (int i = 0; i < taskList.size(); ++i) {
			temp = taskList.get(i);
			if (temp.getEventDate().equals(act.getEventDate())) {
				if (temp.getlStart().equals(act.getlStart())) {
					//8-9 & 8 || 8-9 & 9
					return false;
				}
			}
		}

		if (act.getlStart().getMinute() != 30 && act.getlStart().getMinute() != 0) {
			return false;
		}

		return true;
	}

	public boolean checkValidityEvent(Activity act) {
		Activity temp;
		for (int i = 0; i < eventList.size(); ++i) {
			temp = eventList.get(i);
			if (temp.getEventDate().equals(act.getEventDate())) {
				if (temp.getlStart().equals(act.getlStart())) {
					return false;
				} else if (temp.getlEnd().equals(act.getlEnd())) {
					return false;
				} else if (temp.getlStart().isBefore(act.getlStart()) && temp.getlEnd().isAfter(act.getlStart())) {
					return false;
				} else if (temp.getlStart().isBefore(act.getlEnd()) && temp.getlEnd().isAfter(act.getlEnd())) {
					return false;
				} else if (temp.getlStart().isAfter(act.getlStart()) && temp.getlEnd().isBefore(act.getlEnd())) {
					return false;
				}
			}
		}

		for (int i = 0; i < taskList.size(); ++i) {
			temp = taskList.get(i);
			if (temp.getEventDate().equals(act.getEventDate())) {
				if (temp.getlStart().equals(act.getlStart()) || temp.getlStart().equals(act.getlEnd())) {
					//8-9 & 8 || 8-9 & 9
					return false;
				}
				if (temp.getlStart().isBefore(act.getlEnd()) && temp.getlStart().isAfter(act.getlStart())) {
					//7-9 & 8
					return false;
				}
			}
		}

		if (act.getlStart().getMinute() != 30 && act.getlStart().getMinute() != 0) {
			return false;
		}

		if (act.getlEnd().getMinute() != 30 && act.getlEnd().getMinute() != 0) {
			return false;
		}

		return act.getlStart().isBefore(act.getlEnd());
	}
        
        public void checkEvent(Activity act) throws FileNotFoundException{
            Date d = new java.util.Date();
            if (act.getEventDate().before(d)){
                if (act.getlEnd().isBefore(LocalTime.now()))
                    changeStatus(act, "done");
            }
        }

	public void changeStatus(Activity act, String status) throws FileNotFoundException {
		int i = searchOneActivity(act);
		if (act.getEventType().equalsIgnoreCase("Event")) {
			eventList.get(i).setDone(status);
			exportEventCSVFile();
		} else if (act.getEventType().equalsIgnoreCase("Task")) {
			taskList.get(i).setDone(status);
			exportTaskCSVFile();
		}
	}

	public int searchOneActivity(Activity act) {

		/*if - else part checks if the type that we want to look for is in which activity arrayList (event, task)*/
		ArrayList<Activity> list = new ArrayList<Activity>();

		if (act.getEventType().equalsIgnoreCase("Event")) {
			list.addAll(eventList);
		} else if (act.getEventType().equalsIgnoreCase("Task")) {
			list.addAll(taskList);
		}

		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if ((act.actDate.equals(list.get(i).actDate)) && act.actName.equalsIgnoreCase(list.get(i).actName)) {
				return i;
			}
		}
		return i;
	}

	/*will only get a specific date*/
	public void viewEvent(java.util.Date sDate) throws FileNotFoundException {
		viewList.clear();
		for (int i = 0; i < eventList.size(); i++) {
			if (sDate.equals(eventList.get(i).actDate)) {
                                checkEvent(eventList.get(i));
				viewList.add(eventList.get(i));
			}
		}
	}

	/*will only get a specific date*/
	public void viewTask(java.util.Date date) {
		viewList.clear();
		for (int i = 0; i < taskList.size(); i++) {
			if (date.equals(taskList.get(i).actDate)) {
				viewList.add(taskList.get(i));
			}
		}
	}

	/*returns the list of activities from the viewEvent and viewTask*/
	public ArrayList<Activity> getViewList() {
		arrange(viewList);
		return viewList;
	}

	public void arrange(ArrayList<Activity> list) {
		arrangeDate(list);
		arrangeTime(list);
	}

	public void arrangeDate(ArrayList<Activity> list) {
		Activity temp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < (list.size() - i); j++) {
				if (list.get(j - 1).getEventDate().after(list.get(j).getEventDate())) {
					temp = list.get(j - 1);
					list.set(j - 1, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

	public void arrangeTime(ArrayList<Activity> list) {
		Activity temp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < (list.size() - i); j++) {
				if (list.get(j - 1).getEventDate().equals(list.get(j).getEventDate())) {
					if (list.get(j - 1).getlStart().isAfter(list.get(j).getlStart())) {
						temp = list.get(j - 1);
						list.set(j - 1, list.get(j));
						list.set(j, temp);
					}
				}
			}
		}
	}

	public void importEventCSVFile() {
                //dp = new DataProcessor();
                System.out.println(eventList.size());
		dp.readDC("Event.csv", "Event");
		eventList.addAll(dp.getActivity());
	}

	public void importTaskCSVFile() {
                //dp = new DataProcessor();
		dp.readDC("Task.csv", "Task");
		taskList.addAll(dp.getActivity());
	}

	public void exportEventCSVFile() throws FileNotFoundException {
                dp = new DataProcessor();
		dp.writeDC("Event.csv", eventList);
	}

	public void exportTaskCSVFile() throws FileNotFoundException {
                dp = new DataProcessor();
		dp.writeDC("Task.csv", taskList);
	}

	public void displayEvents() {
		for (int i = 0; i < eventList.size(); ++i) {
			eventList.get(i).display();
		}
	}
}
