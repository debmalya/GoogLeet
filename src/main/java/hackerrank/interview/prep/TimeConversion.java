package hackerrank.interview.prep;

public class TimeConversion {

	public static String timeConversion(String s) {
		// Write your code here
		String time = s.substring(0, s.length() - 2);
		if (s.endsWith("PM")) {

			String[] values = time.split(":");
			int hour = Integer.parseInt(values[0]);
			if (hour == 12) {
				// for 12:00:00PM to 12:59:59PM
				time = String.format("%2d:%s:%s", hour, values[1], values[2]);
			} else {
				// have to add 12 hours
				hour += 12;
				time = String.format("%02d:%s:%s", hour, values[1], values[2]);
			}

		} else if (time.startsWith("12")) {
			time = "00:" + time.substring(3);
		}
		return time;
	}

}
