import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, };
        // first12(2, 5, arr);

<<<<<<< HEAD
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }
        // int[][] aq = { { 1, 2, 3, 4, 5 },
        // { 16, 17, 18, 19, 6 },
        // { 15, 24, 25, 20, 7 },
        // { 14, 23, 22, 21, 8 },
        // { 13, 12, 11, 10, 9 } };
        int[][] aq = { { 1, 16, 15, 14, 13 },
                { 2, 17, 24, 23, 12 },
                { 3, 18, 25, 22, 11 },
                { 4, 19, 20, 21, 10 },
                { 5, 6, 7, 8, 9 } };
    }

=======
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int[][] aq = { { 1, 2, 3, 4, 5 },
                { 16, 17, 18, 19, 6 },
                { 15, 24, 25, 20, 7 },
                { 14, 23, 22, 21, 8 },
                { 13, 12, 11, 10, 9 } };
        // int[][] aq = { { 1, 16, 15, 14, 13 },
        // { 2, 17, 24, 23, 12 },
        // { 3, 18, 25, 22, 11 },
        // { 4, 19, 20, 21, 10 },
        // { 5, 6, 7, 8, 9 } };
        first15(5, aq);
    }

    static void first11(int m, int n, int[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][n - 1 - j] + " ");
                }
            }
            System.out.println();
        }
    }

    static void first12(int m, int n, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    System.out.print(arr[j][i] + " ");
                } else {
                    System.out.print(arr[m - 1 - j][i] + " ");
                }
            }
            System.out.println();
        }
    }

    static void first15(int m, int[][] arr) {
        int ofset = (m - 1) / 2;
        for (int of = 0; of < ofset; of++) {
            int end = m - of - 1;
            for (int i = of; i < end; i++) {
                System.out.println(arr[of][i]);
            }
            for (int i = of; i < end; i++) {
                System.out.println(arr[i][end]);
            }
            for (int i = end; i > of; i--) {
                System.out.println(arr[end][i]);
            }
            for (int i = end; i > of; i--) {
                System.out.println(arr[i][of]);
            }
        }
        System.out.println(arr[m / 2][m / 2]);
    }

    static void first16(int m, int[][] arr) {
        int ofset = (m - 1) / 2;
        for (int of = 0; of < ofset; of++) {
            int end = m - of - 1;
            for (int i = of; i < end; i++) {
                System.out.println(arr[i][of]);
            }
            for (int i = of; i < end; i++) {
                System.out.println(arr[end][i]);
            }
            for (int i = end; i > of; i--) {
                System.out.println(arr[i][end]);
            }
            for (int i = end; i > of; i--) {
                System.out.println(arr[of][i]);
            }
        }
        System.out.println(arr[m / 2][m / 2]);
    }

    static int second28(int m, int n, int[][] arr) {
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentMax = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (currentMax < arr[j][i]) {
                    currentMax = arr[j][i];
                }
            }
            if (mn > currentMax) {
                mn = currentMax;
            }
        }
        return mn;
    }

    static int[] second29(int m, int n, int[][] arr) {
        int[] lesser = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            double average = sum / n;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < average) {
                    count += 1;
                }
            }
            lesser[i] = count;
        }
        return lesser;
    }

    static int second39(int m, int n, int[][] arr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isSame = true;
            for (int j = 0; j < m; j++) {
                for (int c = j + 1; c < m; c++) {
                    if (arr[j][i] == arr[c][i]) {
                        isSame = false;
                        break;
                    }
                }
            }
            if (isSame) {
                count += 1;
            }
        }
        return count;
    }

    static int second42(int m, int n, int[][] arr) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            boolean isAsc = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[i][j] > arr[i][j + 1]) {
                    isAsc = false;
                    break;
                }
            }
            if (isAsc) {
                count += 1;
            }
        }
        return count;
    }

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

            for (int j = 0; j < n; j++) {
                if (k < i + 1) {
                    newArr[i - 1][j] = arr[i][j];
                } else {
                    newArr[i][j] = arr[i][j];
                }
            }
        }
        return newArr;
    }
>>>>>>> a69fe1bef7473ebe62ef543105cb9ccdc75d85a4
}