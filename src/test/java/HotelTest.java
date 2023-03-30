import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;


    @Before public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.SINGLE, 1);
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "CodeCULT");
        guest1 = new Guest("Steve");
        guest2 = new Guest("Steven");
    }

    @Test public void canAddToRoomArrays(){
        hotel.addBedroom(bedroom);
        hotel.addConference(conferenceRoom);
        assertEquals(1, hotel.getBedrooms().size());
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test public void canAddGuestToRooms(){
        hotel.addBedroom(bedroom);
        hotel.addConference(conferenceRoom);
        hotel.addGuestBedroom(guest1, bedroom);
        hotel.addGuestConference(guest2, conferenceRoom);
        assertEquals(1, bedroom.getGuests().size());
        assertEquals(1, conferenceRoom.getGuests().size());
    }

    @Test public void canRemoveGuestFromRooms(){
        hotel.addBedroom(bedroom);
        hotel.addConference(conferenceRoom);
        hotel.addGuestBedroom(guest1, bedroom);
        hotel.addGuestConference(guest2, conferenceRoom);
        hotel.removeGuestBedroom(guest1, bedroom);
        hotel.removeGuestConference(guest2, conferenceRoom);
        assertEquals(0, bedroom.getGuests().size());
        assertEquals(0, conferenceRoom.getGuests().size());
    }
}
