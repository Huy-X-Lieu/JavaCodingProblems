package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    ZigZagConversion c = new ZigZagConversion();
    @Test
    public void canSolveOneRow(){
        assertEquals("abcd",c.convert("abcd", 1));
    }

    @Test
    public void canSolveEmptyString(){
        assertEquals("", c.convert("", 10));
        assertEquals("", c.convert(null, 10));
    }

    @Test
    public void canSolveTwoRows(){
        assertEquals("acebdf", c.convert("abcdef", 2));
        assertEquals("acebd", c.convert("abcde", 2));
        assertEquals("a", c.convert("a", 2));
    }

    @Test
    public void canSolevThreeRows(){
        assertEquals("PAHNAPLSIIGYIR", c.convert("PAYPALISHIRING", 3));
    }

    @Test
    public void canSolveFourRows(){
        assertEquals("PINALSIGYAHRPI", c.convert("PAYPALISHIRING", 4));

    }
}