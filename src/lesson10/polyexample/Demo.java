package lesson10.polyexample;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
//        human.run();
//        System.out.println(" ");
        run(human);

        System.out.println();

        User user = new User("Jack");
        run(user);
//        System.out.println(" ");
//        user.run();
    }

    private static void run(Human human){
        human.run();
    }
}
