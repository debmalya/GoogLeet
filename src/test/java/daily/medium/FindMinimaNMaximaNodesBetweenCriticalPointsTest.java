package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import googleet.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class FindMinimaNMaximaNodesBetweenCriticalPointsTest {

  FindMinimaNMaximaNodesBetweenCriticalPoints findMinimaNMaximaNodesBetweenCriticalPoints =
      new FindMinimaNMaximaNodesBetweenCriticalPoints();

  @Test
  void nodesBetweenCriticalPoints() {
    var arr = new int[] {3, 1};
    ListNode head = arr2ListNode(arr);
    var expected = new int[] {-1, -1};
    assertArrayEquals(
        expected, findMinimaNMaximaNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head));
  }

  @Test
  void nodesBetweenCriticalPoints1() {
    var arr = new int[] {5, 3, 1, 2, 5, 1, 2};
    ListNode head = arr2ListNode(arr);
    var expected = new int[] {1, 3};
    assertArrayEquals(
        expected, findMinimaNMaximaNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head));
  }

  @Test
  void nodesBetweenCriticalPoints2() {
    var arr = new int[] {6, 8, 4, 1, 9, 6, 6, 10, 6};
    ListNode head = arr2ListNode(arr);
    var expected = new int[] {1, 6};
    assertArrayEquals(
        expected, findMinimaNMaximaNodesBetweenCriticalPoints.nodesBetweenCriticalPoints(head));
  }

  private ListNode arr2ListNode(int[] arr) {
    ListNode head = new ListNode(arr[0]);
    ListNode current = head;
    for (var index = 1; index < arr.length; index++) {
      current.next = new ListNode(arr[index]);
      current = current.next;
    }
    return head;
  }
}
