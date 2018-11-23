package lesson2.hw;

public class SumAndDivision {
    public static void main(String[] args) {
        int a = 1000;
        int b = 1234;
        int sum = 0;

        for (int i = 1; i <= a; i++){
            sum+=i;
        }
        int c = sum/b;
        int d = sum%b;
        System.out.println(sum > d);
    }
}