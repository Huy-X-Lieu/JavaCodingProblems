package stringAndNumberAndMath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class lettersAndWordsReversingTest {

    @Test
    public void CanReverseWords() throws Exception{
        // Arrange
        String target = "hello hallo";

        //Act
        String result = lettersAndWordsReversing.reverse(target);

        // Assert
        assertEquals("ollah olleh", result);
    }
}