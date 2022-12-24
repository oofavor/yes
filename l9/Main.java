import java.io.File;
import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String[] strings;

    public static void main(String[] args) {
        String string = "";

        try {
            File file = new File("input.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                string += data + "\n";
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }

        strings = string.split("\n");
        first();
        second();
        third();
        System.out.println(Arrays.toString(strings));
    }

    public static void first() {
        int blank = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].strip();
            String[] divString = strings[i].split(":");
            if (strings[i].length() == 0 || divString.length != 3) {
                strings[i] = null;
                blank += 1;
                continue;
            }

            divString[0] = divString[0].replaceAll(" +", " ").strip();
            divString[1] = divString[1].replaceAll(" +", "").strip();
            divString[2] = divString[2].replaceAll(" +", "").strip();

            strings[i] = String.join(":", divString);
        }

        String[] newStrings = new String[strings.length - blank];
        int currentIdx = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null)
                continue;
            newStrings[currentIdx] = strings[i];
            currentIdx += 1;
        }
        strings = newStrings;
    }

    public static void second() {
        for (int i = 0; i < strings.length; i++) {
            try {
                String[] birthdateString = strings[i].split(":")[1].split("\\.");
                int year = Integer.parseInt(birthdateString[2]);
                int day = Integer.parseInt(birthdateString[0]);
                int month = Integer.parseInt(birthdateString[1]);

                LocalDate birthdate = LocalDate.of(year, month, day);
                LocalDate now = LocalDate.now();

                int age = Period.between(birthdate, now).getYears();

                if (age <= 20)
                    continue;

                String[] name = strings[i].split(":")[0].split(" ");
                if (name.length > 1) {
                    System.out.print(name[1] + " ");
                }
                if (name.length > 2) {
                    System.out.println(name[2]);
                }

            } catch (Exception e) {
                System.out.println("Wrong date");
            }
        }
    }

    public static void third() {
        Pattern phone = Pattern.compile("^((8|+7)[- ]?)?((?d{3})?[- ]?)?[d- ]{7,10}$");

        for (int i = 0; i < strings.length; i++) {
            String[] data = strings[i].split(":");
            String cur = data[0];
            if (cur.split(" ").length < 3 || data[2].length() == 0 || data[1].length() == 0) {
                System.out.println(strings[i]);
            }

            Matcher phoneMatcher = phone.matcher(data[2]);
            if (!phoneMatcher.matches()) {
                System.out.println(strings[i]);
            }
        }
    }
}
