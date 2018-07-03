package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;

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

	public static Calendar getAvgTime(ArrayList<String> list) {
		Long timeMilliSeconds = 0L;
		Long timeMilliSecondsAvg = 0L;

		for (String obj : list) {
			timeMilliSeconds += getCalendarDate(obj).getTimeInMillis();
		}

		timeMilliSecondsAvg = timeMilliSeconds / list.size();

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(timeMilliSecondsAvg);

		return calendar;
	}

	private static Calendar getCalendarDate(String time) {
		String[] breakTime = getBreakTime(time);
		Calendar calendar = Calendar.getInstance();
		LocalDateTime now = LocalDateTime.now();

		calendar.set(now.getYear(), now.getMonthValue()-1, now.getDayOfMonth(), Integer.parseInt(breakTime[0]),
				Integer.parseInt(breakTime[1]));

		return calendar;
	}

	private static String[] getBreakTime(String time) {
		return time.split(":");
	}

}
