package dream;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WorldClockTest {
  private WorldClock worldClock;
  private DateTimeFormatter formatter;

  @BeforeEach
  void setUp() {
    worldClock = new WorldClock();
    formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
  }

  @Test
  void testGetWorldClocks() {
    Map<String, String> result = worldClock.getWorldClocks();
    System.out.println(result);

    // Test that the map is not null and not empty
    assertNotNull(result);
    assertFalse(result.isEmpty());

    // Test that the number of entries matches the number of available zone IDs
    assertEquals(ZoneId.getAvailableZoneIds().size(), result.size());

    // Test a few specific time zones
    assertTrue(result.containsKey("America/New_York"));
    assertTrue(result.containsKey("Europe/London"));
    assertTrue(result.containsKey("Asia/Tokyo"));

    // Test that the time format is correct
    for (String time : result.values()) {
      assertTrue(isValidTimeFormat(time));
    }

    // Test that the times are reasonably close to the current time
    ZonedDateTime now = ZonedDateTime.now();
    for (Map.Entry<String, String> entry : result.entrySet()) {
      ZonedDateTime zoneTime =
          ZonedDateTime.parse(entry.getValue(), formatter)
              .withZoneSameInstant(ZoneId.of(entry.getKey()));
      assertTrue(Math.abs(now.toEpochSecond() - zoneTime.toEpochSecond()) < 5);
    }
  }

  private boolean isValidTimeFormat(String time) {
    try {
      LocalDateTime.parse(time, formatter);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
