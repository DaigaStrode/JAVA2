package lesson4;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string input: ");

        String s = scanner.nextLine();

        System.out.println(myAtoi(s));
    }
    /**
     * Method filters out all digits in a given string and converts them to an int in the output
     * it is sensitive to entering a negative number with sign "-" in the start of the string
     * in case of no digits entered, the result is "0"
     * @param s -the user can enter any combination of symbols and spaces in a string
     * @return -the return is an int
     */
    public static int myAtoi(String s) {
        String numbers = "0";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                numbers += String.valueOf(s.charAt(i));
            }
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (s.charAt(i) == s.charAt(0)) {
                    numbers = String.valueOf(s.charAt(i));
                }
            } else {
                continue;
            }
        }

        int n = Integer.parseInt(numbers);
        return n;
    }
}
