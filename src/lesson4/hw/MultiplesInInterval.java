package lesson4.hw;

public class MultiplesInInterval {
    public static void main(String[] args) {
        short a = 1;
        short b =11;
        int res = findDivCount(a, b, 2);
        System.out.println(res);
    }

    public static int findDivCount(short a, short b, int n){
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0){
                count++;
            }
        }
        return count;
    }
}