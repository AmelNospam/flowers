/**
 * 
 */
package Flowers;

/**
 * @author ќлекс≥й
 * 
 */
public abstract class Element implements Comparable{
	private String name="";
	private int price=0;
	private int color=0;
	private int size=0;
	
	public String getName() {return this.name;};
	public int getPrice() {return this.price;};
	public int getColor() {return this.color;};
	public int getSize() {return this.size;};
	
	public void setName(String name) {this.name=name;};
	public void setPrice(int price) {this.price=price;};
	public void setColor(int color) {this.color=color;};
	public void setSize(int size) {this.size=size;};
	
	public Element(String name){
		this.name = name;
	}
	public Element(String name, int price, int color, int size){
		this.name = name;
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	@Override
	public int compareTo(Object _second){
		Element second = (Element) _second;
		if (this.price > second.price) {
			return 1;
		} else if (this.price < second.price){
			return -1;
		}
		if (this.size > second.size) {
			return 1;
		} else if (this.size < second.size){
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString(){
		return this.name + ", по " + this.price + " грн, цвета: " + this.color + ", размером: " + this.size + " см.";
	}
}
