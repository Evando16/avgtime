package main;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TimeUtil {

	public static ArrayList<String> addTime() {
		ArrayList<String> list = new ArrayList<>();

		list.add("7:50");
		list.add("8:00");
		list.add("8:30");
		list.add("8:15");
		list.add("7:40");
		list.add("9:00");
		list.add("8:50");

		return list;
	}

	public static String getAvgTime(ArrayList<String> list) {
		Integer timeMinutes = 0;
		Double timeMinutesAvg = 0D;

		for (String obj : list) {
			timeMinutes += getTimeInMinutes(obj);
		}

		timeMinutesAvg = (double) timeMinutes / list.size();

		int hour = (int) (timeMinutesAvg / 60);
		int minutes = (int) (timeMinutesAvg % 60);

		return hour + ":" + minutes;
	}

	private static Integer getTimeInMinutes(String time) {
		String[] breakTime = getBreakTime(time);

		return (int) TimeUnit.HOURS.toMinutes(Long.parseLong(breakTime[0])) + Integer.parseInt(breakTime[1]);
	}

	private static String[] getBreakTime(String time) {
		return time.split(":");
	}

}
