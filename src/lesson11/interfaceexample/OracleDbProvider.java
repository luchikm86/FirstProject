package lesson11.interfaceexample;

public class OracleDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic
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
