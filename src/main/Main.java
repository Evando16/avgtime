package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> listTime = TimeUtil.addTime();
		String avgTime = TimeUtil.getAvgTime(listTime);

		for (String obj : listTime) {
			System.out.println(obj);
		}

		System.out.println("The AVG time of range above is: " + avgTime);
	}

}
