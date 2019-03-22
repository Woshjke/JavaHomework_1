package lab8.task4;

import java.util.Arrays;

public class GenericArraySort<T extends Comparable> {
    private T[] array;
    private int len;

    public GenericArraySort(T[] array) {
        this.array = array;
        len = array.length;
    }

    public void sort() {
        recursiveQuickSort(0, len - 1);
    }

    private void recursiveQuickSort(int left, int right) {
        if (!(right - left <= 0)) {
            T pivot = array[right];
            int partition = partition(left, right, pivot);
            recursiveQuickSort(left, partition - 1);
            recursiveQuickSort(partition + 1, right);
        }
    }

    private int partition(int left, int right, T pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;

        while (true) {
            //noinspection unchecked
            while (array[leftPtr].compareTo(pivot) < 0) {
                leftPtr++;
            }
            //noinspection unchecked
            while (rightPtr + 1 > 0 && array[rightPtr].compareTo(pivot) > 0) {
                rightPtr--;
            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int first, int second) {
        T temp;
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    @Override
    public String toString() {
        return "GenericArraySort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
