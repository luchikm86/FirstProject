package lesson10.hw;

import java.util.Date;

public class FurnitureOrder extends Order{
    private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
            if (getBasePrice() > 500 && !getCustomerOwned().getName().equals("Тест")) {
                setDateConfirmed(new Date());
            }
        }
    }

    @Override
    public void calculatePrice() {
        if(getTotalPrice() < 5000) {
            setTotalPrice(getTotalPrice() * 0.05);
        } else
            setTotalPrice(getTotalPrice() * 0.02);
    }
}
