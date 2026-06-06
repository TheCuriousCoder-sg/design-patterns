package hotelRoomExample;

public class BasicRoom implements Room {

    @Override
    public String getDescription() {
        return "Basic Hotel Room";
    }

    @Override
    public int getCost() {
        return 3000;
    }
}
