import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder reversed=new StringBuilder(s).reverse();
        return s.equals(reversed.toString());
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter string: ");
        String input=scanner.nextLine();
        scanner.close();
        if (isPalindrome(input)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }
    }
}
