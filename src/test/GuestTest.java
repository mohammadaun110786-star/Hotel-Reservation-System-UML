package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.Guest;

public class GuestTest {
    @Test
    void testGuest() {
        Guest g = new Guest("Muhammad Aun", "03318397227");
        assertEquals("Muhammad Aun", g.getName());
    }

    @Test
    void testGuestContact() {
        Guest g = new Guest("Muhammad Aun", "03318397227");
        assertEquals("03318397227", g.getContact());
    }
}