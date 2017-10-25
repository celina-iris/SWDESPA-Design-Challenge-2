package model;

import java.time.LocalTime;
import java.util.Calendar;

public abstract class Activity {

	protected String actName;
	protected java.util.Date actDate;
	protected int day;
	protected int month;
	protected int year;
	protected LocalTime lStart;
	protected LocalTime lEnd;
	protected String actType;
	protected String done;

	public Activity() {
	}

	public Activity(String eventName, java.util.Date eventDate, String eventType,
			LocalTime lStart, LocalTime lEnd, String done) {
		setName(eventName);
		setDate(eventDate);
		setEventType(eventType);
		setLStart(lStart);
		setLEnd(lEnd);
		setDone(done);
	}

	public void setName(String actName) {
		this.actName = actName;
	}

	public void setDate(java.util.Date actDate) {
		this.actDate = actDate;

		Calendar cal = Calendar.getInstance();
		cal.setTime(actDate);
		setDay(cal.get(Calendar.DATE));
		setMonth(cal.get(Calendar.MONTH));
		setYear(cal.get(Calendar.YEAR));
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setLStart(LocalTime lStart) {
		this.lStart = lStart;
	}

	public void setLEnd(LocalTime lEnd) {
		this.lEnd = lEnd;
	}

	public void setEventType(String actType) {
		this.actType = actType;
	}

	public void setDone(String done) {
		this.done = done;
	}

	public String getName() {
		return actName;
	}

	public String getEventName() {
		return actName;
	}

	public java.util.Date getEventDate() {
		return actDate;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public LocalTime getlStart() {
		return lStart;
	}

	public LocalTime getlEnd() {
		return lEnd;
	}

	public String getEventType() {
		return actType;
	}

	public String getDone() {
		return done;
	}

	public String getTime() {
		String time = lStart.toString();
		if(lEnd != null) {
			time = time  + " - " + lEnd.toString();
		}
		return  time;
	}

	public void display() {
		System.out.println(actName + "\n" + actDate);
	}
}
