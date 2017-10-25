package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class FileReadWrite {

	abstract void Read(String filename);

	abstract void Write(ArrayList<String> names, ArrayList<String> dates, ArrayList<String> types,
			ArrayList<String> startTime, ArrayList<String> endTime, ArrayList<String> done,
			String filename)
			throws FileNotFoundException;

	abstract ArrayList<String> getNames();

	abstract ArrayList<String> getDates();

	abstract ArrayList<String> getTypes();

	abstract ArrayList<String> getStartTime();

	abstract ArrayList<String> getEndTime();

	abstract ArrayList<String> getDone();
}
