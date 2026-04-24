package a_Simple;

public class G_1Plus {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);

        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits are 9, we need an extra digit at the beginning
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Set the first digit to 1
        return newDigits;
    }
}
