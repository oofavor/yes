public class Forth {
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

        if (arr[n - 1] > arr[n - 2]) {
            maxs[n - 1] = true;
        }

        for (int i = 1; i < n - 1; i++) {
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
}
