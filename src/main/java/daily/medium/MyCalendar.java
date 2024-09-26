package daily.medium;

import java.util.Map;
import java.util.TreeMap;

/**
 * You are implementing a program to use as your calendar. We can add a new event if adding the
 * event will not cause a double booking.
 *
 * <p>A double booking happens when two events have some non-empty intersection (i.e., some moment
 * is common to both events.).
 *
 * <p>The event can be represented as a pair of integers start and end that represents a booking on
 * the half-open interval [start, end), the range of real numbers x such that start <= x < end.
 */
public class MyCalendar {
  /** Initializes the calendar object. */
  TreeMap<Integer, Integer> calendar = new TreeMap<>();

  public MyCalendar() {
    calendar.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  /**
   * Returns true if the event can be added to the calendar successfully without causing a double
   * booking. Otherwise, return false and do not add the event to the calendar.
   *
   * @param start of the event
   * @param end of the event
   * @return true if the event can be added to the calendar successfully, false otherwise.
   */
  public boolean book(int start, int end) {
    Map.Entry<Integer, Integer> pair = calendar.higherEntry(start);
    boolean res = end <= pair.getValue();
    if (res) calendar.put(end, start);
    return res;
  }
}
