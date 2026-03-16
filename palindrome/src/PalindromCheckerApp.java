class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        String text = "radar";
        char[] charArray = text.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}