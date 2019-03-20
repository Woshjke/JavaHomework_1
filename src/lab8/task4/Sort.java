package lab8.task4;

import java.util.Arrays;

public class Sort<T extends Comparable> {
    private T[] array;
    private int len;

    public Sort(T[] array) {
        this.array = array;
        len = array.length;
    }

    public void sort() {
        quickSort(0, len - 1);
    }

    private void quickSort(int left, int right) {
        if (!(right - left <= 0)) {
            T pivot = array[right];
            int partition = partition(left, right, pivot);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
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

    private void swap(int dex1, int dex2) {
        T temp;
        temp = array[dex1];
        array[dex1] = array[dex2];
        array[dex2] = temp;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
