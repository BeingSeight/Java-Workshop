import java.util.Scanner;

// Check whether a string is a Palindrome or not
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        sc.close();
        
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
