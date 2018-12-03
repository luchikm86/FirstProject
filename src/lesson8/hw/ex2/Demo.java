package lesson8.hw.ex2;

public class Demo {
    public static Student createHighestParent(){
        return new Student("Maksym", "Luchenko", 8, null);
    }

    public static SpecialStudent createLowestChild(){
        return new SpecialStudent("Sergry", "Apalko", 8, null, 6104, "students@kneu.ua");
    }

}
