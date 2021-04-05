import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    @Test
    void findMaximumNumber_WhenAtPosition1_ThenReturnNumber1() {
        Integer number1=10;
        Integer number2=5;
        Integer number3=9;

        FindMaximum findMaximum = new FindMaximum();
        Integer integerMaximum = findMaximum.findIntegerMaximum(10, 5, 9);
        Assert.assertEquals(number1,integerMaximum);
    }
}
