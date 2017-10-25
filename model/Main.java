package model;

import View.View;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, ParseException {
		View v = new View();
		v.start();
	}
}
