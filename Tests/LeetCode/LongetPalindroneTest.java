package LeetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongetPalindroneTest {
    @Test
    public void canCopeWithEmoryString(){
        assertEquals("", LongetPalindrone.solution(""));
    }

    @Test
    public void canCopeWithStringThatHasOneCharacter(){
        assertEquals(" ", LongetPalindrone.solution(" "));
        assertEquals("a", LongetPalindrone.solution("a"));
    }

    @Test
    public void canCopeWithStringThatHasTwoCharacters(){
        assertEquals("aa", LongetPalindrone.solution("aa"));
        assertEquals("a", LongetPalindrone.solution("ab"));
    }

    @Test
    public void canCopeWithStringThatHasThreeCharacters(){
        assertEquals("a", LongetPalindrone.solution("abc"));
    }

    @Test
    public void canCopeWithStringThatHasMultipleCharacters(){
        assertEquals("aba", LongetPalindrone.solution("abcababc"));
        assertEquals("abccba", LongetPalindrone.solution("abccbabc"));
        assertEquals("a", LongetPalindrone.solution("abcda"));
    }
}