package stringAndNumberAndMath;
import java.util.regex.*;

public class digitsChecking {
    public static boolean check(String str){
        var pattern = "[0-9]+";
        return str.matches(pattern);
    }
}
