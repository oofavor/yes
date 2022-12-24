import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(seq(scanner));
        scanner.close();
    }

    public static int seq(Scanner scanner) {
        int count = 1;
        int mxCount = 1;

        String current = scanner.nextLine();
        if (current.equals("q")) {
            return count;
        }

        int duplicate = Integer.parseInt(current);

        while (true) {
            if (mxCount < count) {
                mxCount = count;
            }
            current = scanner.nextLine();
            if (current.equals("q")) {
                return count;
            }
            int currentNum = Integer.parseInt(current);
            if (currentNum == duplicate) {
                count += 1;
            } else {
                duplicate = currentNum;
                count = 1;
            }
        }
    }
}
