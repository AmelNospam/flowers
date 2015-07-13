/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedures;

import java.util.Arrays;

/**
 *
 * @author Олексій
 */
public class procedures1 {

    /**
     *
     * @param args
     */
    public static void main(String... args) {
        int[] array = {60, 20, 10, 80, 50};
        for (int barrier = array.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (array[index] > array[index + 1]) {
                    swap(array, index);
                }
                System.out.print(index);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int index) {
        int tmp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = tmp;
    }

}
