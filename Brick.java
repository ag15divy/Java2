package BrickBreaker;

import zen.core.Zen;

public class Brick {
	int x;
	int y;
	public Brick(int newX, int newY){
		x = newX;
		y = newY;
		
	}
	public void draw(){
		Zen.setColor("light blue");
		Zen.fillRect(x- 20, y-10, 40, 20);
	}
	
}
