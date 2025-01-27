package time;

import java.time.ZoneId;

public class ZonedIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId1 = " + zoneId1);
    }
}
