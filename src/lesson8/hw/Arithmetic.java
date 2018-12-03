package lesson8.hw;

public class Arithmetic {
    public boolean check(int[] array) {
        long indexOfMax = 0;
        long indexOfMin = 0;
        long sumIndexOfMaxMin;
        boolean checkSum = false;

        // поиск максимального и минимального элемента в масиве
//        Arrays.sort(array); // сортировка масима
//        indexOfMax = array[array.length-1]; // максимальный элемент
//        indexOfMin = array[0];	// минимальный элемент

        /*
        решение другое  без сортировки не меняя масив
        поиск индекса максимального и минимального элемента
        за линейное время не изменяя масив
        */

		for (int elem : array) {
            if(elem > indexOfMax) {
                indexOfMax = elem;
            } else if(elem < indexOfMin){
                indexOfMin = elem;
            }
        }

        sumIndexOfMaxMin = indexOfMax + indexOfMin;

        if (sumIndexOfMaxMin > 100) {
            checkSum = true;
        }

        return checkSum;
    }
}