package lesson8.ads;

public class HouseAd extends Ad {
    long id;
    String ownerName;
    String address;
    double square;
    int floors;

    public HouseAd(long id, int price, String ownerName, String address, double square, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

    boolean checkOwner(){
        Owners owners = new Owners();
        for (String owner : owners.owners){ //class owners point . massif owners (owners.owners)
            if (ownerName == owner)
                return true;
        }

        return false;
    }


}
