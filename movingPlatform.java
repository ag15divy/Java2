package NinJump;

import zen.core.Zen;

public class MovingPlatform extends Platform {

	int x;
	int y;
	public void Platform(int goToThisX, int goToThisY){
		x = goToThisX;
		y = goToThisY;
	}
	public void draw(){
		Zen.setColor("white");
		Zen.fillRect(x - 50, y -5, 100, 10);
	}
}


