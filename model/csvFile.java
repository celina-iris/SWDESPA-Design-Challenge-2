package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class csvFile extends FileReadWrite {

	ArrayList<String> names;
	ArrayList<String> dates;
	ArrayList<String> types;
	ArrayList<String> startTime;
	ArrayList<String> endTime;
	ArrayList<String> done;

	void Read(String filename) {
		String csvFile = "C:\\Users\\ruby\\Documents\\NetBeansProjects\\SWDESPA 2.7.2\\src\\files\\" + filename;
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		/*needs to be new because the list should be empty*/
		names = new ArrayList<String>();
		dates = new ArrayList<String>();
		types = new ArrayList<String>();
		startTime = new ArrayList<String>();
		endTime = new ArrayList<String>();
		done = new ArrayList<String>();

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] info = line.split(cvsSplitBy);

				dates.add((String) info[0].replaceAll(" ", ""));
				names.add(info[1]);
				types.add(info[2].replaceAll(" ", ""));
				startTime.add(info[3].replaceAll(" ", ""));
				endTime.add(info[4].replaceAll(" ", ""));
				done.add(info[5].replaceAll(" ", ""));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	void Write(ArrayList<String> names, ArrayList<String> dates, ArrayList<String> types,
			ArrayList<String> startTime, ArrayList<String> endTime, ArrayList<String> done,
			String filename) throws FileNotFoundException {
		this.names = names;
		this.dates = dates;
		this.types = types;
		this.startTime = startTime;
		this.endTime = endTime;
		this.done = done;

		PrintWriter pw = new PrintWriter(new File("C:\\Users\\ruby\\Documents\\NetBeansProjects\\SWDESPA 2.7.2\\src\\files\\" + filename));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.size(); i++) {
			sb.append(dates.get(i));
			sb.append(',');
			sb.append(names.get(i));
			sb.append(',');
			sb.append(types.get(i));
			sb.append(',');
			sb.append(startTime.get(i));
			sb.append(',');
			sb.append(endTime.get(i));
			sb.append(',');
			sb.append(done.get(i));
			sb.append('\n');
		}

		pw.write(sb.toString());
		pw.close();

	}

	@Override
	ArrayList<String> getNames() {
		return names;
	}

	@Override
	ArrayList<String> getDates() {
		return dates;
	}

	@Override
	ArrayList<String> getTypes() {
		return types;
	}

	@Override
	ArrayList<String> getStartTime() {
		return startTime;
	}

	@Override
	ArrayList<String> getEndTime() {
		return endTime;
	}

	@Override
	ArrayList<String> getDone() {
		return done;
	}

}
