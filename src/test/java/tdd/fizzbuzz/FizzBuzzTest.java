package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void should_number_when_countOff_given_1() {
        //should
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff();

        //then
        assertThat(result).equals("1");
    }
}
