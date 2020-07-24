package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_guess_given_all_correct() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("4A0B", res);

    }

    @Test
    public void should_return_0A0B_when_guess_given_all_incorrect() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {5, 6, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("0A0B", res);

    }

    @Test
    public void should_return_2A0B_when_guess_given_some_num_correct_position_and_value_but_some_incorrect() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {1, 2, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("2A0B", res);
    }

    @Test
    public void should_return_0A2B_when_guess_given_some_num_wrong_position_correct_value_but_some_incorrect() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {3, 4, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("0A2B", res);
    }

    @Test
    public void should_return_2A2B_when_guess_given_all_num_correct_value_but_some_position_wrong() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {1, 2, 4, 3};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("2A2B", res);
    }

    @Test
    public void should_return_1A1B_when_guess_given_1829() {
        //given
        int[] answer = {1, 2, 3, 4};
        int[] inputNumArr = {1, 8, 2, 9};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("1A1B", res);
    }

}
