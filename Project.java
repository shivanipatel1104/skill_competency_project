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
            userChoice = scanner.nextInt();

            switch (userChoice) {
            case 1:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();
                break;
            case 2:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();
                break;
            case 3:
                System.out.println("Enter the length of sequence");
                length = scanner.nextInt();
                System.out.println("Enter the sequence");
                int oddCount = 0;
                break;
            case 4:
                System.out.println("Enter a number:");
                userInput1 = scanner.nextInt();
                break;
            case 5:
                System.out.println("Enter the first integer: ");
                int x = scanner.nextInt();
                System.out.println("Enter the second integer: ");
                int y = scanner.nextInt();
                break;
            case 6:
                System.out.println("Bye");
                break;
            }
        } while (userChoice != 6);
    }
}