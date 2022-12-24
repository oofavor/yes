public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] a = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] b = new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        Matrix m1 = new Matrix(a);
        m1.multiply(b);
        System.out.println(m1.multiply(b).multiply(0));

    }
}
