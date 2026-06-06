package hotelRoomExample;

public class ExtraBedRoom extends RoomDecorator{

    public ExtraBedRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with Extra Bed";
    }

    @Override
    public int getCost() {
        return room.getCost() + 1000;
    }
}
