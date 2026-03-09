import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static boolean isPalindrome(String text) {

        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        // Compare front and rear characters
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase().replaceAll("\\s+", "");

        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}