package lesson5.hw;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] arr = {3, 13, 44, 1000, -40, 0};

        System.out.println(Arrays.toString(sortAscending(arr)));
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    //вывод масива от меньшего к большему
    static int[] sortAscending(int[] array){
        int[] result1 = new int[array.length];
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            result1[i] = array[i];
        }
        return result1;
    }

    //вывод масива от большего к меньшему
    static int[] sortDescending(int[] array){
        int[] result = new int[array.length]; //новый массив размером с длину старого
        Arrays.sort(array); // сортировка массива по возрастанию
        int index = array.length-1; //последний индекс масива
        for(int i = index; i >= 0; i--) { //проходим по массиву с конца в начало
            result[index-i] = array[i]; // добавляем в массив result
        }
        return result;
    }
}
