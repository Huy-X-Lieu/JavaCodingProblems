package LeetCode;

import javax.swing.*;
import java.util.*;

public class LongetPalindrone {
    public static String solution(String s){
        if(s.length() == 0)
            return "";
        if(s.length() == 1) {
            return s;
        }

        int len = s.length();
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }else{
                return String.valueOf(s.charAt(0));
            }
        }

        String result = String.valueOf(s.charAt(0));
        Set<Character> charArray = new HashSet<>();
        for(char c: s.toCharArray())
            charArray.add(c);

        if(charArray.size() == len)
            result = String.valueOf(s.charAt(0));
        else{
            result = findLongestPalindrone(s, result, len);
        }
        return result;
    }

    private static String findLongestPalindrone(String s, String result, int len) {
        Map<String, ArrayList<Integer>> map = getCharacterMap(s, len);
        ArrayList<Integer> indexes;

        for(Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
            //System.out.println(entry.getKey() + " | " + entry.getValue()); // for debug
            indexes = entry.getValue();
            int size = indexes.size();

            if(indexes.size() == 1)
                continue;

            for (int i = 0; i < size; i++){
                for(int j = size - 1; j > i; j--){
                    //System.out.println("j: " + indexes.get(j)); // for debug
                    String subString = s.substring(indexes.get(i),
                            indexes.get(j)) + s.charAt(indexes.get(j));

                    if(checkPalindrone(subString) == true){
                        result = result.length() >= subString.length()
                                ? result : subString;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private static boolean checkPalindrone(String subString) {
        //System.out.println(subString); // for debug
        int len = subString.length();
        for(int i = 0, j = len - 1; i < j; i++, j--){
            if (subString.charAt(i) != subString.charAt(j))
                return false;
        }
        return true;
    }

    private static Map<String, ArrayList<Integer>> getCharacterMap(String s, int len) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> indexes;
        for(int i = 0; i < len; i++){
            String ch = String.valueOf(s.charAt(i));
            if(map.containsKey(ch) == false){
                indexes = new ArrayList<Integer>();
                indexes.add(i);
                map.put(ch, indexes);
            }else{
                indexes = map.get(ch);
                indexes.add(i);
                map.put(ch, indexes);
            }
        }

        return map;
    }
}
