import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1;

    @BeforeEach
    void setUp() {
        p1 = new Product("Skittles", "Taste the Rainbow", "000001", 3.99);
    }

    @Test
    void setName() {
        p1.setName("Hershey's");
        assertEquals("Hershey's", p1.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("America's best Chocolate");
        assertEquals("America's best Chocolate", p1.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(2.99);
        assertEquals(2.99, p1.getCost());
    }
}