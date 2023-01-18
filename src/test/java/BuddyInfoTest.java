
import static org.junit.Assert.*;
import org.junit.Test;

public class BuddyInfoTest {



    @Test
    public void getName() {
        BuddyInfo test =new BuddyInfo("Sahil","School","123");
        assertEquals("Sahil",test.getName());
    }

    @Test
    public void setName() {
        BuddyInfo test =new BuddyInfo("Sahil","School","123");
        test.setName("Agrawal");
        assertEquals("Agrawal",test.getName());
    }
}