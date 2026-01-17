package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.Room;

public class RoomTest {
    @Test
    void testRoomNumber() {
        Room r = new Room(313);
        assertEquals(313, r.getRoomNumber());
    }

    @Test
    void testRoomOccupancy() {
        Room r = new Room(313);
        assertFalse(r.isOccupied());
        r.setOccupied(true);
        assertTrue(r.isOccupied());
    }
}