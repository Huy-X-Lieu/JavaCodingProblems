import LeetCode.LongestSubstringWithoutRepeatingCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharacterTest {
    @Test
    public void ReturnZeroWhenReceiveEmptyString(){
        // Arrange
        String string = " ";
        int expectedResult = 1;

        // Act
        int result = LongestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring(string);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void ReturnOneWhenReceiveStringWithoneCharacter(){
        // Arrange
        String string = "a";
        int expectedResult = 1;

        // Act
        int result = LongestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring(string);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void CanReturnTheLengthOfLongestSubstringAtTheBeginingOfInputString(){
        // Arrange
        String string = "abcabc";
        int expectedResult = 3;

        // Act
        int resutl = LongestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring(string);

        // Assert
        assertEquals(expectedResult, resutl);
    }

    @Test
    public void CanReturnTheLongestSubstringLengthLocateAnyWhereInInputString(){
        // Arrange
        String string = "au";
        int expectedResult = 2;

        // Act
        int result = LongestSubstringWithoutRepeatingCharacter.lengthOfLongestSubstring(string);

        // Assert
        assertEquals(expectedResult, result);
    }
}