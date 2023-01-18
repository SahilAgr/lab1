package org.labs;

import static org.junit.Assert.*;
import org.junit.Test;
import org.labs.BuddyInfo;

public class BuddyInfoTest {



    @Test
    public void getName() {
        BuddyInfo test =new BuddyInfo(1,"Sahil","School","123");
        assertEquals("Sahil",test.getName());
    }

    @Test
    public void setName() {
        BuddyInfo test =new BuddyInfo(1,"Sahil","School","123");
        test.setName("Agrawal");
        assertEquals("Agrawal",test.getName());
    }
}