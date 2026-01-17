package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.Hotel;

public class HotelTest {
    @Test
    void testHotelName() {
        Hotel h = new Hotel("Aun Hotel");
        assertEquals("Aun Hotel", h.getHotelName());
    }

    @Test
    void testHotelNotNull() {
        Hotel h = new Hotel("Aun Hotel");
        assertNotNull(h.getHotelName());
    }
}