package model;

import java.time.LocalTime;

public class Event extends Activity {

	public Event(String eventName, java.util.Date eventDate, String eventType,
			LocalTime lStart, LocalTime lEnd, String done) {
		super(eventName, eventDate, eventType, lStart, lEnd, done);
	}

	public Event() {
	}
}
