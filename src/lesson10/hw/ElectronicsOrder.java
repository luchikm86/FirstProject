package lesson10.hw;

import java.util.Date;

public class ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    void validateOrder() {
        String[] city = {"Киев", "Одесса", "Днепр", "Харьков"};
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
            if (getCustomerOwned().getGender() == "Женский" && getBasePrice() >= 100) {
                setDateConfirmed(new Date());
            }
        }

    }

    @Override
    void calculatePrice() {
        double shippingCost;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
            shippingCost = getBasePrice() * 0.1;
        else
            shippingCost = getBasePrice() * 0.15;

        double totalPrice = shippingCost + getBasePrice();
        if (totalPrice > 1000) {
            setTotalPrice(totalPrice - (totalPrice * 0.05));
        }






    }


}
