package dream;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class WorldClock {
  public Map<String, String> getWorldClocks() {
    Map<String, String> worldClockMap = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ISO_ZONED_DATE_TIME;
    // Get all available timezone IDs
    for (String zoneId : ZoneId.getAvailableZoneIds()) {
      ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
      String formattedTime = zonedDateTime.format(formatter);
      worldClockMap.put(zoneId, formattedTime);
    }
    return worldClockMap;
  }
}
