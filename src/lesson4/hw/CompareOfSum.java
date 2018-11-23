package lesson4.hw;

public class CompareOfSum {
    public static void main(String[] args) {
        System.out.println(sum(1,4));
        System.out.println(compareSums(1,4 , 1,3 ));
    }

    public static boolean compareSums(int a, int b, int c, int d){
        return sum(a, b) > sum(c, d);

    }

    public static long sum (int from, int to){
        long sum = 0;
        for (long i = from; i <= to; i++) {
            sum+=i;
        }
        return sum;
    }
}