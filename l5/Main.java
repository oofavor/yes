import java.util.Random;

public class Main {
    public static void main(String[] args) {
        first();
        second();
        third();
        forth();
        fifth();
    }

    static void first() {
        // если есть вопросы по поводу вывода массивов
        // то ответ здесь то, что время > память
        int[] arr = new int[10];
        Random random = new Random();
        String reverseStrArr = "";

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(21) + 10;
            System.out.print(arr[i] + " ");
            reverseStrArr = arr[i] + " " + reverseStrArr;
        }

        System.out.println("\n" + reverseStrArr);
    }

    static void second() {
        int[] arr = new int[30];
        Random random = new Random();
        int mx = 0;
        int mn = 100;
        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
            if (mx < arr[i]) {
                mx = arr[i];
            }
            if (mn > arr[i]) {
                mn = arr[i];
            }
        }
        System.out.println("\nmin: " + mn + " max: " + mx);
    }

    static void third() {
        int[] arr = new int[10];
        Random random = new Random();
        String moddedArr = "";
        for (int i = 0; i < 10; i++) {
            int current = random.nextInt(500);
            moddedArr += current + " ";
            if (random.nextBoolean())
                current = -current;
            arr[i] = current;
            System.out.print(current + " ");
        }
        System.out.println("\n" + moddedArr);
    }

    static void forth() {
        int[][] arr1 = new int[10][10];
        int[][] arr2 = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr1[i][j] = random.nextInt();
                arr2[i][j] = random.nextInt();
                arr2[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void fifth() {
        int[][] arr = new int[10][10];
        Random random = new Random();
        int mnRow = Integer.MAX_VALUE;
        int mnCol = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = random.nextInt();
                if (arr[i][j] < mnCol) {
                    mnCol = arr[i][j];
                }
            }
            System.out.println("Минимальное для строчки " + i + " = " + mnCol);
            mnCol = Integer.MAX_VALUE;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[j][i] < mnRow) {
                    mnRow = arr[j][i];
                }
            }
            System.out.println("Минимальное для столбца " + i + " = " + mnRow);
            mnRow = Integer.MAX_VALUE;
        }
    }
}