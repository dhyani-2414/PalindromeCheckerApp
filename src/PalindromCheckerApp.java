import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String Text = sc.nextLine();

        String reversed = "";

        for(int i = Text.length() - 1; i >= 0; i--) {
            reversed += Text.charAt(i);
        }

        if(Text.equals(reversed)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}