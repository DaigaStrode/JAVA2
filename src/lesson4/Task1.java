package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers there will be in the array: ");

        int [] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter next array value: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

        System.out.println();

        int max1 = numbers[0];
        int max2 = numbers[0];
        int max3 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max1 < numbers[i]){
                max3 = max2;
                max2 = max1;
                max1 = numbers[i];
            }
        }
        System.out.println("The third largest of array numbers is: " + max3);

    }
}
