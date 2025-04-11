package org.example.exercises;

public class Item {

	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	@Override
	public String toString() {
		return String.format("\n name=%s, sellIn=%d, quality=%d", name, this.sellIn, this.quality) ;
	}
	
	
}
