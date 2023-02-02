package LeetCode;

public class ZigZagConversion {
    private int len, diagonal;
    private StringBuilder result;
    public String convert (String s, int numRows){
        if(s == null || s.length() == 0)
            return "";
        if(numRows == 1)
            return s;

        result = new StringBuilder("");
        len = s.length();
        diagonal = numRows - 2;

        // Get all character on the first row
        // Each character locates (numRows + diagonal) away from others
        for (int i = 0; i < len; i+=(numRows+diagonal)){
            result.append(s.substring(i, i+1));
        }

        for(int level = 1; level < numRows - 1; level++){
            for(int i = level; i < len; ){
                result.append(s.substring(i, i+1));
                i+=((numRows - (level + 1)) * 2);
                if (i < len){
                    result.append(s.substring(i, i+1));
                    i += (level * 2);
                }
            }
        }

        // Get all character on the first row
        // Each character locates (numRows + diagonal) away from others
        for(int i = numRows - 1; i < len; i+=(numRows+diagonal)){
            result.append(s.substring(i,i+1));
        }


        return result.toString();
    }
}
