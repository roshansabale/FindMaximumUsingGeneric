public class FindMaximum <T extends Comparable<T>>{

    T values[];
    public FindMaximum(T ...values) {
        this.values=values;
    }

    public T testMaximum() {
        return findMaximum(values);
    }
    public static <T extends Comparable<T>> T findMaximum(T... values) {
        T maximum  = values[0];   // assume x is initially the largest

        for(int i = 1; i < values.length; i++) {
            if (maximum.compareTo(values[i]) < 0) {
                maximum = values[i];
            }
        }
        return  maximum;
    }
}
