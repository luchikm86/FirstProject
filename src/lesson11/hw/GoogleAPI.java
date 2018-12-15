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
            if (room != null && price > 0 && room.getPrice() == price &&
                    room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                count++;
            }
        }

        Room[] result = new Room[count];
        int index = 0;
        for (Room room : rooms) {
            if (room != null && price > 0 && room.getPrice() == price &&
                    room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                result[index] = room;
                index++;
            }
        }
        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
