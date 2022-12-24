import java.util.Scanner;

public class Even {
    public static void checkEven(Scanner scanner) {
        System.out.println("Vvedi neotizatelnoe chislo");
        int input = Utils.getInteger(scanner);

        while (input < 0) {
            System.out.println("Vvedi non-negative chislo pojalusta");
            input = Utils.getInteger(scanner);
        }

        System.out.println(input % 2 == 0);
    }
}
