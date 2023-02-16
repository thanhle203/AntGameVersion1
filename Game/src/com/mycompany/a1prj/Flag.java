package com.mycompany.a1prj;

public class Flag extends GameObjects {
	
	private int size = 10;
	private int seqNum;
	
	public Flag(int x) {
		
		seqNum = (x + 1);
		
	}
	
	public int getFlag() {
		
		return this.seqNum;
		
	}
	
	public int getSize() {
		
		return this.size;
		
	}
	
}