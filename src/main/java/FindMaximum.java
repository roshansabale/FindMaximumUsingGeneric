public class FindMaximum <T extends Comparable<T>>{
    T values[];
    public FindMaximum(T ...values) {
        this.values=values;
    }

    public T testMaximum() {
        T maximum = findMaximum(values);
        printMaximum(maximum);
        return maximum;
    }

    public static <T> void printMaximum(T maximum) {
        System.out.println("Maximum Number is:"+ maximum);
    }

    public static <T extends Comparable<T>> T findMaximum(T... values) {
        T maximum  = values[0];   // assume x is initially the largest

        for(int i = 1; i < values.length; i++) {
            if (maximum.compareTo(values[i]) < 0) {
                maximum = values[i];
            }
        }
       // printMaximum(maximum);
        return  maximum;
    }
}
