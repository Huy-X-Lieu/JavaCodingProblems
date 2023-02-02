package LeetCode;

public class ReverseInteger {
    public int reverse(int x){

        int negative = x < 0 ? -1: 1;
        long result = 0;
        int e = 0;
        x = Math.abs(x);

        while(x / 10 > 0) {
            result += x % 10;
            result *= 10;
            x /= 10;
            e++;
        }
        result += x;
        if(result < Integer.MAX_VALUE && result > Integer.MIN_VALUE)
            return (int)result * negative;
        return 0;
    }
}
