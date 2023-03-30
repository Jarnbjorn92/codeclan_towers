public class Bedroom extends Room{

    private int roomNum;

    public Bedroom(RoomType roomType, int roomNum) {
        super(roomType);
        this.roomNum = roomNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }
}
