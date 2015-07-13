/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedures;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Олексій
 */
public class Collections2_1 {

    private static NavigableSet<Integer> set;

    public static void main(String ... args) {
        set = new TreeSet<Integer>();
        checkSet(1000, 66, 33);
        checkSet(1000, 666, 333);
        checkSet(10, 6, 3);
        checkSet(100, 66, 33);
    }
    
    private static void checkSet(Integer size, Integer nextTo, Integer prevTo){
        long label1;
        long label2;
        long label3;
        initializeSet(size);
        label1 = System.nanoTime();
        System.out.println(getNextElem(nextTo));
        label2 = System.nanoTime();
        System.out.println(set.higher(nextTo));
        label3 = System.nanoTime();
        System.out.printf("size: %d, getNextElem(%d) method: %,d, higher: %,d%n", size, nextTo, label2-label1, label3-label2);

        label1 = System.nanoTime();
        System.out.println(getPrevElems(prevTo));
        label2 = System.nanoTime();
        System.out.println(set.headSet(prevTo));
        label3 = System.nanoTime();
        System.out.printf("size: %d, getPrevElems(%d) method: %,d, headSet: %,d%n",size, prevTo, label2-label1, label3-label2);
    }
    
    private static void initializeSet(Integer size){
        set.clear();
        for (Integer index = 0; index <= size; index++) {
            set.add(index);
        }
    }

    private static Integer getNextElem(Integer elem) {
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            Integer current = iterator.next();
            if (current.equals(elem)) {
                if (iterator.hasNext()) {
                    return iterator.next();
                } else {
                    return null;
                }
            }
        }
        System.out.println();
        return null;
    }
    
    private static Set<Integer> getPrevElems(Integer elem) {
        NavigableSet<Integer> res = new TreeSet<Integer>();
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            Integer current = iterator.next();
            if (current == elem) {
                return res;
             } else {
                res.add(current);
            }
        }
        return res;
    }
}
