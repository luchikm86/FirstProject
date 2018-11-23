package lesson2.hw;

public class SumOfNumbers {
    public static void main(String[] args) {
        long a = 10000000;
        long sum = 0;

        for (int i = 1; i <= a; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
