import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, String[]> numbers = new HashMap<String, String[]>();

    static String[] zero = {
            " ---- ",
            "|    |",
            "|    |",
            "|    |",
            " ---- "
    };
    static String[] one = {
            "   |  ",
            "   |  ",
            "   |  ",
            "   |  ",
            "   |  ",
    };
    static String[] two = {
            " ---- ",
            "     |",
            " ---- ",
            "|     ",
            " ---- "
    };
    static String[] three = {
            " ---- ",
            "     |",
            " ---- ",
            "     |",
            " ---- ",
    };
    static String[] four = {
            "|    |",
            "|    |",
            " ---- ",
            "     |",
            "     |",
    };
    static String[] five = {
            " ---- ",
            "|     ",
            " ---- ",
            "     |",
            " ---- ",
    };
    static String[] six = {
            " ---- ",
            "|     ",
            " ---- ",
            "|    |",
            " ---- ",
    };
    static String[] seven = {
            "----- ",
            "     |",
            "     |",
            "     |",
            "     |",
    };
    static String[] eight = {
            " ---- ",
            "|    |",
            " ---- ",
            "|    |",
            " ---- ",
    };
    static String[] nine = {
            " ---- ",
            "|    |",
            " ---- ",
            "     |",
            " ---- ",
    };

    public static void main(String[] args) {
        numbers.put("0", zero);
        numbers.put("1", one);
        numbers.put("2", two);
        numbers.put("3", three);
        numbers.put("4", four);
        numbers.put("5", five);
        numbers.put("6", six);
        numbers.put("7", seven);
        numbers.put("8", eight);
        numbers.put("9", nine);

        String inputNumber = "";

        // input
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            inputNumber = myReader.nextLine();
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // output
        try {
            FileWriter myWriter = new FileWriter("output.txt");
            for (int j = 0; j < 5; j++) {
                String current = "";
                for (int i = 0; i < inputNumber.length(); i++) {
                    current += numbers.get(String.valueOf(inputNumber.charAt(i)))[j] + " ";
                }
                current += "\n";
                myWriter.write(current);
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
