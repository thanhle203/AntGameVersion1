package com.mycompany.a1prj;

import java.util.Random;
import java.util.Vector;

public abstract class GameObjects {
	
	private int color;
	private Vector<Double> location;
	
	public GameObjects() {
		
		Random rand = new Random();
		this.location.setSize(2);
		this.location.set(0, rand.nextDouble() * 1000);
		this.location.set(1, rand.nextDouble() * 1000);
		
	}
	
	public void setColor(int x) {
		
		this.color = x;
		
	}
	
	public int getColor() {
		
		return this.color;
		
	}
	
	public void setLocation(double x, double y) {
		
		this.location.set(0,  x);
		this.location.set(1,  y);
		
	}
	
	public Vector<Double> getLocation() {
		
		return this.location;
		
	}
}