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

    public Float findIntegerMaximum(Float number1,Float number2,Float number3) {
        Float maximum=number1;

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

    public String findIntegerMaximum(String number1,String number2,String number3) {
        //String maximum=number1;

        /*if(number1.compareTo(number2) > 0) {
            maximum = number1;
        } else if (number2.compareTo(number3) > 0) {
            maximum =number2;
        } else if (number3.compareTo(number1) > 0)
        {
            maximum = number3;
        }
        return maximum;*/
        String maximum=number1;
        if (number2.compareTo(maximum) > 0) {
            maximum = number2;
        }
        if (number3.compareTo(maximum) > 0) {
            maximum = number3;
        }
        return maximum;
    }
}
