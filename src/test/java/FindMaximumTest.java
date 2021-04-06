import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FindMaximumTest {
    Integer number1;
    Integer number2;
    Integer number3;
    Float floatNumber1;
    Float floatNumber2;
    Float floatNumber3;
    String string1;
    String string2;
    String string3;
    Integer integerMaximum;
    Float   floatMaximum;
    String stringMaximum;

    FindMaximum findMaximum = new FindMaximum();
    //UC1.1 1st position
    @Test
    void givenMaximumNumber_WhenAtPosition1_ThenReturnNumber1() {
        number1 = 10;
        number2 = 20;
        number3 = 30;
        integerMaximum = findMaximum.findMaximum(number1,number2,number3);
        Assert.assertEquals(number3,integerMaximum);
        System.out.println("Maximum at 3rd position Number is:"+integerMaximum);
    }
    //UC1.2 2nd position
    @Test
    void givenMaximumNumber_WhenAtPosition2_ThenReturnNumber2() {
        number1 = 5;
        number2 = 10;
        number3 = 2;
        integerMaximum = findMaximum.findMaximum(number1,number2,number3);
        Assert.assertEquals(number2,integerMaximum);
        System.out.println("Maximum at 2nd position Number is:"+integerMaximum);
    }
    //UC1.3 3rd position
    @Test
    void givenMaximumNumber_WhenAtPosition3_ThenReturnNumber3() {
        number1 = 10;
        number2 = 20;
        number3 = 30;
        integerMaximum = findMaximum.findMaximum(number1,number2,number3);
        Assert.assertEquals(number3,integerMaximum);
        System.out.println("Maximum at 3rd position Number is:"+integerMaximum);
    }

    //2.1 1st position
    @Test
    void givenMaximumFloatNumber_WhenAtPosition1_ThenReturnNumber1() {
        floatNumber1 = 2.0f;
        floatNumber2 = 1.0f;
        floatNumber3 = 0.01f;
        floatMaximum = findMaximum.findMaximum(floatNumber1,floatNumber2,floatNumber3);
        Assert.assertEquals(floatNumber1,floatMaximum);
        System.out.println("Maximum at 1st position Number is:"+floatMaximum);
    }
    //2.1 2nd position
    @Test
    void givenMaximumFloatNumber_WhenAtPosition2_ThenReturnNumber2() {
        floatNumber1 = 2.0f;
        floatNumber2 = 10.0f;
        floatNumber3 = 0.01f;
        floatMaximum = findMaximum.findMaximum(floatNumber1,floatNumber2,floatNumber3);
        Assert.assertEquals(floatNumber2,floatMaximum);
        System.out.println("Maximum at 2nd position Number is:"+floatMaximum);
    }
    //2.1 3rd position
    @Test
    void givenMaximumFloatNumber_WhenAtPosition3_ThenReturnNumber3() {
        floatNumber1 = 2.0f;
        floatNumber2 = 10.0f;
        floatNumber3 = 200.01f;
        floatMaximum = findMaximum.findMaximum(floatNumber1,floatNumber2,floatNumber3);
        Assert.assertEquals(floatNumber3,floatMaximum);
        System.out.println("Maximum at 3rd position Number is:"+floatMaximum);
    }

    //3.1 1st position and here comparison of string are base on Unicode
    @Test
    void givenMaximumString_WhenAtPosition1_ThenReturnString1() {
        string1 = "Peach";
        string2 = "Banana";
        string3 = "Apple";
        stringMaximum = findMaximum.findMaximum(string1,string2,string3);
        Assert.assertEquals(string1,stringMaximum);
        System.out.println("Maximum at 1st position string is:"+stringMaximum);
    }
    //3.2 2nd position and here comparison of string are base on Unicode
    @Test
    void givenMaximumString_WhenAtPosition2_ThenReturnString2() {
        string1 = "Banana";
        string2 = "Peach";
        string3 = "Apple";
        stringMaximum = findMaximum.findMaximum(string1,string2,string3);
        Assert.assertEquals(string2,stringMaximum);
        System.out.println("Maximum at 2nd position string is:"+stringMaximum);
    }
    //3.3 3rd position and here comparison of string are base on Unicode
    @Test
    void givenMaximumString_WhenAtPosition3_ThenReturnString3() {
        string1 = "Banana";
        string2 = "Apple";
        string3 = "Peach";
        stringMaximum = findMaximum.findMaximum(string1,string2,string3);
        Assert.assertEquals(string3,stringMaximum);
        System.out.println("Maximum at 3rd position string is:"+stringMaximum);
    }




}
