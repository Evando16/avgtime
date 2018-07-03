package main;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listTime = TimeUtil.addTime();
		Calendar calendar = TimeUtil.getAvgTime(listTime);
		
		for (String obj : listTime) {
			System.out.println(obj);
		}
		
		
		System.out.println(calendar.getTime());
	}

}
