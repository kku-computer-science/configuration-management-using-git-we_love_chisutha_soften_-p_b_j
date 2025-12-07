package Sort;

import Interface.SortInterface;

public class QuickSort implements SortInterface {

    @Override
    public int[] sort(int[] data) {
        System.out.println("[Running Quick Sort...]");
        quickSort(data, 0, data.length - 1);
        return data;
    }

    private void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(data, low, high);

            // เรียกซ้ำ ซ้าย
            quickSort(data, low, pivotIndex - 1);

            // เรียกซ้ำ ขวา
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {

        int pivot = data[high]; // pivot อยู่ท้าย
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
