package collections;

import java.util.EnumMap;

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Day, String> activityMap = new EnumMap<>(Day.class);
        activityMap.put(Day.MONDAY, "Gym");
        activityMap.put(Day.TUESDAY, "Swimming");
        activityMap.put(Day.WEDNESDAY, "Running");

        for (Day day : Day.values()) {
            System.out.println(day + ": " + activityMap.getOrDefault(day, "No activity"));
        }
      // MONDAY: Gym
	  // TUESDAY: Swimming
      // WEDNESDAY: Running
	  // THURSDAY: No activity
	  // FRIDAY: No activity
	  // SATURDAY: No activity
	  // SUNDAY: No activity
        
        //EnumMap<String, String> activityMapS = new EnumMap<>();
    }
}