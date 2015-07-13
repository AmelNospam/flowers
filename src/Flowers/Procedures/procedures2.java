/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowers.Procedures;

import java.util.Arrays;

/**
 *
 * @author Олексій
 */
public class procedures2 {

    /**
     *
     * @param args
     */
    public static void main(String... args) {
        String source = "The string of randome symbols.";
        char[] inChars = source.toCharArray();
        for (int index = 0; index <= inChars.length / 2; index ++) {
            swap(inChars, index);
        }
        System.out.println(new String(inChars));
        for (int index = 0; index <= inChars.length / 2; index ++) {
            swap(inChars, index);
        }
        System.out.println(new String(inChars));
    }

    private static void swap(char[] array, int index) {
        char tmp = array[index];
        array[index] = array[array.length-index-1];
        array[array.length-index-1] = tmp;
    }

}
