import java.util.Scanner;

public class IT26102759Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        double average;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }

        average = sum / 10.0;

        System.out.println();
        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}