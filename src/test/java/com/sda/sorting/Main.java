package com.sda.sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // int[] tablica = {1,2,3,4,5,6,7,8,9,10};
        int[] tablica = {10,9,8,6,5,4,3,2,1,7};
        System.out.println("Przed "+ Arrays.toString(tablica));
        BubbleSort.sort(tablica);
        System.out.println("Po: " + Arrays.toString(tablica));

    }
}
