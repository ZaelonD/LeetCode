package Easy.PalindromeNumber;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) + str1;
        }
        return str.equals(str1);
    }

    public static boolean isPalindrome1(int x) {
        String str = Integer.toString(x);
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            str1.insert(0, str.charAt(i));
        }
        return str.equals(str1.toString());
    }

    public static boolean isPalindrome2(int x) {

        if (x < 0 || x % 10 == 0 && x != 0)
            return false;
        int invertedNum = 0;
        int copyOfX = x;

        while (copyOfX != 0) {
            invertedNum = invertedNum * 10 + copyOfX % 10;
            copyOfX = copyOfX / 10;
        }
        return invertedNum == x;
    }

    public static boolean isPalindrome3(int x) {
        StringBuilder str = new StringBuilder();
        str.append(x);
        return str.toString().equals(String.valueOf(str.reverse()));

    }
}
