package daily.medium;

import org.junit.jupiter.api.Test;

class WidthOfVerticalAreaTest {
    WidthOfVerticalArea widthOfVerticalArea = new WidthOfVerticalArea();

    @Test
    void maxWidthOfVerticalArea() {
        widthOfVerticalArea.maxWidthOfVerticalArea(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}});
    }
}