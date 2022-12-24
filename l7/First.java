public class First {
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
}
