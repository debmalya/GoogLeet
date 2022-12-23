package daily;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class KeysNRoomTest {
	KeysNRoom keysNRoom = new KeysNRoom();

	@Test
	void testCanVisitAllRoomsPositive() {
		List<Integer> firstRoom = new ArrayList<>();
		firstRoom.add(1);
		List<Integer> secondRoom = new ArrayList<>();
		secondRoom.add(2);
		List<Integer> thirdRoom = new ArrayList<>();
		thirdRoom.add(3);
		List<Integer> fourthRoom = new ArrayList<>();
		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(firstRoom);
		rooms.add(secondRoom);
		rooms.add(thirdRoom);
		rooms.add(fourthRoom);

		assertTrue(keysNRoom.canVisitAllRooms(rooms));
	}

	@Test
	void testCanVisitAllRoomsNegative() {
		List<Integer> firstRoom = new ArrayList<>();
		firstRoom.add(1);
		firstRoom.add(3);
		List<Integer> secondRoom = new ArrayList<>();
		secondRoom.add(3);
		secondRoom.add(0);
		secondRoom.add(1);
		List<Integer> thirdRoom = new ArrayList<>();
		thirdRoom.add(2);
		List<Integer> fourthRoom = new ArrayList<>();
		fourthRoom.add(0);

		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(firstRoom);
		rooms.add(secondRoom);
		rooms.add(thirdRoom);
		rooms.add(fourthRoom);

		assertFalse(keysNRoom.canVisitAllRooms(rooms));
	}

}
