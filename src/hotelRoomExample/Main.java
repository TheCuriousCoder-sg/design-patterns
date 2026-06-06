package hotelRoomExample;

public class Main {
    public static void main(String[] args) {
        Room room = new BasicRoom();
        System.out.println("Description: " + room.getDescription() + "COST: "
                + room.getCost());

        room = new BreakfastRoom(room);
        System.out.println("Description: " + room.getDescription() + "COST: "
                + room.getCost());
        room = new ExtraBedRoom(room);
        System.out.println("Description: " + room.getDescription() + "COST: "
                + room.getCost());
        room = new MiniBarRoom(room);

        System.out.println("Description: " + room.getDescription() + "COST: "
        + room.getCost());

    }
}
