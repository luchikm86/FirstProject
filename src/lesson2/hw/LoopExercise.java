package lesson2.hw;

public class LoopExercise {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;

        for (int i = a; i <= 10; i++){
            System.out.println(i);
        }

        do {
            System.out.println(b);
            b++;
        }while (b <= 20);
    }
}
