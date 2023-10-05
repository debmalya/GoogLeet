package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementIITest {
    MajorityElementII majorityElementII = new MajorityElementII();

    @Test
    void majorityElement() {
        var actual = majorityElementII.majorityElement(new int[]{2, 2});
        assertAll(() -> assertEquals(1, actual.size()),
                () -> assertEquals(2, actual.get(0).intValue()));
    }

    @Test
    void majorityElement1() {
        var actual = majorityElementII.majorityElement(new int[]{3, 2, 3});
        assertAll(() -> assertEquals(1, actual.size()),
                () -> assertEquals(3, actual.get(0).intValue()));
    }

    @Test
    void majorityElement2() {
        var actual = majorityElementII.majorityElement(new int[]{1});
        assertAll(() -> assertEquals(1, actual.size()),
                () -> assertEquals(1, actual.get(0).intValue()));
    }

    @Test
    void majorityElement2a() {
        var actual = majorityElementII.majorityElement(new int[]{1, 1});
        assertAll(() -> assertEquals(1, actual.size()),
                () -> assertEquals(1, actual.get(0).intValue()));
    }

    @Test
    void majorityElement3() {
        var actual = majorityElementII.majorityElement(new int[]{1, 2});
        assertAll(() -> assertEquals(2, actual.size()),
                () -> assertEquals(1, actual.get(0).intValue()),
                () -> assertEquals(2, actual.get(1).intValue()));
    }

    @Test
    void majorityElement3a() {
        var actual = majorityElementII.majorityElement(new int[]{1, 2, 3});
        assertAll(() -> assertEquals(0, actual.size()));
    }

    @Test
    void majorityElement4() {
        var actual = majorityElementII.majorityElement(new int[]{1, 2, 3, 4});
        assertAll(() -> assertEquals(0, actual.size()));
    }
}