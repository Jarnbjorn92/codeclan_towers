public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    CONFERENCE(5);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }
}
