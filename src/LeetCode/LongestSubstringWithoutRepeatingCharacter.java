package LeetCode;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String string) {
        int result = 0;
        int length = string.length();
        if (string == null || length == 0)
            result = 0;
        else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < length - result; i++) {
                s.delete(0, s.length());
                s.append(string.charAt(i));
                int j = i + 1;
                while (j < length && s.indexOf(String.valueOf(string.charAt(j))) == -1){
                    s.append(string.charAt(j++));
                }
                result = result > s.length() ? result : s.length();
            }
        }
        return result;
    }
}
