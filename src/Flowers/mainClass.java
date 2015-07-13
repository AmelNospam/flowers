package Flowers;

import java.util.Arrays;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

public class mainClass {

	public static void main(String[] args) {
//		SortedSet<Element> list = new TreeSet<Element>();
//		list.add((Element) new Flower("red bulb", Smells.NONE, new Date("22/02/2015"), 10, 50, 5));
//		list.add((Element) new Flower("yellow bulb", Smells.NONE, new Date("23/02/2015"), 10, 150, 5));
//		list.add((Element) new Flower("red rose1", Smells.NICE, new Date("22/02/2015"), 15, 50, 9));
//		list.add((Element) new Flower("red rose2", Smells.NICE, new Date("23/02/2015"), 10, 50, 10));
//		list.add((Element) new Flower("red rose3", Smells.NICE, new Date("23/02/2015"), 10, 50, 11));
//		list.add((Element) new Flower("red rose4", Smells.NICE, new Date("24/02/2015"), 10, 50, 15));
//
//		list.add((Element) new Flower("tulib", Smells.NICE, new Date("24/02/2015"), 10, 50, 15));
//		
//		list.add((Element) new Accessorie("Лента", 1, 200, 30));
//		//Iterator<Flower> iterator = list.iterator();
//		System.out.println("List: ");
//		for(Element flower : list){
//			//if (flower instanceof Flower){
//			System.out.println(flower);
//			//}
//		}
//		
//
//		System.out.println("");
//		System.out.println("********");
//		int lowerSize = 7;
//		int higherSize = 11;
//		System.out.printf("Sizes from: %d to %d \n\n",lowerSize,higherSize);
//		int totalCost = 0;
//		for(Element flower : list){
//			totalCost += flower.getPrice();
//			if (flower instanceof Flower){
//                            if (flower.getSize() >= lowerSize && flower.getSize() <= higherSize){
//				System.out.println(flower);
//                            }
//			}
//		}
//		
//		
//		System.out.println("");
//		System.out.println("********");
//		System.out.println("");
//		System.out.println("Цена букета: " + totalCost + " грн.");
                
                int[] array = {60, 20, 10, 80, 50};
                for (int barrier = array.length - 1; barrier >= 0; barrier--) {
                    for (int index = 0; index < barrier; index++) {
                        if (array[index] < array[index+1]){
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
        array[index+1] = tmp;
    }
}
