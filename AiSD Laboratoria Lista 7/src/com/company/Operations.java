package com.company;

import java.util.Random;

public class Operations {

    static int[] reverse(int[] array, int n)
    {
        int[] arrrayReversed = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            arrrayReversed[j - 1] = array[i];
            j = j - 1;
        }
        return arrrayReversed;
    }

    public int[] createTableUnsorted(int elements){
        Random random = new Random();
        int[] table = new int[elements];
        for (int i = 0; i<elements; i++){
            table[i] = random.nextInt(10000);
        }
        return table;

    }

    public int[] createTableSortedGrowing(int elements){
        Random random = new Random();
        int[] table = new int[elements];
        for (int i = 0; i<elements; i++){
            table[i] = random.nextInt(10000);
        }
        SortClass sortClass = new SortClass();
        sortClass.quickSort(table, 0, table.length-1);
        return table;

    }

    public int[] createTableSortedDecreasing(int elements){
        Random random = new Random();
        int[] table = new int[elements];
        for (int i = 0; i<elements; i++){
            table[i] = random.nextInt(10000);
        }
        SortClass sortClass = new SortClass();
        sortClass.quickSort(table, 0, table.length-1);
        return reverse(table, table.length);


    }

    public void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");

        System.out.println();
    }

}
