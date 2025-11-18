import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check if original equals reversed
        if (str.equals(reversed))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }
}
