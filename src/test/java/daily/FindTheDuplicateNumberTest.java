package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheDuplicateNumberTest {
    FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

    @Test
    void findDuplicate() {
        assertEquals(2, findTheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findTheDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}