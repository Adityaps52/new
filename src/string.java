import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String Followed by a Number:");
        String str = scanner.next();
        int num = scanner.nextInt();

        System.out.println("You entered: " + str + " and " + num);

        scanner.close();
    }
}