package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger r = new ReverseInteger();
    @Test
    public void canReversePositiveNumber(){
        assertEquals(0, r.reverse(0));
        assertEquals(1, r.reverse(1));
        assertEquals(1, r.reverse(10));
        assertEquals(123, r.reverse(321));
        assertEquals(0, r.reverse(1534236469));
    }

    @Test void canReverseNegativeNumber(){
        assertEquals(-1, r.reverse(-1));
        assertEquals(-1, r.reverse(-10));
        assertEquals(-123, r.reverse(-321));
        assertEquals(0, r.reverse(-2147483648));
    }

}