package lesson12;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        //limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
        if (getCurrency() == Currency.USD)
            return 100;
        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        //limit of funding - 5000 if EUR and 10000 if USD
        if (getCurrency() == Currency.EUR)
            return 5000;
        return 10000;
    }

    @Override
    public double getMonthlyRate() {
        //monthly rate - 1% with USD and 0% with EUR
        if (getCurrency() == Currency.USD)
            return 0.01;
        return 0;
    }

    @Override
    public double getCommission(int amount) {
        //commission - 3% if USD and up to 1000, 5% if USD and more than 1000
        //10% if EUR and up to 1000 and 11% if EUR and more than 1000
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.03;
            else
                return 0.05;
        }
        else {
            if (amount <= 1000)
                return 0.1;
            else
                return 0.11;
        }
    }
}
