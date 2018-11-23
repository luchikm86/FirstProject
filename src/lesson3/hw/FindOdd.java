package lesson3.hw;

public class FindOdd {
    public static void main(String[] args) {
        int a = 1000;
        int sum = 0;

        for (int i = 0; i <= a; i++){
            if (!(i % 2 == 0)){
                System.out.println("Found");
                sum += i;
            }
        }

        if (sum * 5 > 5000)
            System.out.println("Bigger");
        else
            System.out.println("Smaller or equals");
    }
}
