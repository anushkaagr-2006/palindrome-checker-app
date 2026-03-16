class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class UseCase8PalindromeCheckerApp {
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "madam";
        Node head = new Node(text.charAt(0));
        Node current = head;

        for (int i = 1; i < text.length(); i++) {
            current.next = new Node(text.charAt(i));
            current = current.next;
        }

        boolean result = isPalindrome(head);

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + result);
    }
}