package Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomInt {
    public static int romanToInt(String s) {

        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int cur;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            cur = map.get(s.charAt(i));
            if (cur < prev)
                sum -= cur;
            else
                sum += cur;
            prev = cur;
        }
        return sum;
    }


    public static int romanToInt2(String s) {

        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1)))
                sum += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            else
                sum += map.get(s.charAt(i));
        }
        return sum;
    }
}
