package lesson11.hw;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null && room.getPrice() >= 0 &&
                    room.getPerson() == persons - 1 && room.getPerson() == persons + 1 &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                count ++;
            }
        }

        Room[] result = new Room[count];
        int index = 0;

        for (Room room : rooms) {
            if (room != null && room.getPrice() >= 0 &&
                    room.getPerson() == persons - 1 && room.getPerson() == persons + 1 &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                result[index] = rooms[index];
            }
        }
        return result;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
