package lesson11.hw;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    count++;
                }
            }
        }

        Room[] result = new Room[count];
        int index = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    result[index] = room;
                    index++;
                }
            }
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        int count = 0;
        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room != null && room1 != null) {
                    if (room.getPrice() == room1.getPrice() &&
                            room.getPersons() == room1.getPersons() &&
                            room.getCityName().equals(room1.getCityName()) &&
                            room.getHotelName().equals(room1.getHotelName())) {
                        count++;
                    }
                }
            }

        }

        Room[] result = new Room[count];
        int index = 0;
        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room != null && room1 != null) {
                    if (room.getPrice() == room1.getPrice() &&
                            room.getPersons() == room1.getPersons() &&
                            room.getCityName().equals(room1.getCityName()) &&
                            room.getHotelName().equals(room1.getHotelName())) {
                        result[index] = room;
                    }
                        count++;
                    }
                }
            }
        return result;
    }
}
