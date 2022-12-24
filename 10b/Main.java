public class Main {
    public static void main(String[] args) {
        System.out.println(f5c(5, 5));
    }

    static int f1a(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    static int f1b(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        if (a > b)
            return f1b(a % b, b);

        return f1b(a, b % a);
    }

    static int f2(int a, int n) {
        if (n == 0)
            return 1;
        if (1 == n)
            return a;

        return f2(a, n - 1) * a;
    }

    static int f3(int a) {
        if (a > 10)
            return f3(a / 10);
        return a;
    }

    static String f4(int a) {
        if (a < 10)
            return f4helper(a);
        return f4(a / 10) + f4helper(a % 10);
    }

    static String f4helper(int a) {
        return a + "";
    }

    static int f5a(int a, int n) {
        if (a == 0)
            return 0;
        String power = Integer.toBinaryString(n);
        int res = 1;
        for (int i = 0; i < power.length(); i++) {
            if (power.charAt(i) != '1')
                continue;
            res *= f2(a, f2(2, power.length() - i - 1));
        }
        return res;
    }

    static int f5b(int a, int n) {
        if (a == 0)
            return 0;

        int res = 1;
        while (n > 0) {
            if (n % 2 == 1)
                res *= a;
            a *= a;
            n >>= 1;
        }

        return res;
    }

    static int f5c(int a, int n) {
        if (a == 0)
            return 0;
        if (n > 0)
            if (n % 2 == 1)
                return f5c(a * a, n >> 1) * a;
            else
                return f5c(a * a, n >> 1);
        return 1;
    }
}
