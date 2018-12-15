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
        return null;
    }
}
