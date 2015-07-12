package Flowers;

import java.util.Date;

public class Flower extends Element {
	private Smells smell;
	private Date cuted;
	
	public Flower(String name, Smells smell, Date cuted) {
		super(name);
		this.smell = smell;
		this.cuted = cuted;
	}

	public Flower(String name, Smells smell, Date cuted, int price, int color, int size) {
		super(name,price,color,size);
		this.smell = smell;
		this.cuted = cuted;
	}
	
	public Smells getSmell(){return this.smell;};
	public void setSmell(Smells smell) {this.smell=smell;};
	public Date getCuted(){return cuted;};
	public void setCuted(Date cuted){this.cuted=cuted;};
	
	@Override
	public int compareTo(Object obj){
		if (obj instanceof Flower) {
			Flower second = (Flower) obj;
			int res = this.cuted.compareTo(second.cuted);
			if (res==0){
				return super.compareTo(second);
			} else {
				return res;
			}
		} else {
			throw new ClassCastException();
		}
	}
	
	@Override
	public String toString(){
		return super.toString() + " (запах: "+this.smell+")";
	}
}
