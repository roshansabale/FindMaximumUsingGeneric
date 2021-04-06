public class FindMaximum {

    public static <T extends Comparable<T>> T findMaximum(T number1, T number2, T number3) {
        T maximum = number1;   // assume x is initially the largest

        if (number1.compareTo(number2) > 0) {
            maximum = number1;
        } else if (number2.compareTo(number3) > 0) {
            maximum = number2;
        } else if (number3.compareTo(number1) > 0) {
            maximum = number3;
        }
        return maximum;
    }
}
