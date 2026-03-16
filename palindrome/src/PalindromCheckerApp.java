import java.util.Deque;
import java.util.ArrayDeque;

class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "madam";
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}