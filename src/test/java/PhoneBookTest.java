import org.junit.jupiter.api.*;

public class PhoneBookTest {
    @Test
    void testAdd() {
        PhoneBood phoneBook1 = new PhoneBood();
        String name = "Timur";
        String number = "8-902-111-11-11";

        int expected = 1;

        Assertions.assertEquals(expected, phoneBook1.add(name, number));
    }
}
