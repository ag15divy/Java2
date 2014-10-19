package NinJump;

import zen.core.Zen;

public class Platform {
	int x;
	int y;
	public Platform(int goToThisX, int goToThisY){
		x = goToThisX;
		y = goToThisY;
	}
	public void draw(){
		Zen.setColor("white");
		Zen.fillRect(x - 50, y -5, 100, 10);
	}
}
