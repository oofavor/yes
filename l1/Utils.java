import java.util.Scanner;

public class Utils {
    // ochen complex logic
    public static int getInteger(Scanner scanner) {
        Integer input = null;
        while (input == null) {
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        }
        return input.intValue();
    }

    // ochen complex logic
    public static double getDouble(Scanner scanner) {
        Double input = null;
        while (input == null) {
            try {
                input = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        }
        return input.doubleValue();
    }
}
