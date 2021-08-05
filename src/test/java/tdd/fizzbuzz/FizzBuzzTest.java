package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void should_return_number_when_countOff_given_normal_case_1() {
        //should
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String result = fizzBuzz.countOff(number);

        //then
        assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_when_countOff_given_number_multiple_of_3(){
        int number = 13;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.countOff(number);

        assertThat(result).isEqualTo("Fizz");
    }
}
