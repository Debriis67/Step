import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Palindrome Checker (UC4: Char Array) ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String sanitized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (isPalindrome(sanitized)) {
            System.out.println("Result: \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}