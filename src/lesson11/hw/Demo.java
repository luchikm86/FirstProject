package lesson11.hw;

public class Demo {
    public static void main(String[] args) {

        Room room1 = new Room(12313, 20, 1, null, "AquaParkResort", "SharmAlSheih");
        Room room2 = new Room(26987, 52, 2, null, "BeachResort", "SharmAlSheih");
        Room room3 = new Room(64347, 95, 3, null, "SeabaechResort", "Side");
        Room room4 = new Room(23839, 180, 4, null, "SeabaechResort", "Side");
        Room room5 = new Room(13780, 220, 5, null, "BeachResort", "SharmAlSheih");
        Room room6 = new Room(96536, 120, 3, null, "SunRiseResort", "SharmAlSheih");
        Room room7 = new Room(25947, 88, 2, null, "AquaParkResort", "SharmAlSheih");

        Room[] rooms = {room1, room2, room3, room4, room5, room6, room7};

        BookingCompAPI bookingCompAPI = new BookingCompAPI(rooms);

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);

        GoogleAPI googleAPI = new GoogleAPI(rooms);




    }
}
