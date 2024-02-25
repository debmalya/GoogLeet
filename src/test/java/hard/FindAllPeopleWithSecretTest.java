package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllPeopleWithSecretTest {
    FindAllPeopleWithSecret findAllPeopleWithSecret = new FindAllPeopleWithSecret();

    @Test
    void findAllPeople() {
//        At time 0, person 0 shares the secret with person 1.
//        At time 5, person 1 shares the secret with person 2.
//        At time 8, person 2 shares the secret with person 3.
//        At time 10, person 1 shares the secret with person 5.
        var result = findAllPeopleWithSecret.findAllPeople(6, new int[][]{{1, 2, 5}, {2, 3, 8}, {1, 5, 10}}, 1);
        assertAll(() -> assertEquals(5, result.size()),
                () -> assertTrue(result.contains(0)),
                () -> assertTrue(result.contains(1)),
                () -> assertTrue(result.contains(2)),
                () -> assertTrue(result.contains(3)),
                () -> assertTrue(result.contains(5)));
    }

    @Test
    void findAllPeople1() {
//        At time 0, person 0 shares the secret with person 3.
//        At time 2, neither person 1 nor person 2 know the secret.
//        At time 3, person 3 shares the secret with person 0 and person 1.
//        Thus, people 0, 1, and 3 know the secret after all the meetings.
        var result = findAllPeopleWithSecret.findAllPeople(6, new int[][]{{3, 1, 3}, {1, 2, 2}, {0, 3, 3}}, 3);
        assertAll(() -> assertEquals(3, result.size()),
                () -> assertTrue(result.contains(0)),
                () -> assertTrue(result.contains(1)),
                () -> assertTrue(result.contains(3)));
    }

    @Test
    void findAllPeople2() {
//        At time 0, person 0 shares the secret with person 3.
//        At time 2, neither person 1 nor person 2 know the secret.
//        At time 3, person 3 shares the secret with person 0 and person 1.
//        Thus, people 0, 1, and 3 know the secret after all the meetings.
        var result = findAllPeopleWithSecret.findAllPeople(5, new int[][]{{1, 4, 3}, {0, 4, 3}}, 3);
        assertAll(() -> assertEquals(4, result.size()),
                () -> assertTrue(result.contains(0)),
                () -> assertTrue(result.contains(1)),
                () -> assertTrue(result.contains(3)),
                () -> assertTrue(result.contains(4)));
    }
}