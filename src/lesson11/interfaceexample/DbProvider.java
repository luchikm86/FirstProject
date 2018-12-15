package lesson11.interfaceexample;

public interface DbProvider {
    //если все методы абстрактные, то тогда это уже интерфейс будет
    void connectToDb();

    void disconnectFromDb();

    void encryptData();

}
