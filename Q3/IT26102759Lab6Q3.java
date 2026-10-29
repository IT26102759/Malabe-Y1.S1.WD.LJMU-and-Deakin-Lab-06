import java.util.Scanner;

public class IT26102759Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter positive integers (terminate input with -99):");
        
        double sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Terminate condition
            if (num == -99) {
                break;
            }

            // Negative Validation (-99 arenna anith negative okkoma invalid)
            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue; // aye loop eka udata yanawa, count wenne na
            }

            // Valid number
            sumOfSquares += num * num; // Math.pow(num, 2)
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo positive numbers entered.");
        }

        scanner.close();
    }
}