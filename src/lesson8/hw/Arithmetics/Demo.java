package lesson8.hw.Arithmetics;

public class Demo {
    public static void main(String[] args) {
        int[] array = {10, 5, 50, 68, 0, 20, 37, -1, 25};

        Adder adder = new Adder();
        System.out.println(adder.check(array));
        System.out.println(adder.add(429496729,132));
    }
}