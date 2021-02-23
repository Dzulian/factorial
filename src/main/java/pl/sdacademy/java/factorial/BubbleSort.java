package pl.sdacademy.java.factorial;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] values = new int[]{4, 2, 3, 1, 8, 0};
        System.out.println(Arrays.toString(values));
        System.out.println("-------------------");
        sort(values);
    }
    public static void sort(int[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (j < values.length - 1 && values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
                System.out.println(Arrays.toString(values));
            }
            System.out.println("-------------------");
        }
    }
}

