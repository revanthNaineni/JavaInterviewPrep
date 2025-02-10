package dateAPI;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Current time in a specific time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + zonedDateTime);

        // List available Zone IDs
        System.out.println("Available Zones: " + ZoneId.getAvailableZoneIds());
    }
}
