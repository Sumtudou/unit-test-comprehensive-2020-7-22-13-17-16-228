package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GuessNumberTest {

    public int[] getAnswer(){
        GenerateNumber generateNumbers = Mockito.mock(GenerateNumberImpl.class);
        when(generateNumbers.getAnswer()).thenReturn(new int[]{1,2,3,4});
        return  generateNumbers.getAnswer();
    }
    @Test
    public void should_return_4A0B_when_guess_given_1234() {
        //given
        int[] answer = getAnswer();
        int[] inputNumArr = {1, 2, 3, 4};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("4A0B", res);
    }

    @Test
    public void should_return_0A0B_when_guess_given_5678() {
        //given
        int[] answer = getAnswer();
        int[] inputNumArr = {5, 6, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("0A0B", res);

    }

    @Test
    public void should_return_2A0B_when_guess_given_1278() {
        //given
        int[] answer = getAnswer();
        int[] inputNumArr = {1, 2, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("2A0B", res);
    }

    @Test
    public void should_return_0A2B_when_guess_given_3478() {
        //given
        int[] answer = getAnswer();
        int[] inputNumArr = {3, 4, 7, 8};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("0A2B", res);
    }

    @Test
    public void should_return_2A2B_when_guess_given_1243() {
        //given
        int[] answer = getAnswer();
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
        int[] answer = getAnswer();
        int[] inputNumArr = {1, 8, 2, 9};
        GuessNumber guessNumber = new GuessNumber(answer);
        //when
        String res = guessNumber.guess(inputNumArr);
        //then
        assertEquals("1A1B", res);
    }

}
