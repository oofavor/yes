public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }

    public Matrix sum(int[][] b) {
        if (!canAdd(matrix, b))
            return null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += b[i][j];
            }
        }
        return this;
    }

    public static Matrix sum(int[][] a, int[][] b) {
        if (!canAdd(a, b))
            return null;
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return new Matrix(c);
    }

    public Matrix multiply(int b) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= b;
            }
        }
        return this;
    }

    public static Matrix multiply(int[][] a, int b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] * b;
            }
        }
        return new Matrix(c);
    }

    public Matrix multiply(int[][] b) {
        if (!canMultiply(matrix, b))
            return null;

        int[][] c = new int[matrix.length][b[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < matrix[0].length; k++) {
                    c[i][j] += matrix[i][k] * b[k][j];
                }
            }
        }
        return new Matrix(c);
    }

    public static Matrix multiply(int[][] a, int[][] b) {
        if (!canMultiply(a, b))
            return null;

        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return new Matrix(c);
    }

    public static boolean canMultiply(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i].length != b.length)
                return false;
        return true;
    }

    public static boolean canAdd(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i].length != b[i].length)
                return false;
        return true;
    }

}
