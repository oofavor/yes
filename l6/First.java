public class First {
    static void first1(int n) {
        int[] arr = new int[n];
        int current = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = current;
            current += 2;
            System.out.print(arr[i] + " ");
        }
    }

    static void first6(int n, int a, int b) {
        int[] arr = new int[n];
        arr[0] = a;
        arr[1] = b;
        int current = a + b;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i = 2; i < n; i++) {
            arr[i] = current;
            current += arr[i];
            System.out.println(arr[i]);
        }
    }

    static void first10(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0)
                System.out.println(arr[i]);
        }
    }

}
