import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {
    public List<T> list;
    double weight = 0;

    public Basket() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public double getWeight() {
        for (T t : list) {
            weight += t.getWeight();
        }
        return weight;
    }

    public int compare(Basket<? extends Fruit> basket) {
        if (this.getWeight() > basket.getWeight()) {
            return 1;
        } else if (this.getWeight() < basket.weight) {
            return -1;
        } else {
            return 0;
        }
    }

    public static <U extends Fruit> void transfer(Basket<? extends  U> src, Basket<? super U> dst) {
        dst.list.addAll(src.list);
        src.list.clear();
    }
}
