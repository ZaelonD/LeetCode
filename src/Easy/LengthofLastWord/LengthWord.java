package Easy.LengthofLastWord;

public class LengthWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            if (i != 0 && s.charAt(i - 1) == ' ')
                    break;
            }
        }
        return length;
    }
}
