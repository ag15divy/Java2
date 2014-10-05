package BrickBreaker;
import zen.core.Zen;
public class Paddle {
		int x;
		int y;
	public Paddle(){
		x = 250;
		y = 750;
	}
	
	
	public void draw() {
		Zen.setColor("red");
		Zen.fillRect(x-40, y, 80, 10);
		
	}

	public void move() {
		if (Zen.isKeyPressed("right")){
		x = x+ 10;
	}
		if (Zen.isKeyPressed("left")){
			x = x- 10;
		}
		 
	}
}
