public class Second {

    static void second19(int[] arr) {
        int last = 0;
        for (int i = 1; i < 9; i++) {
            if (arr[0] < arr[i] && arr[i] < arr[9]) {
                last = i;
            }
        }
        System.out.println(last + 1);
    }

    static void second26(int n, int[] arr) {
        if (n < 2) {
            System.out.println(0);
        }
        int prime = arr[0] % 2;
        boolean yes = true;
        for (int i = 1; i < n; i++) {
            if ((arr[i] % 2) == prime) {
                System.out.println(i + 1);
                yes = false;
                break;
            }
            prime = arr[i] % 2;
        }
        if (yes) {
            System.out.println(0);
        }
    }

    static void second33(int n, int[] arr) {
        if (n == 1) {
            System.out.println(0);
            return;
        }

        if (n == 2) {
            if (arr[0] > arr[1])
                System.out.println(0);
            else
                System.out.println(1);

            return;
        }

        if (arr[n - 1] > arr[n - 2]) {
            System.out.println(n - 1);
            return;
        }

        int last = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                last = i;
            }
        }
        if (last != 0) {
            System.out.println(last);
        }
    }

    static void second41(int n, int[] arr) {
        int mx = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < n - 1; i++) {
            if (mx < arr[i] + arr[i + 1]) {
                idx = i;
                mx = arr[i] + arr[i + 1];
            }
        }
        System.out.println(arr[idx] + " " + arr[idx + 1]);
    }

}
