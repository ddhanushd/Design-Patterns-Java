package DesignPatterns.Strategy;

import java.util.Arrays;

interface SortingStrategy {
    void sort(int[] arr);
}
class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
class InsertionSort implements  SortingStrategy {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
class SortingContext {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] arr) {
        strategy.sort(arr);
    }
}
public class StrategyPattern {
    public static void main(String[] args){
        SortingContext sortingContext=new SortingContext();
        int[] array1={45,78,25,63,10,97};
        int[] array2={99,25,48,36,41,77};
        sortingContext.setStrategy(new BubbleSort());
        sortingContext.sortArray(array1);
        System.out.println("Sorted Using BubbleSort: "+ Arrays.toString(array1));

        sortingContext.setStrategy(new InsertionSort());
        sortingContext.sortArray(array2);
        System.out.println("Sorted using InsertionSort: "+Arrays.toString(array2));
    }
}
