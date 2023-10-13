package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindInMountainArrayTest {

    FindInMountainArray findInMountainArray = new FindInMountainArray();

    @Test
    void findInMountainArray() {
        FindInMountainArray.MountainArrayImpl mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{1, 2, 3, 4, 5, 3, 1});
        assertEquals(2, findInMountainArray.findInMountainArray(3, mountainArray));

        mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{0, 1, 2, 4, 2, 1});
        assertEquals(-1, findInMountainArray.findInMountainArray(3, mountainArray));
    }

    @Test
    void findInMountainArray0() {
        FindInMountainArray.MountainArrayImpl mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{1, 2, 3, 4, 5, 3, 1});
        assertEquals(2, findInMountainArray.findInMountainArray0(3, mountainArray));

        mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{0, 1, 2, 4, 2, 1});
        assertEquals(-1, findInMountainArray.findInMountainArray0(3, mountainArray));
    }

    @Test
    void findInMountainArrayReal0() {
        FindInMountainArray.MountainArrayImpl mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{1, 5, 2});
        assertEquals(2, findInMountainArray.findInMountainArray0(2, mountainArray));
    }

    @Test
    void findInMountainArrayReal() {
        FindInMountainArray.MountainArrayImpl mountainArray = new FindInMountainArray.MountainArrayImpl(new int[]{1, 5, 2});
        assertEquals(2, findInMountainArray.findInMountainArray(2, mountainArray));
    }
}