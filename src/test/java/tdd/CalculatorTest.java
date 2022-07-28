package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test()
    void addTest() throws Exception{
        int result1 = Calculator.add(1,2);
        int result2 = Calculator.add(result1, result1);

        Assertions.assertEquals(3, result1);
        Assertions.assertEquals(6, result2);
    }

}