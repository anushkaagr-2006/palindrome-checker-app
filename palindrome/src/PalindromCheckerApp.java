import java.util.*;

class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Palindrome Algorithm Performance Comparison ===");
        System.out.print("Enter a long string to test efficiency: ");
        String input = scanner.nextLine();
        long start1 = System.nanoTime();
        boolean res1 = checkTwoPointer(input);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;
        long start2 = System.nanoTime();
        boolean res2 = checkStack(input);
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        long start3 = System.nanoTime();
        boolean res3 = checkDeque(input);
        long end3 = System.nanoTime();
        long duration3 = end3 - start3;
        System.out.println("\n--- Performance Results ---");
        System.out.printf("%-20s %-15s %-15s%n", "Algorithm", "Result", "Time (nanos)");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %-15b %-15d%n", "Two-Pointer", res1, duration1);
        System.out.printf("%-20s %-15b %-15d%n", "Stack (LIFO)", res2, duration2);
        System.out.printf("%-20s %-15b %-15d%n", "Deque (Double-End)", res3, duration3);

        System.out.println("\nNote: 1,000,000 nanoseconds = 1 millisecond.");
        scanner.close();
    }
    public static boolean checkTwoPointer(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
    public static boolean checkStack(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        for (char c : clean.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
    public static boolean checkDeque(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : clean.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}