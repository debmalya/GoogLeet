package dream;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WorldClock {
  public Map<String, String> getWorldClocks() {
    DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
    // Use TreeMap with custom comparator to sort by time
    Map<String, String> worldClockMap =
        new TreeMap<>(
            Comparator.comparing(zoneId -> ZonedDateTime.now(ZoneId.of(zoneId)).format(formatter)));
    // Get all available timezone IDs
    for (String zoneId : ZoneId.getAvailableZoneIds()) {
      ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
      String formattedTime = zonedDateTime.format(formatter);
      worldClockMap.put(zoneId, formattedTime);
    }
    return worldClockMap;
  }

  public static void main(String[] args) {
    WorldClock worldClock = new WorldClock();
    Map<String, String> worldClocks = worldClock.getWorldClocks();
    worldClocks.forEach((zone, time) -> System.out.println(zone + ": " + time));
  }
}
