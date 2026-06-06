package hotelRoomExample;

public abstract class RoomDecorator implements Room{
    Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }
}
