public class Main {
    public static void main(String[] args) {
        System.out.println(f1("null", 'u'));
        System.out.println(f2("null", "ull"));
        System.out.println(f3("null", "null", 3));
        System.out.println(f4("null", "ull"));
        System.out.println(f5("null", "ull"));
    }

    static int f1(String str, char symb) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symb)
                return i;
        }
        return -1;
    }

    static int f2(String str, String substr) {
        int subLen = substr.length();
        for (int i = 0; i < str.length() - subLen + 1; i++) {
            if (str.charAt(i) != substr.charAt(0))
                continue;

            boolean yes = true;
            for (int j = 0; j < subLen; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    yes = false;
                    break;
                }
            }
            if (yes)
                return i;
        }

        return -1;
    }

    static boolean f3(String str1, String str2, int n) {
        if (str1.length() < n || str2.length() < n)
            return false;

        for (int i = 0; i < n; i++) {
            if (!(str1.charAt(i) == str2.charAt(i)))
                return false;
        }
        return true;
    }

    static int f4(String str1, String str2) {
        int n = 0;
        if (str1.length() > str2.length())
            n = str2.length();
        else
            n = str1.length();

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) > str2.charAt(i))
                return -1;

            if (str2.charAt(i) > str1.charAt(i))
                return 1;
        }
        if (str1.length() == str2.length())
            return 0;

        if (str1.length() < str2.length())
            return -1;
        return 1;
    }

    static String f5(String str1, String str2) {
        return str1 + str2;
    }
}
