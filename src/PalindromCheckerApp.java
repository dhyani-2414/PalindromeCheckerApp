public class PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";
        boolean result = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome?: " + result);
    }

}