import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    Integer number1;
    Integer number2;
    Integer number3;
    Integer integerMaximum;
    FindMaximum findMaximum = new FindMaximum();
    @Test
    void findMaximumNumber_WhenAtPosition1_ThenReturnNumber1() {
        number1 = 10;
        number2 = 5;
        number3 = 9;
        integerMaximum = findMaximum.findIntegerMaximum(10, 5, 9);
        Assert.assertEquals(number1,integerMaximum);
    }

    @Test
    void findMaximumNumber_WhenAtPosition1_ThenReturnNumber2() {
        number1 = 5;
        number2 = 10;
        number3 = 2;
        integerMaximum = findMaximum.findIntegerMaximum(number1,number2,number3);
        Assert.assertEquals(number2,integerMaximum);
    }
}
