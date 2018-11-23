package lesson5.hw;

import java.util.Arrays;

public class CustomerWithdraw {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};

        int bal = withdraw(names, balances, "Ann", 1400);
        System.out.println(bal);
        System.out.println(Arrays.toString(balances));
    }

    static int withdraw(String[] clients, int[] balances, String client, int amount){

        int clientIndex = 0;
        for (String cl : clients){
            if (cl == client){
                break;
            }
            clientIndex++;
        }

        int bal = balances[clientIndex];

        for (int elem : balances){
            if (elem == bal) {
                if (amount > bal){
                    return -1;
                }
                    bal -= amount;
            }
        }
        int b = balances[clientIndex] = bal;
        return b;
    }
}