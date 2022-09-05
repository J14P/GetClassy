import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;
    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Jackson", "Pinchot", "Mr.", 1999);
    }

    @Test
    void testSetFirstName() {
        p1.setFirstName("Tom");
        assertEquals("Tom", p1.getFirstName());
    }

    @Test
    void testSetLastName() {
        p1.setLastName("Wulf");
        assertEquals("Wulf", p1.getLastName());
    }

    @Test
    void testSetTitle() {
        p1.setTitle("Ms.");
        assertEquals("Ms.", p1.getTitle());
    }

    @Test
    void testSetYOB() {
        p1.setYOB(2000);
        assertEquals(2000, p1.getYOB());
    }

    @Test
    void testFullName() {
        p1.setFirstName("Tom");
        p1.setLastName("Wulf");
        assertEquals("Tom Wulf", p1.fullName());
    }

    @Test
    void testFormalName() {
        p1.setFirstName("Tom");
        p1.setLastName("Wulf");
        p1.fullName();
        p1.setTitle("Mr.");
        assertEquals("Mr. Tom Wulf", p1.formalName());
    }

    @Test
    void testGetAge() {
        assertEquals(23, p1.getAge());
    }

    @Test
    void testGetAge1() {
        assertEquals(22, p1.getAge(2021));
    }

}