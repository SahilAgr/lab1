
import static org.junit.Assert.*;
import org.junit.Test;

public class AddressBookTest {



    @Test
    public void addBuddy() {
        AddressBook test = new AddressBook();
        test.addBuddy(new BuddyInfo("Sahil","Carleton","456"));
        assertEquals(1, test.amountOfBuddies());

    }

    @Test
    public void removeBuddy() {
        AddressBook test = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Sahil","Carleton","456");
        test.addBuddy(buddy);
        test.removeBuddy(buddy);
        assertEquals(0, test.amountOfBuddies());
    }
}