import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // forth84(10, arr);
        System.out.println(Arrays.toString(arr));
    }
<<<<<<< HEAD
=======

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

    static void third51(int n, int[] a, int[] b) {
        // я не уверен на счет типов, т.к. в задании не указаны.
        // поэтому альтернативным решением было бы использование женериков
        // это относиться ко всем последующим

        for (int i = 0; i < n; i++) {
            int swap = a[i];
            a[i] = b[i];
            b[i] = swap;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }

    static void third53(int n, int[] a, int[] b) {
        int[] c = new int[n];
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i])
                curr = a[i];
            else
                curr = b[i];
            c[i] = curr;
        }
    }

    static double[] third59(int n, int[] a) {
        double[] b = new double[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            b[i] = sum / (i + 1.0);
        }
        return b;
    }

    static void forth70(int n, int[] a) {
        for (int i = 0; i < n / 2; i++) {
            int swap = a[i];
            a[i] = a[n / 2 + i];
            a[n / 2 + i] = swap;
        }
    }

    static void forth74(int n, int[] a) {
        int mx = Integer.MIN_VALUE;
        int mxI = 0;
        int mn = Integer.MAX_VALUE;
        int mnI = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > mx) {
                mx = a[i];
                mxI = i;
            }
            if (a[i] < mn) {
                mn = a[i];
                mnI = i;
            }
        }

        if (mnI > mxI) {
            int swap = mnI;
            mnI = mxI;
            mxI = swap;
        }

        for (int i = mnI + 1; i < mxI; i++) {
            a[i] = 0;
        }
    }

    static void forth76(int n, int[] arr) {
        boolean[] maxs = new boolean[n];
        if (n == 0)
            return;

        if (n == 1) {
            arr[0] = 0;
            return;
        }

        if (n == 2) {
            if (arr[0] > arr[1])
                arr[0] = 0;
            else
                arr[1] = 0;

            return;
        }

        for (int i = 1; i < n - 1; i++) {
            if (i == n - 2) {
                if (arr[n - 1] > arr[n - 2]) {
                    maxs[n - 1] = true;
                    break;
                }
            }
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                maxs[i] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (maxs[i]) {
                arr[i] = 0;
            }
        }
    }

    static void forth84(int n, int[] arr) {
        int last = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = last;
    }
>>>>>>> a69fe1bef7473ebe62ef543105cb9ccdc75d85a4
}
