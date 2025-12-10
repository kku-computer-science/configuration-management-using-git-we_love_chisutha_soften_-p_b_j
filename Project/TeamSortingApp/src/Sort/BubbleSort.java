package Sort;

import Interface.SortInterface;

public class BubbleSort implements SortInterface {
    
    @Override
    public int[] sort(int[] data) {
        System.out.println("[Running Bubble Sort...]");

        int n = data.length;
        for (int i=0; i<n-1;i++) {
        	for (int j=0;j<n-1-i;j++) {
        		if(data[j] >data[j+1]) {
        			int temp = data[j];
        			data[j] = data[j+1];
        			data[j+1]=temp;
        		}
        	}
        }
        
        return data;
    }
}