public class Main {
    public static void main(String[] args) {
    }

    public static String formatTemperature(double temp) {
        if (temp < 10) {
            return "холодно";
        }
        if (temp <= 25) {
            return "тепло";
        }
        return "жарко";
    }

    public static int getPosition(String command, int count, int currentPos) {
        if (command == "вперед") {
            if (currentPos + count > 99) {
                currentPos = 99;
            } else {
                currentPos += count;
            }
        }
        if (command == "назад") {
            if (currentPos - count < 0) {
                currentPos = 0;
            } else {
                currentPos -= count;
            }
        }
        return currentPos;
    }

    public static double calculateTaxes(int income) {
        if (income < 35000) {
            return income * 0.2;
        }
        if (income < 100000) {
            return income * 0.3;
        }
        return income * 0.4;
    }
}
