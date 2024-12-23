import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Normalize the string to lowercase
        int left = 0, right = str.length() - 1;

        while (left < right) {
            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            } else {
                // Compare characters at the current pointers
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome!");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
        scanner.close();
    }
}
