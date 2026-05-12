package classes.rooms;

public class Special_Room implements Room {
    private final String roomType;
    private int roomNumber;

    public Special_Room(int roomNumber) {
        this.roomType = "Especial";
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    
}
