package daily;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SmallestSufficientTeamTest {

    SmallestSufficientTeam smallestSufficientTeam = new SmallestSufficientTeam();

    @Test
    void smallestSufficientTeam() {
        String[] reqSkills = new String[]{"java", "nodejs", "reactjs"};
        List<List<String>> people = new ArrayList<>();
        people.add(List.of("java"));
        people.add(List.of("nodejs"));
        people.add(List.of("nodejs", "reactjs"));
        int[] actual = smallestSufficientTeam.smallestSufficientTeam(reqSkills, people);
        int[] expected = new int[]{0, 2};
        assertArrayEquals(expected, actual);
    }
}