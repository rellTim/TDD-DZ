import org.junit.jupiter.api.*;

public class PhoneBookTest {
    @Test
    void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Timur";
        String number = "8-902-111-11-11";

        int expected = 1;

        Assertions.assertEquals(expected, phoneBook.add(name, number));
    }

    @Test
    void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Timur", "8-901-111-11-11");
        phoneBook.add("Dacha", "8-901-111-11-12");
        String number = "8-901-111-11-11";

        Assertions.assertEquals("Timur", phoneBook.findByNumber(number));
    }

    @Test
    void testFindName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Timur", "8-901-111-11-11");
        phoneBook.add("Dacha", "8-901-111-11-12");
        String name = "Timur";

        Assertions.assertEquals("8-901-111-11-11", phoneBook.findByName(name));
    }
}
