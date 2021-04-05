public class FindMaximum {
    public Integer findIntegerMaximum(Integer number1,Integer number2,Integer number3) {
        Integer maximum=number1;
        if(number2.compareTo(maximum) > 0) {
            maximum=number2;
        } else if (number3.compareTo(maximum) > 0) {
            maximum=number3;
        }
        return maximum;
    }
}
