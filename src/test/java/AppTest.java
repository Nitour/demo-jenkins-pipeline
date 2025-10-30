import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 public class AppTest {
    @Test
    void testAdd() {
        // Test volontairement vrai
        assertEquals(3, App.add(1, 2));

        // Test volontairement faux
        // assertEquals(999, App.add(1, 2));
    }
 }