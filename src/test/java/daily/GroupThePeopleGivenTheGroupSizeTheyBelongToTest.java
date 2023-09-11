package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupThePeopleGivenTheGroupSizeTheyBelongToTest {
    GroupThePeopleGivenTheGroupSizeTheyBelongTo groupThePeopleGivenTheGroupSizeTheyBelongTo = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();

    @Test
    void groupThePeople() {
        var actual = groupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(new int[]{3, 3, 3, 3, 3, 1, 3});
        assertAll(() -> assertEquals(actual.size(), 3, "Must have 3 groups"),
                () -> assertTrue(actual.get(0).contains(0), "First group must have index 0"),
                () -> assertTrue(actual.get(0).contains(1), "First group must have index 1"),
                () -> assertTrue(actual.get(0).contains(2), "First group must have index 2"),
                () -> assertTrue(actual.get(1).contains(5), "Second group must have index 5"),
                () -> assertTrue(actual.get(2).contains(3), "Third group must have index 3"),
                () -> assertTrue(actual.get(2).contains(4), "Third group must have index 4"),
                () -> assertTrue(actual.get(2).contains(6), "Third group must have index 6"));
    }

    @Test
    void groupThePeople1() {
        var actual = groupThePeopleGivenTheGroupSizeTheyBelongTo.groupThePeople(new int[]{2, 1, 3, 3, 3, 2});
        assertAll(() -> assertEquals(actual.size(), 3, "Must have 3 groups"),
                () -> assertTrue(actual.get(0).contains(1), "First group must have index 1"),
                () -> assertTrue(actual.get(1).contains(2), "First group must have index 2"),
                () -> assertTrue(actual.get(1).contains(3), "First group must have index 3"),
                () -> assertTrue(actual.get(1).contains(4), "First group must have index 4"),
                () -> assertTrue(actual.get(2).contains(0), "First group must have index 0"),
                () -> assertTrue(actual.get(2).contains(5), "First group must have index 5"));
    }
}