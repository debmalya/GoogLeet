package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class AssignCookiesTest {
    AssignCookies assignCookies = new AssignCookies();

    @Test
    void findContentChildren() {
        assertEquals(1, assignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(2, assignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

    @Test
    void findContentChildrenReal() {
        assertEquals(2, assignCookies.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}