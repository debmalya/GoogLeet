package googleeet.other;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {
	/**
	 * Given a time represented in the format "HH:MM", form the next closest time by
	 * reusing the current digits. There is no limit on how many times a digit can
	 * be reused.
	 * 
	 * You may assume the given input string is always valid. For example, "01:34",
	 * "12:09" are all valid. "1:34", "12:9" are all invalid.
	 * 
	 * Example 1 Input: time = "19:34" Output: "19:39" Explanation: The next closest
	 * time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.
	 * It is not 19:33, because this occurs 23 hours and 59 minutes later.
	 * 
	 * Example 2 Input: time = "23:59" Output: "22:22" Explanation: The next closest
	 * time choosing from digits 2, 3, 5, 9, is 22:22. It may be assumed that the
	 * returned time is next day's time since it is smaller than the input time
	 * numerically.
	 * 
	 * Constraints:
	 * 
	 * time.length == 5 time is a valid time in the form "HH:MM". 0 <= HH < 24 0 <=
	 * MM < 60
	 * 
	 * @param time HH:MM format
	 * @return
	 */
	public String nextClosestTime(String time) {
		String closestTime = "";

		Set<Character> digits = new HashSet<>();
		String[] hhMM = time.split("\\:");
		digits.add(hhMM[0].charAt(0));
		digits.add(hhMM[0].charAt(1));
		digits.add(hhMM[1].charAt(0));
		digits.add(hhMM[1].charAt(1));

		int hour = Integer.parseInt(hhMM[0]);
		int minute = Integer.parseInt(hhMM[1]);
		int timeNow = hour * 60 + minute;

		while (true) {
			timeNow++;
			int closestHour = (timeNow / 60) % 24;
			int closestMinute = timeNow % 60;
			String hourStr = String.format("%02d", closestHour);
			String minStr = String.format("%02d", closestMinute);
			if (matches(hourStr, digits) && matches(minStr, digits)) {
				closestTime = String.format("%s:%s", hourStr, minStr);
				break;
			}
		}

		return closestTime;

	}

	private boolean matches(String hourStr, Set<Character> digits) {

		return digits.contains(hourStr.charAt(0)) && digits.contains(hourStr.charAt(1));
	}

}
