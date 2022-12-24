public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        R3Vector v1 = new R3Vector(-1, 2, -3);
        R3Vector v2 = new R3Vector(0, -4, 1);
        v1.vectorMultiply(v2);
        System.out.println(v1);
    }
}
