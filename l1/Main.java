import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = args[0];

        switch (name) {
            case "1":
                Even.checkEven(scanner);
                break;
            case "2":
                Sort.printInOrder(scanner);
                break;
            case "3":
                Roots.getRoots(scanner);
                break;
            default:
                System.out.println("incorrect input");
        }

        scanner.close();
    }
}
