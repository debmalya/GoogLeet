import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IrrigationTest {

    @Test
    void getNearestPipeEnding() {
        assertEquals(20, Irrigation.getNearestPipeEnding(6, List.of(20, 34, 60), 8));
        assertEquals(60, Irrigation.getNearestPipeEnding(55, List.of(20, 34, 60), 8));
    }
}