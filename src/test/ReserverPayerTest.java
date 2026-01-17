package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.main.ReserverPayer;

public class ReserverPayerTest {
    @Test
    void testPayerName() {
        ReserverPayer p = new ReserverPayer("Muhammad Aun", 15000.0);
        assertEquals("Muhammad Aun", p.getPayerName());
    }

    @Test
    void testPayerBalance() {
        ReserverPayer p = new ReserverPayer("Muhammad Aun", 15000.0);
        assertEquals(15000.0, p.getBalance());
    }
}