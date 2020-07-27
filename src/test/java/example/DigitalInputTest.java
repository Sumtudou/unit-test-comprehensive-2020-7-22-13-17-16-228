package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DigitalInputTest {
    @Test
    public void should_return_false_when_is_input_array_correct_given_123() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertFalse(result);
    }

    @Test
    public void should_return_false_when_is_input_array_correct_given_1233() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3,3};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertFalse(result);
    }

    @Test
    public void should_return_true_when_is_input_array_correct_given_1234() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3,4};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertTrue(result);
    }

}
