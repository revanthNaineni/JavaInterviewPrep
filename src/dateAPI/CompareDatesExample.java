package dateAPI;
import java.time.LocalDate;

public class CompareDatesExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 12, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 17);

        // Compare dates
        System.out.println("Is date1 before date2? " + date1.isBefore(date2));
        System.out.println("Is date1 after date2? " + date1.isAfter(date2));
    }
}
