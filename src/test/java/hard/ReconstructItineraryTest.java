package hard;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReconstructItineraryTest {

    ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

    @Test
    void findItinerary0() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        var actual = reconstructItinerary.findItinerary0(tickets);
//        assertAll(() -> assertEquals(5, actual.size()));
    }

    @Test
    void findItinerary() {
        List<List<String>> tickets = new ArrayList<>();
        tickets.add(Arrays.asList("MUC", "LHR"));
        tickets.add(Arrays.asList("JFK", "MUC"));
        tickets.add(Arrays.asList("SFO", "SJC"));
        tickets.add(Arrays.asList("LHR", "SFO"));

        var actual = reconstructItinerary.findItinerary(tickets);
        assertAll(() -> assertEquals(5, actual.size()));
    }
}