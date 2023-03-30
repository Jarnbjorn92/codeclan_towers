import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }



    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConference(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addGuestBedroom(Guest guest1, Bedroom bedroom) {
        for(Bedroom room : bedrooms){
            if(room == bedroom){
                room.checkInGuest(guest1);
            }
        }

    }

    public void addGuestConference(Guest guest2, ConferenceRoom conferenceRoom) {
        for(ConferenceRoom room : getConferenceRooms()){
            if(room == conferenceRoom){
                room.checkInGuest(guest2);
            }
        }
    }

    public void removeGuestBedroom(Guest guest1, Bedroom bedroom) {
        for(Bedroom room : this.bedrooms){
            if(room == bedroom){
                room.checkOutGuest(guest1);
            }
        }
    }

    public void removeGuestConference(Guest guest2, ConferenceRoom conferenceRoom) {
        for(ConferenceRoom room : getConferenceRooms()){
            if(room == conferenceRoom){
                room.checkOutGuest(guest2);
            }
        }
    }
}
