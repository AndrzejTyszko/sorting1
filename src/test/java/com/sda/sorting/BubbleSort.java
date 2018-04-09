package com.sda.sorting;

public class BubbleSort {
    public static void sort(int[] tablica) {

// IMPLEMENTACJA BUBBLESORT
        int n = tablica.length;
        int licznikOperacji = 0;
        do {
            for (int i = 0; i < n - 1; i++) {
                licznikOperacji++;
                if (tablica[i] > tablica[i + 1]) {
                    //tablica[i[ <== tablica[i+1]
                    //tablica[i+1]<== tablica[i]
                    int zmiennaTymczasowa = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = zmiennaTymczasowa;
                }
            }
            n--;
        } while (n > 1);
        System.out.println("Licznik operacji: "+ licznikOperacji);

    }
}