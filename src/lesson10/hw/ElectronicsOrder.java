package lesson10.hw;

import java.util.Date;

public class ElectronicsOrder extends Order{
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса"|| getShipFromCity() == "Днепр"|| getShipFromCity() == "Харьков") {
            if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
                if (getCustomerOwned().getGender() == "Женский" && getBasePrice() >= 100) {
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    @Override
    public void calculatePrice() {
        double shippingCost;
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса")
            shippingCost = getBasePrice() * 0.1;
        else
            shippingCost = getBasePrice() * 0.15;

        double totalPrice = shippingCost + getBasePrice();
        if (getBasePrice() > 1000) {
            setTotalPrice(totalPrice - (totalPrice * 0.05));
        }
    }
}
