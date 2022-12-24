public class Third {
    static void third48(int k1, int k2, int m, int n, int[][] arr) {
        for (int i = 0; i < m; i++) {
            int swap = arr[i][k1 - 1];
            arr[i][k1 - 1] = arr[i][k2 - 1];
            arr[i][k2 - 1] = swap;
        }
    }

    static void third50(int m, int n, int[][] arr) {
        for (int i = 0; i < n; i++) {
            int mn = Integer.MAX_VALUE;
            int mx = Integer.MIN_VALUE;
            int mnI = 0;
            int mxI = 0;
            for (int j = 0; j < m; j++) {
                if (arr[j][i] < mn) {
                    mn = arr[j][i];
                    mnI = j;
                }
                if (arr[j][i] > mx) {
                    mx = arr[j][i];
                    mxI = j;
                }
            }

            arr[mnI][i] = mx;
            arr[mxI][i] = mn;
        }
    }

    static void third51(int m, int n, int[][] arr) {
        int mn = Integer.MAX_VALUE;
        int mnI = 0;
        int mx = Integer.MIN_VALUE;
        int mxI = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < mn) {
                    mn = arr[i][j];
                    mnI = i;
                }

                if (arr[i][j] > mx) {
                    mx = arr[i][j];
                    mxI = i;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int swap = arr[mnI][i];
            arr[mnI][i] = arr[mxI][i];
            arr[mxI][i] = swap;
        }
    }

    static int[][] third61(int k, int m, int n, int[][] arr) {
        int[][] newArr = new int[m - 1][n];
        for (int i = 0; i < m; i++) {
            if (i + 1 == k) {
                continue;
            }
            if (k < i + 1) {
                newArr[i - 1] = arr[i];
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}
