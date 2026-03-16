import java.util.Scanner;
import java.util.Stack;
class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) return false;


        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : cleanStr.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return cleanStr.equals(reversedStr.toString());
    }
}
class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("=== UC11: OOP-Based Palindrome Checker (Stack Method) ===");
        System.out.print("Enter text: ");
        String userInput = scanner.nextLine();

        boolean isPalindrome = service.checkPalindrome(userInput);

        if (isPalindrome) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Failed. It is not a palindrome.");
        }

        scanner.close();
    }
}