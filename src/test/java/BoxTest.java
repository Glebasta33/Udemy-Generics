import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void testBox() {
        List<Integer> numbers = new ArrayList<>();
        Box.method(numbers);
        Box<Integer> box = new Box<>(5, 10, 15);
        Box<Float> box2 = new Box<>(5f, 10f, 15f);
        assertEquals(0, box.compare(box2));
    }
}