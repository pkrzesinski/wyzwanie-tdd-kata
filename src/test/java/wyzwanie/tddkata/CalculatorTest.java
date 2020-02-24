package wyzwanie.tddkata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void should_return_zero_for_empty_string() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String emptyString = "";

        //when
        Integer result = calculatorUnderTest.add(emptyString);

        //then
        assertThat(result, equalTo(0));
    }

    @Test
    public void should_return_six_for_6() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "6";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(6));
    }

    @Test
    public void should_return_three_for_12() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "1, 2";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(3));
    }

    @Test
    public void should_ignore_all_spaces_in_string_and_sum_properly() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "    1,    5    ";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(6));
    }

    @Test
    public void should_return_minus_one_for_not_numeral_input() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "1, test";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(-1));
    }

    @Test
    public void should_return_minus_one_for_wrong_separator() {
        //given
        Calculator calculatorUnderTest = new Calculator();
        String input = "1. 3";

        //when
        Integer result = calculatorUnderTest.add(input);

        //then
        assertThat(result, equalTo(-1));
    }

}