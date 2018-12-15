package lesson11.hw;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() > 0 && room.getPrice() == price &&
                    room.getPerson() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                count++;
            }
        }

        Room[] result = new Room[count];
        for (Room room : rooms) {
            if (room != null && room.getPrice() > 0 && room.getPrice() == price &&
                    room.getPerson() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                result[count] = rooms[count];
            }
        }
        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
