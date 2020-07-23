package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckInputLegalTest {
    @Test
    public void should_return_false_when__given_input_quantity_not_4() {
        //given
        CheckInputLegal checkInputLegal = new CheckInputLegal();
        int[] inputArr = {1,2,3};
        //when
        boolean result = checkInputLegal.isInputLegal(inputArr);
        //then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when__given_input_repeat_num() {
        //given
        CheckInputLegal checkInputLegal = new CheckInputLegal();
        int[] inputArr = {1,2,3,3};
        //when
        boolean result = checkInputLegal.isInputLegal(inputArr);
        //then
        assertEquals(false, result);
    }

    @Test
    public void should_return_false_when__given_input_correct() {
        //given
        CheckInputLegal checkInputLegal = new CheckInputLegal();
        int[] inputArr = {1,2,3,4};
        //when
        boolean result = checkInputLegal.isInputLegal(inputArr);
        //then
        assertEquals(true, result);
    }
}
