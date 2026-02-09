import java.util.Scanner;

public class pract1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
        } while (num <= 0); // Loop continues as long as num is not positive

        System.out.println("You entered: " + num);
        scanner.close();
    }
}