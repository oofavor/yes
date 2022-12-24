import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        f5();
    }

    public static void f1() {
        int count = 0;
        int yes = -1;
        int current;
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                count += 1;
                if (current == 0 && yes == -1)
                    yes = count;
                if (yes == -1)
                    System.out.println(0);
                else
                    System.out.println(yes);
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f2() {
        int count = 1;
        int prev = Integer.MAX_VALUE;
        int current;
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                if (current > prev) {
                    count += 1;
                }
                prev = current;
                System.out.println(count);
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f3() {
        int max = Integer.MIN_VALUE;
        int sndMax = Integer.MIN_VALUE;
        boolean sndMaxExist = false;
        int current;
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                if (current < max && current > sndMax) {
                    sndMax = current;
                    sndMaxExist = true;
                }
                if (current > max) {
                    if (!(max == sndMax)) {
                        sndMax = max;
                        sndMaxExist = true;
                    }
                    max = current;
                }

                if (!sndMaxExist) {
                    System.out.println("No");
                } else {
                    System.out.println(sndMax);
                }
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f4() {
        int a = 0;
        int b = 0;
        int len = 1;
        int maxLen = 1;
        int count = 0;
        int asc = 1;

        while (true) {
            try {
                String currentLine = scanner.nextLine();
                if (currentLine.equals("q")) {
                    break;
                }
                a = b;
                b = Integer.parseInt(currentLine);

                if ((a - b == -1 || a - b == 1) && !(b == a || b == a + asc)) {
                    asc = b - a;
                    len = 1;
                }

                count += 1;

                if (count == 1) {
                    System.out.println(maxLen + " INP");
                    continue;
                }

                if (b == a || b == a + asc) {
                    len += 1;
                    if (maxLen < len) {
                        maxLen = len;
                    }
                } else {
                    len = 1;
                }

                System.out.println(maxLen + " INP");
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f5() {
        int count = 0;
        boolean yes = false;
        int current;
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                if (current == 1 && !yes) {
                    yes = true;
                    count += 1;
                }
                if (current == 0) {
                    yes = false;
                }

                System.out.println(count + " INP");
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f6() {
        int count = 0;
        int current;
        int next = 1;
        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                if (current == next) {
                    next += 1;
                    if (current == 6) {
                        count += 1;
                        next = 1;
                    }
                } else {
                    next = 1;
                }
                System.out.println(count);
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f7() {
        int count = 0;
        int current;
        int next = 1;
        int iter = 0;

        while (true) {
            String currentLine = scanner.nextLine();
            if (currentLine.equals("q"))
                break;
            try {
                current = Integer.parseInt(currentLine);
                if (current == next) {
                    if (current == 2) {
                        iter += 1;
                        next = 1;
                    } else {
                        next = 2;
                    }
                } else {
                    iter = 0;
                    next = 1;
                }
                if (iter == 3) {
                    count += 1;
                    iter = 2;
                }
                System.out.println(count);
            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }
    }

    public static void f8() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int count = 0;
        int maxes = 1;

        while (true) {
            try {
                String currentLine = scanner.nextLine();
                if (currentLine.equals("q"))
                    break;

                a = b;
                b = c;
                c = Integer.parseInt(currentLine);
                count += 1;

                if (count == 2) {
                    maxes = 0;
                    if (b > c)
                        maxes += 1;
                }

                if (count > 2) {
                    if (b > c && b > a)
                        maxes += 1;
                }
                if (count >= 2 && c > b) {
                    System.out.println(maxes + 1 + " INP");
                } else {
                    System.out.println(maxes + " INP");
                }
            } catch (Exception e) {
                System.out.println("Wrong Input");
            }
        }
    }

}