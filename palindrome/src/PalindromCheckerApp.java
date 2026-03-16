class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "level";
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("Input text: " + original);
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Input text: " + original);
            System.out.println("Reversed text: " + reversed);
            System.out.println(" Is it a Palindrome? : false");
        }
    }
}