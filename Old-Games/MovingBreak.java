package BrickBreaker;

import zen.core.Zen;

public class MovingBrick extends Brick {
	int dx = 4;
	public MovingBrick(int newX, int newY) {
		x = newX;
		y = newY;
		health = 1;
	}
	public void move(){
		if(x < 25){
			dx = 4;
		}
		if (x > 475){
			dx = -4;
		}
		x = x +dx;
	}
	public void draw(){
		Zen.setColor("yellow");
		Zen.fillRect(x - 20, y- 10, 40, 20);
	}

}
