package Procedures;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class CollectionsIncorrect {

    private static NavigableSet<Integer> setForTesting;

    public static void main(String ... args) {
        setForTesting = new TreeSet<Integer>();
        checkSet(1000, 127);
        System.out.println("*********************");
        checkSet(1000, 128);
    }
    
    private static void checkSet(Integer size, Integer nextTo){
        initializeSet(size);
        System.out.println(getNextElem(nextTo));
    }
    
    private static void initializeSet(Integer size){
        setForTesting.clear();
        for (Integer index = 0; index <= size; index++) {
            setForTesting.add(index);
        }
    }

    private static Integer getNextElem(Integer elem) {
        for (Iterator<Integer> iterator = setForTesting.iterator(); iterator.hasNext();) {
            Integer current = iterator.next();
            if (current == elem) {              // Нельзя сравнивать объекты при помощи ==
                if (iterator.hasNext()) {       //Сюда код не заходит, если ищем >127!!
                    return iterator.next();
                } else {
                    return null;
                }
            } else {
                if (current < elem) {
                    if (elem-current < 4)
                        System.out.printf("_%d<%d%n",current,elem);
                } else if(current > elem){
                    if (current-elem < 4)
                        System.out.printf("_%d>%d%n",current,elem);
                } else {
                    System.out.printf("_%d==%d%n",current,elem);
                }
            }
        }
        System.out.println();
        return null;
    }
}
