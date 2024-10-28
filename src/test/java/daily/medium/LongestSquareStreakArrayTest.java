package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSquareStreakArrayTest {
  LongestSquareStreakArray longestSquareStreakArray = new LongestSquareStreakArray();

  @Test
  void longestSquareStreak() {
    assertEquals(4, longestSquareStreakArray.longestSquareStreak(new int[] {4, 3, 9, 81, 6561}));
    assertEquals(3, longestSquareStreakArray.longestSquareStreak(new int[] {4, 3, 6, 16, 8, 2}));
    assertEquals(2, longestSquareStreakArray.longestSquareStreak(new int[] {2, 4}));
    assertEquals(-1, longestSquareStreakArray.longestSquareStreak(new int[] {2, 3, 5, 6, 7}));
    assertEquals(
        -1,
        longestSquareStreakArray.longestSquareStreak(
            new int[] {
              57044, 68879, 916, 16512, 34776, 77929, 95685, 68153, 53877, 68617, 61264, 9172,
              95471, 86374, 25292, 29948, 43434, 72108, 18536, 31149, 4871, 98887, 89004, 24718,
              78079, 7433, 17954, 87036, 61732, 92976, 75756, 22963, 41305, 86318, 2642, 85551,
              41664, 47274, 30273, 13649, 62700, 18784, 86619, 67061, 7742, 61448, 83406, 17828,
              16384, 70815, 8431, 57596, 68118, 36095, 93523, 69623, 4603, 17368, 15193, 95191,
              10133, 62694, 43974, 79584, 75489, 12104, 29073, 62700, 24320, 12330, 66491, 49740,
              73184, 62854, 11648, 18196, 2475, 16624, 95444, 3745, 18076, 34719, 92759, 17190,
              42969, 59774, 83083, 88130, 45304, 77588, 20928, 74712, 96631, 22665, 28183, 59984,
              3663, 83781, 11902, 48445, 58424, 25315, 12874, 3960, 74187, 66127, 99769, 30927,
              64001, 39377, 90658, 32484, 56058, 92466, 38484, 31137, 4672, 28168, 7825, 82423,
              63338, 1065, 88473, 64371, 1414, 87734, 30799, 44383, 9626, 23589, 27125, 41538,
              67024, 11753, 43086, 83809, 89273, 51545, 34671, 97600, 97124, 56601, 43953, 3426,
              87357, 93958, 78617, 40820, 79406, 35356, 22773, 22331, 824, 13335, 87491, 45952,
              64051, 4422, 32732, 54810, 58319, 80257, 8457, 38567, 23825, 90986, 53332, 80829,
              42630, 84703
            }));
  }
}
