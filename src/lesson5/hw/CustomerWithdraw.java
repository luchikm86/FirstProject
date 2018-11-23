package lesson5.hw;

import java.util.Arrays;

public class CustomerWithdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        int bal = withdraw(names, balances, "Ann", 400);
        System.out.println(bal);
        System.out.println(Arrays.toString(balances));
    }

    static int withdraw(String[] clients, int[] balances, String client, int amount){
        int clI = 0;
        for (String elem : clients){
            if (elem.equals(client)){
                break;
            }
            clI++;
        }
        int bal = balances[clI];
        if (amount > bal){
            return -1;
        }else {

        }
       int result = balances[clI] - amount;
        return result;
    }
}