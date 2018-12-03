package lesson8.hw.ex2;



public class Demo {

    public static Student createHighestParent(){
        Student student = new Student("Max", "Luchenko", 8, new Course[1]);

        return student;

        //кратко
//        return new Student("Max", "Luchenko", 8, new Course[1]);
    }

    public static SpecialStudent createLowestChild(){
        SpecialStudent specialStudent = new SpecialStudent("Ivan", "Chonkin", 8, new Course[1], 6104, "ivan@gmail.com");

        return specialStudent;

        //кратко
//        return new SpecialStudent("Ivan", "Chonkin", 8, new Course[1], 6104, "ivan@gmail.com");
    }

}
