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
public class sort1 {
    public static void main(String... args) {
        int[] arr1 = {1,1,3,4,5};
        int[] arr2 = {2,13,14,16};
        int[] res = new int[arr1.length+arr2.length];
        if (arr1[arr1.length-1] < arr2[0]) {
            // we can just union that arrays
            System.arraycopy(arr1, 0, res, 0, arr1.length);
            System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
        } else {
            int index = 0;
            int index1 = 0;
            int index2 = 0;
            
            while(index1 < arr1.length || index2 < arr2.length){
                System.out.println("index="+index+", index1="+index1+", index2="+index2);
                if (index1 < arr1.length && index2 == arr2.length) {
                   res[index++] = arr1[index1++];
                } else if (arr1.length == index1) {
                    res[index++] = arr2[index2++];
                } else {
                    if (arr1[index1] < arr2[index2]) {
                        res[index++] = arr1[index1++];
                    } else {
                        res[index++] = arr2[index2++];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
