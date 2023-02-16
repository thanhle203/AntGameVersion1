package com.mycompany.a1prj;

import java.util.Random;

public class Spider extends MovableGameObject {
	
	private int size;
	private int speed;
	private int heading;
	
	public Spider() {
		
		Random rand = new Random();
		this.size = rand.nextInt(11) + 20;
		this.speed = rand.nextInt(6) + 5;
		this.heading = rand.nextInt(360);
		
	}
	
	public int getSize() {
		
		return this.size;
		
	}
	
	public int getSpeed() {
		
		return this.speed;
		
	}
	
	public void setHeading(int x) {
		
		this.heading += x;
		
	}
	
	public int getHeading() {
		
		return this.heading;
		
	}
	
}