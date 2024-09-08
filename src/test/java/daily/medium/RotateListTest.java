package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import googleet.linkedlist.ListNode;
import org.junit.jupiter.api.Test;

class RotateListTest {

  RotateList rotateList = new RotateList();

  @Test
  void rotateRight() {
    ListNode head = new ListNode(1);
    ListNode current = head;
    var inputArr = new int[] {2, 3, 4, 5};
    var expectedArr = new int[] {4, 5, 1, 2, 3};
    baseTest(current, head, inputArr, expectedArr, 2);
  }

  @Test
  void rotateRight1() {
    ListNode head = new ListNode(0);
    ListNode current = head;
    var inputArr = new int[] {1, 2};
    var expectedArr = new int[] {2, 0, 1};
    baseTest(current, head, inputArr, expectedArr, 4);
  }

  @Test
  void rotateRight2() {
    ListNode head = null;
    ListNode current = head;
    var inputArr = new int[] {};
    var expectedArr = new int[] {};
    baseTest(current, head, inputArr, expectedArr, 2);
  }

  @Test
  void rotateRight3() {
    ListNode head = new ListNode(1);
    ListNode current = head;
    var inputArr = new int[] {2};
    var expectedArr = new int[] {1, 2};
    var ks = new int[] {0, 2};
    for (var k : ks) {
      baseTest(current, head, inputArr, expectedArr, k);
    }
  }

  @Test
  void rotateRight4() {
    ListNode head = new ListNode(1);
    ListNode current = head;
    var inputArr = new int[] {2, 3, 4, 5};
    var expectedArr = new int[] {1, 2, 3, 4, 5};
    baseTest(current, head, inputArr, expectedArr, 10);
  }

  private void baseTest(ListNode current, ListNode head, int[] inputArr, int[] expectedArr, int k) {

    for (var num : inputArr) {
      current.next = new ListNode(num);
      current = current.next;
    }
    var modifiedHead = rotateList.rotateRight(head, k);

    current = modifiedHead;
    var index = 0;
    while (current != null) {
      assertEquals(expectedArr[index], current.val);
      current = current.next;
      index++;
    }
  }
}
