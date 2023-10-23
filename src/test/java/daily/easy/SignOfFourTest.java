package daily.easy;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SignOfFourTest {
    SignOfFour signOfFour = new SignOfFour();

    @ParameterizedTest
    @ValueSource(ints = {16, 1})
    void isPowerOfFour0True(int number) {
        assertTrue(signOfFour.isPowerOfFour0(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -16, -64, 0})
    void isPowerOfFour0False(int number) {
        assertFalse(signOfFour.isPowerOfFour(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {16, 1})
    void isPowerOfFourTrue(int number) {
        assertTrue(signOfFour.isPowerOfFour(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -16, -64, 0})
    void isPowerOfFourFalse(int number) {
        assertFalse(signOfFour.isPowerOfFour0(number));
    }
}