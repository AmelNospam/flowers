/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flowers.Procedures;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Олексій
 */
public class Collections1 {
    public static void main(String ... args) {
        Set<Integer> set = new HashSet<Integer>();
//        Set<Integer> set = new TreeSet<Integer>(new Comparator(){
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
        set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set);
    }
}
