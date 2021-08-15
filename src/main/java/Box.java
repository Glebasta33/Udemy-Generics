import java.util.List;

public class Box<T extends Number> {

        private T[] array;

    public Box(T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for (T element : array) {
            result += ((Number) element).doubleValue();
        }
        return result / array.length;
    }

/*    public static void method(List<Number> numbers) {

    }*/

    public static void method(List<? extends Number> numbers) {

    }

    public static <U> U getFirstElement(List<U> list) {
        return list.get(0);
    }

    public static <V> void transfer(List<? extends V> src, List<? super V> dst) {
        dst.addAll(src);
        src.clear();
    }

    public int compare(Box<?> another) {
        if (avg() > another.avg()) {
            return 1;
        } else if (avg() == another.avg()) {
            return 0;
        } else {
            return -1;
        }
    }


}
