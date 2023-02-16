package com.mycompany.a1prj;

import java.util.Random;

public class FoodStations extends FixedGameObject {
	
	Random rand = new Random();
	
	private int size;
	private int capacity;
	
	public FoodStations() {
		
		this.size = rand.nextInt(21) + 10;
		this.capacity = this.size;
		
	}
	
	public int getFoodSize() {
		
		return this.size;
		
	}
	
	public int getFoodCapacity() {
		
		return this.capacity;
		
	}
	
	public void updateFoodCapacity(int x) {
		
		this.capacity -= x;
		
	}
	
	
}