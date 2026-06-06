package hotelRoomExample;

public class MiniBarRoom extends RoomDecorator{

    public MiniBarRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with Mini Bar";
    }

    @Override
    public int getCost() {
        return room.getCost() + 800;
    }
}
