import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        int userChoice = -1;
        int userInput1;
        int sum = -1, fac = -1, leftmost = -1;
        int length;

        do {
            displayMenu();
            userChoice = scanner.nextInt();

            switch (userChoice) {
            case 1:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();

                //calculates the sum of integers from 1 to number entererd and prints it
                sum = 0;
                for (int i = 1; i <= userInput1; i++) {
                    sum += i;
                }
                System.out.println("Sum of integers from 1 to " + userInput1 + " is: " + sum);
                
                break;
            case 2:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();
                //code that finds the factorial of number entered by teh user and print it
                break;
            case 3:
                System.out.println("Enter the length of sequence");
                length = scanner.nextInt();
                System.out.println("Enter the sequence");
                int oddCount = 0;
                //code that calculates the count of odd integers and prints it
                break;
            case 4:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();
                //code that displays the leftmost digit of a number and prints it
                break;
            case 5:
                System.out.println("Enter the first integer: ");
                int x = scanner.nextInt();
                System.out.println("Enter the second integer: ");
                int y = scanner.nextInt();
                //code that calculates the gcd of the two integers entered and prints it
                break;
            case 6:
                System.out.println("Bye");
                break;
            }
        } while (userChoice != 6);
    }

    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1. Calculate the sum of integers from 1 to m");
        System.out.println("2. Calculate the factorial of a given number");
        System.out.println("3. Calculate the count of odd integers in a given sequence");
        System.out.println("4. Display the leftmost digit of a given number");
        System.out.println("5. Calculate the greatest common divisor of two given integers");
        System.out.println("6. Quit");
    }
}