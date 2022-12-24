public class Second {
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
}
