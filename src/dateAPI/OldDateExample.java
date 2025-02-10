package dateAPI;
import java.util.Date;

public class OldDateExample {
    public static void main(String[] args) {
        // Current date and time
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Specific date
        Date specificDate = new Date(1220227200L * 1000); // Epoch time in milliseconds
        System.out.println("Specific Date: " + specificDate);

        // Comparing Dates
        Date anotherDate = new Date();
        System.out.println("Is current date before another date? " + currentDate.before(anotherDate));
    }
}
