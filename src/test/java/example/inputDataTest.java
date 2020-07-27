package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class inputDataTest {
    @Test
    public void should_return_false_when__given_input_quantity_not_4() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when__given_input_repeat_num() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3,3};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when__given_input_correct() {
        //given
        DigitalInput digitalInput = new DigitalInput();
        int[] inputArr = {1,2,3,4};
        //when
        boolean result = digitalInput.isInputNumLegal(inputArr);
        //then
        assertEquals(true, result);
    }
}
