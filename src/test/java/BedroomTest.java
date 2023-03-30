import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before public void before(){
        bedroom = new Bedroom(RoomType.SINGLE, 1);
        guest = new Guest("Steve");
    }

    @Test public void canAddGuestToBedroom(){
        bedroom.checkInGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }

    @Test public void canRemoveGuest(){
        bedroom.checkInGuest(guest);
        bedroom.checkOutGuest(guest);
        assertEquals(0,bedroom.getGuests().size());
    }
}
