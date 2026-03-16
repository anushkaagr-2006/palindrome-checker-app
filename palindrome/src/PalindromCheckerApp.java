import java.util.Scanner;

class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Recursive Palindrome Checker ---");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (isPalindrome(cleanInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}