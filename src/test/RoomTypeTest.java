package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.RoomType;

public class RoomTypeTest {
    @Test
    void testRoomKind() {
        RoomType rt = new RoomType("VIP Deluxe", 4500.0);
        assertEquals("VIP Deluxe", rt.getKind());
    }

    @Test
    void testRoomPrice() {
        RoomType rt = new RoomType("VIP Deluxe", 4500.0);
        assertEquals(4500.0, rt.getPrice());
    }
}