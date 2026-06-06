package hotelRoomExample;

public class BreakfastRoom extends RoomDecorator{

    public BreakfastRoom(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + " with Breakfast";
    }

    @Override
    public int getCost() {
        return room.getCost() + 500;
    }
}
