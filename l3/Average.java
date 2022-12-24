import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(averageArithmetical(scanner));
        scanner.close();
    }

    // С условием, что могут быть введены только числа и слово "quit"
    public static double averageArithmetical(Scanner scanner) {
        int count = 0;
        int sum = 0;

        while (true) {
            String current = scanner.nextLine();
            if (current.equals("q")) {
                return (sum + 0.0) / count;
            }
            int currentNum = Integer.parseInt(current);
            if (currentNum % 2 == 0) {
                count += 1;
                sum += currentNum;
            }
        }
    }
}
