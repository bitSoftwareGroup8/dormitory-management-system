import org.junit.Test;
import static org.junit.Assert.*;

public class ProctorTest {

    @Test
    public void testConstructor() {
        // Test the constructor by creating a new Proctor object and checking its values.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        assertEquals("John Doe", p.getName());
        assertEquals("555-5555", p.getPhoneNumber());
        assertEquals(123, p.getBlockNumber());
    }

    @Test
    public void testSetName() {
        // Test the setName method by setting the name to a new value and checking that it is returned correctly.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        p.setName("Jane Smith");
        assertEquals("Jane Smith", p.getName());
    }

    @Test
    public void testSetPhoneNumber() {
        // Test the setPhoneNumber method by setting the phone number to a new value and checking that it is returned correctly.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        p.setPhoneNumber("555-1234");
        assertEquals("555-1234", p.getPhoneNumber());
    }

    @Test
    public void testSetBlockNumber() {
        // Test the setBlockNumber method by setting the block number to a new value and checking that it is returned correctly.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        p.setBlockNumber(456);
        assertEquals(456, p.getBlockNumber());
    }

    @Test
    public void testSetNameNull() {
        // Test that the setName method does not change the name if null is passed as a parameter.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        p.setName(null);
        assertEquals("John Doe", p.getName());
    }

    @Test
    public void testSetNameEmpty() {
        // Test that the setName method changes the name to an empty string if an empty string is passed as a parameter.
        Proctor p = new Proctor("John Doe", "555-5555", 123);
        p.setName("");
        assertEquals("", p.getName());
    }
}
