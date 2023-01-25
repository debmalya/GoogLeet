package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindClosestNodeToGivenTwoNodesTest {

	FindClosestNodeToGivenTwoNodes findClosestNodeToGivenTwoNodes = new FindClosestNodeToGivenTwoNodes();

	@Test
	void example1() {
		int commonNode = findClosestNodeToGivenTwoNodes.closestMeetingNode(new int[] { 2, 2, 3, -1 }, 0, 1);
		assertEquals(2, commonNode);
	}

	@Test
	void example2() {
		int commonNode = findClosestNodeToGivenTwoNodes.closestMeetingNode(new int[] { 1, 2, -1 }, 0, 2);
		assertEquals(2, commonNode);
	}
}
