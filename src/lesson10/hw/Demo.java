package lesson10.hw;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Николай","Киев", "Мужской");
        Customer customer2 = new Customer("Дарья", "Одесса", "Женский");
        Customer customer3 = new Customer("Тест", "Львов", "Женский");

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Nokia", new Date(), "Киев", "Одесса", 1200, customer,12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Samsung", new Date(), "Львов", "Киев", 200, customer2, 6);

        FurnitureOrder furnitureOrder = new FurnitureOrder("Товар 1", new Date(), "Киев", "Харьков", 2000, customer3, "Code");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Товар 2", new Date(), "Львов", "Одесса", 1000, customer2, "Code1");


        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();

        System.out.println(" ");

        electronicsOrder.validateOrder();
        electronicsOrder.calculatePrice();


    }
}
