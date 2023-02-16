package com.mycompany.a1prj;


import java.util.ArrayList;


import com.codename1.ui.events.ActionListener;
import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;

public class GameWorld {
	
	private int lives;
	private playerAnt myAnt;
	private ArrayList<GameObjects> gameObject;
	
	public static final int maxLives = 3;
	
	
		/*initiate game world and construct all game objects necessary to world*/	
		public void init() {
		
			this.lives = maxLives;
			this.gameObject = new ArrayList<>();
			if(this.myAnt != null) {
				this.myAnt = new playerAnt();
				this.myAnt.setColor(ColorUtil.rgb(255,0,0));
			}
			else {
				System.out.println("Cannot create new ant. Player Ant already exists in this game world.");
			}
			for(int i = 0; i < 9; i++) {
				
				gameObject.add(new Flag(i));
				gameObject.get(i).setColor(ColorUtil.rgb(0,0,255));
				
			}
			for(int i = 0; i < 2; i++) {
				
				gameObject.add(new FoodStations());
				gameObject.get(i).setColor(ColorUtil.rgb(0,255,0));
				
			}
			for(int i = 0; i < 2; i++) {
				
				gameObject.add(new Spider());
				gameObject.get(i).setColor(ColorUtil.rgb(0,0,0));
				
			}
			
			
		}
		
		public void accelerate() {
			
			this.myAnt.setSpeed(this.myAnt.getSpeed() + 1);
			
		}
		
		public void brake() {
			
			this.myAnt.setSpeed(this.myAnt.getSpeed() + 1);
			
		}
		
		public void flag(int x) {
			
			Flag flagNum = (Flag) gameObject.get(x);
			
			int num = flagNum.getFlag();
			
			if(num > this.myAnt.getLastFlagReached() && Math.abs(this.myAnt.getLastFlagReached()-num) == 1) {
				
				this.myAnt.updateLastFlagReached();
				
			}
			else {
				System.out.println("Cannot Update Flag. You have reached a flag that is not the next sequence.");
			}
			
			
		}
		

		public void foodCollision() {
			
		}
		
		public void spiderCollision() {
			
		}
		
		public void left() {
			
		}
		
		public void right() {
			
		}
		
		public void clock() {
			
		}
		
		public void display() {
			
		}
		
		public void map() {
			
			this.myAnt.getColor();
			
		}
		
		public void exit() {
			
			System.exit(0);
			
		}
		
		
	}