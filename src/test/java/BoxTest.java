import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("string", 2,3.5f);
        Box<String, Integer, Float> box2 = new Box<>("string", 5,6.5f);
        float sum = box1.getType() + box2.getType() + box1.getValue() + box2.getValue();
        assertEquals(17, sum);
    }
}