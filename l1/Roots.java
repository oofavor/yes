import java.util.Scanner;

public class Roots {
    public static void getRoots(Scanner scanner) {
        double a = Utils.getDouble(scanner);
        double b = Utils.getDouble(scanner);
        double c = Utils.getDouble(scanner);

        double d = Math.sqrt((b * b) - (4 * a * c));

        if (d == 0) {
            System.out.println(-b / (a * 2));
            return;
        }
        if (d > 0) {
            System.out.println((-b + d) / (a * 2)+" "+ (-b - d) / (a * 2));
            return;
        }
        System.out.println("net kornei");
    }
}
