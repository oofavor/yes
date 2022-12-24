public class Third {

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

}
