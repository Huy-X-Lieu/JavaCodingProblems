package stringAndNumberAndMath;

public class lettersAndWordsReversing {
    public static String reverse(String str) {
        int index = 0;
        char[] chaArray = str.toCharArray();
        int stringLength = str.length();
        while (index < stringLength - 1 - index) {
            char temp = chaArray[index];

            chaArray[index] = chaArray[stringLength - 1 - index];
            chaArray[stringLength - 1 - index] = temp;

            index++;
        }
        return new String(chaArray);
    }

}
