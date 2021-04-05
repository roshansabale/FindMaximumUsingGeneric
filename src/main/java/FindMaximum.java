public class FindMaximum {
    public Integer findIntegerMaximum(Integer number1,Integer number2,Integer number3) {
        Integer maximum=number1;

        if(number1.compareTo(number2) > 0) {
            maximum = number1;
        } else if (number2.compareTo(number3) > 0) {
            maximum =number2;
        } else if (number3.compareTo(number1) > 0)
        {
            maximum = number3;
        }
        return maximum;
    }
}
