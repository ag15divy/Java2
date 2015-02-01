package BrickBreaker;

import zen.core.Zen;

public class TouchingBrick extends Brick{
	public TouchingBrick(int newX, int newY){
		x = newX;
		y = newY;
		health = 2;
	}
	public void draw(){
		Zen.setColor("purple");
		Zen.fillRect(x - 20, y - 10, 40, 20);
	}
}
