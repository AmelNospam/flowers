/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Олексій
 */
public class iterator1 {
    public static void main(String ... args) {
        List<Integer> mylist = new ArrayList<Integer>();
        mylist.add(5);
        mylist.add(1);
        mylist.add(3);
        mylist.add(10);
        Integer elem = null;
        for (Iterator<Integer> iter = mylist.iterator(); iter.hasNext();) {
            elem = iter.next();
            System.out.println(elem);
        }
    }
}
