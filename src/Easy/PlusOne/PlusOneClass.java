package Easy.PlusOne;

public class PlusOneClass {
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (digits[index] == 9) {
            digits[index] = 0;
            index--;
            if (index < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (index >= 0) {
            digits[index]++;
        }
        return digits;
    }
}
