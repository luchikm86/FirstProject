package lesson11.hw;

public class BookingCompAPI implements API{
    private Room[] rooms;

    public BookingCompAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room != null && price > 0 && room.getPrice() >= price - 100 &&
                    room.getPrice() <= price + 100 && room.getPerson() == persons &&
                    room.getCityName() == city && room.getHotelName() == hotel) {
                count++;
            }
        }

        Room[] result = new Room[count];
        int index = 0;
        for (Room room : rooms) {
            if (room != null && price > 0 && room.getPrice() >= price - 100 &&
                    room.getPrice() <= price + 100 && room.getPerson() == persons &&
                    room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                result[index] = rooms[index];
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
