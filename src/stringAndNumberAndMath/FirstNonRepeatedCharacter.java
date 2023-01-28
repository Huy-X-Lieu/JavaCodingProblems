package stringAndNumberAndMath;

public class FirstNonRepeatedCharacter {
    public static Character find(String str){
        Character result = null;
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i), i + 1) == -1){
                result = str.charAt(i);
                break;
            }
        }
        return result;
    }
}
