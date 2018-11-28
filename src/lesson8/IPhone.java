package lesson8;

public class IPhone {
    public class Phone {
        int price;
        double weight;
        String countryProduced;

        boolean fingerPrint;

        public Phone(int price, double weight, String countryProduced, boolean fingerPrint) {
            this.price = price;
            this.weight = weight;
            this.countryProduced = countryProduced;
            this.fingerPrint = fingerPrint;
        }

        void orderPhone() {
            //some logic
        }

        void deleteIPhoneFromDb() {
            //some logic
        }
    }
}
