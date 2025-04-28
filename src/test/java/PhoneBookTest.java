import org.example.PhoneBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAddSingleContact() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Петя", "+79991234567"));
    }

    @Test
    public void testAddFewContacts() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Петя", "+79991234567");
        assertEquals(2, phoneBook.add("Паша", "+79001234567"));
    }

}
