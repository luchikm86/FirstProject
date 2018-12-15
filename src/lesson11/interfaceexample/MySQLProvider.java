package lesson11.interfaceexample;

public class MySQLProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for mysql
    }

    @Override
    public void disconnectFromDb() {
        //some logic
    }

    @Override
    public void encryptDate() {
        //some logic
    }
}
