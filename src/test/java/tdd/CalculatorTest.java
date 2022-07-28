package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test()
    void addTest() throws Exception{
        int result = Calculator.add(1,2);
        Assertions.assertEquals(3, result);
        Assertions.assertEquals(6, Calculator.add(result, result));
    }

}