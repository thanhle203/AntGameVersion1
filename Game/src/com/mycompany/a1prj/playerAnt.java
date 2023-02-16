package com.mycompany.a1prj;

public class playerAnt extends MovableGameObject implements ISteerable {
	
	private int maximumSpeed = 10;
	private int foodLevel = 10;
	private int foodConsumptionRate = 1;
	private int healthLevel = maximumSpeed;
	private int lastFlagReached = 1;
	private int speed = 5;
	private int heading = 0;
	private int size = 40;
	
	public playerAnt() {
		
		this.maximumSpeed = 10;
		
	}
	
	/*Setting the speed of the ant*/
	public void setSpeed(int newSpeed) {
		
		if(newSpeed > maximumSpeed) {
			System.out.println("Cannot increase speed. Ant is already at maximum speed.");
		}
		else if(newSpeed < 0) {
			System.out.println("Cannot decrease speed. Ant is already at its slowest speed.");
		}
		else {
			this.speed = newSpeed;
		}
		
	}
	
	public int getLastFlagReached() {
		return this.lastFlagReached;
	}
	
	public void updateLastFlagReached() {
		
		lastFlagReached += 1;
		
	}
	
	public int getSize() {
		
		return this.size;
		
	}
	
	public int getFoodLevel() {
		
		return this.foodLevel;
		
	}
	
	public int getFoodConsumptionRate() {
		
		return this.foodConsumptionRate;
		
	}
	
	public int getHealthLevel() {
		
		return this.healthLevel;
		
	}
	
	
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setHeading() {
		
		
		
	}
	
	public int getHeading() {
		return this.heading;
	}
	
	
	
	/*Changing the heading the the ant's direction of movement*/
	@Override
	public void steer(int direction) {
		
		
		
	}
	
	
	
}