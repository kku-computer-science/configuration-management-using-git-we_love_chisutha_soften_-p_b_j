package MainApp;

import java.util.Scanner;
import java.util.Arrays;
import Interface.SortInterface;
import Sort.BubbleSort;
import Sort.QuickSort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. ส่วนรับค่า Input
        System.out.print("Enter number of elements (จำนวนตัวเลขที่จะใส่): ");
        int n = scanner.nextInt();

        int[] data = new int[n];
        System.out.println("Enter " + n + " integers (ใส่ตัวเลขทีละตัวแล้วกด Enter):");
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }
        // แสดงข้อมูลดิบที่รับมา
        System.out.println("\nData: " + Arrays.toString(data));

        // 2. ส่วนเลือก
        System.out.println("\n=== CHOOSE SORTING ALGORITHM ===");
        System.out.println("1. Bubble Sort"); 
        System.out.println("2. Quick Sort"); 
        System.out.print("Choose algorithm (1-2): ");

        int choice = scanner.nextInt();
        
        SortInterface sorter = null;

        if (choice == 1) {
            sorter = new BubbleSort(); 
        } else if (choice == 2) {
            sorter = new QuickSort(); 
        }

        // 3. ประมวลผลและแสดงผลลัพธ์
        if (sorter != null) {
            int[] result = sorter.sort(data);
            System.out.println("\n>> Sorted Result: " + Arrays.toString(result));
        } else {
            System.out.println("\n!! Invalid Choice (เลือกผิด) !!");
        }
        scanner.close();
    }
}