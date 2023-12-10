package org.example.homework_05_12;

// найти второй и третий по минимальности элемент в массиве
public class Main {
    public static void main(String[] args) {
        int[] arrInt = {12, 3, 10, 1, 5, 5};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;

        for (int j : arrInt) {
            if (j < min1) {
                min3 = min2;
                min2 = min1;
                min1 = j;
            } else if (j < min2 && j != min1) {
                min3 = min2;
                min2 = j;
            } else if (j < min3 && j != min1 && j != min2) {
                min3 = j;
            }
        }
            if (min2 != Integer.MAX_VALUE) {
                System.out.println("Второй по минимальности элемент массива: " + min2);
            }
            if (min2 != Integer.MAX_VALUE) {
                System.out.println("Третий по минимальности элемент массива: " + min3);
            }


        }
    }

