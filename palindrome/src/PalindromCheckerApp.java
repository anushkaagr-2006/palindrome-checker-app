import java.util.Stack;

class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }
        if (text.equals(reversed)) {
            System.out.println("Input text: " + text);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Input text: " + text);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : false");
        }
    }
}