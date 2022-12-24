import java.util.Scanner;

public class Sort {
    public static void printInOrder(Scanner scanner) {
        int a1 = Utils.getInteger(scanner);
        int a2 = Utils.getInteger(scanner);
        int a3 = Utils.getInteger(scanner);
        int result = a1 + a2 + a3;

        int first = Math.min(Math.min(a1, a2), a3);
        int third = Math.max(Math.max(a1, a2), a3);
        int second = result - first - third;

        System.out.println(Integer.toString(first) + " " +
                Integer.toString(second) + " " +
                Integer.toString(third));
    }
}
