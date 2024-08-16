package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class MaximumDistanceInArrayTest {

  MaximumDistanceInArray maximumDistanceInArray = new MaximumDistanceInArray();

  @Test
  void maxDistance() {
    List<List<Integer>> parameter = new ArrayList<>();
    parameter.add(Arrays.asList(1, 5));
    parameter.add(Arrays.asList(3, 4));
    assertEquals(3, maximumDistanceInArray.maxDistance(parameter));
  }
}
