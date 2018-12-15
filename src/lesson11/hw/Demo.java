package lesson11.hw;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Room room1 = new Room(12313, 20, 1, new Date(), "AquaParkResort", "SharmAlSheih");
        Room room2 = new Room(26987, 52, 2,  new Date(), "AquaParkResort", "SharmAlSheih");
        Room room3 = new Room(64347, 95, 3,  new Date(), "AquaParkResort", "SharmAlSheih");
        Room room4 = new Room(23839, 180, 4,  new Date(), "AquaParkResort", "SharmAlSheih");
        Room room5 = new Room(13780, 220, 5,  new Date(), "AquaParkResort", "SharmAlSheih");
        Room room6 = new Room(96536, 120, 3,  new Date(), "AquaParkResort", "SharmAlSheih");
        Room room7 = new Room(25947, 88, 2,  new Date(), "AquaParkResort", "SharmAlSheih");

        Room[] rooms = {room1, room2, room3, room4, room5, room6, room7};

        BookingComAPI bookingCompAPI = new BookingComAPI(rooms);
        System.out.println(Arrays.toString(bookingCompAPI.findRooms(100, 2, "SharmAlSheih", "AquaParkResort")));

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);

        GoogleAPI googleAPI = new GoogleAPI(rooms);

    }
}
