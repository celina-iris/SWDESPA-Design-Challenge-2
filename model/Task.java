package model;

import java.time.LocalTime;

public class Task extends Activity {

	public Task(String eventName, java.util.Date eventDate, String eventType,
			LocalTime lStart, LocalTime lEnd, String done) {
		super(eventName, eventDate, eventType, lStart, lEnd, done);
	}

	public Task() {
	}
}
