import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "civic";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}