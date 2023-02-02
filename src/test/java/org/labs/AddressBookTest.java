package org.labs;

import static org.junit.Assert.*;
import org.junit.Test;
import org.labs.AddressBook;
import org.labs.BuddyInfo;

public class AddressBookTest {



    @Test
    public void addBuddy() {
        AddressBook test = new AddressBook();
        test.addBuddy(new BuddyInfo(1,"Sahil","Carleton","456"));
        assertEquals(1, test.amountOfBuddies());

    }

    @Test
    public void removeBuddy() {
        AddressBook test = new AddressBook();
        BuddyInfo buddy = new BuddyInfo(1,"Sahil","Carleton","456");
        test.addBuddy(buddy);
        test.removeBuddy(1);
        assertEquals(0, test.amountOfBuddies());
    }
}