import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxElem(scanner));
        scanner.close();
    }

    public static int maxElem(Scanner scanner) {
        int count = 0;
        int max = 0;

        while (true) {
            String current = scanner.nextLine();
            if (current.equals("q")) {
                return count;
            }
            int currentNum = Integer.parseInt(current);
            if (currentNum > max) {
                count = 1;
                max = currentNum;
            } else if (currentNum == max) {
                count += 1;
            }
        }
    }
}
