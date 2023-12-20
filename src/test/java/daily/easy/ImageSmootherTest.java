package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ImageSmootherTest {
    ImageSmoother imageSmoother = new ImageSmoother();

    @Test
    void imageSmoother() {
        var actual = imageSmoother.imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
        var expected = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int row = 0; row < actual.length; row++) {
            assertArrayEquals(expected[row], actual[row]);
        }
    }
}