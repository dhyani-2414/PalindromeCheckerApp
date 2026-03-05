import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "madam";
        System.out.println("Input text: " + input);

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}