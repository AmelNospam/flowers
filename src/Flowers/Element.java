/**
 * 
 */
package Flowers;

/**
 * @author Ξλεκρ³ι
 * 
 */
public abstract class Element<T> implements Comparable<T>{
	private String name;
	private int price;
	private int color;
	private int size;
	
	public String getName() {return this.name;};
	public int getPrice() {return this.price;};
	public int getColor() {return this.color;};
	public int getSize() {return this.size;};
	
	public void setName(String name) {this.name=name;};
	public void setPrice(int price) {this.price=price;};
	public void setColor(int color) {this.color=color;};
	public void setSize(int size) {this.size=size;};
	
	public int compareTo(T second){
		return 0;
	}
}
