package BrickBreaker;

import zen.core.Zen;

public class Ball {

	int x;
	int y;
	int dx;
	int dy;

	public Ball() {
		x = 240;
		y = 700;
		dx = Zen.getRandomNumber(-8, 8);
		dy = Zen.getRandomNumber(-10, -8);

	}

	public void draw() {
		Zen.setColor("black");
		Zen.fillOval(x - 10, y - 10, 20, 20);

	}

	public void move() {
		x = x + dx;
		y = y + dy;

		if (x > 490) {
			x = 490;
			dx = -dx;
		}
		if (x < 10) {
			x = 10;
			dx = -dx;
		}
		if (y < 10) {
			y = 10;
			dy = -dy;

		}

	}

}
