import zen.core.Zen;


public class Ball {
	int x;
	int y;
	int dx;
	int dy;
	int color = Zen.dice(5);
	

	public void create(){
		x = Zen.dice(400) + 50;
		y = Zen.dice(400) + 50;
		dx = Zen.getRandomNumber(-5,5);
		dy = Zen.getRandomNumber(-5,5);
	}
	public void move(){
		x=x+dx;
		y=y+dy;
		if (x>490 || x<10){
			dx = -dx;
		}
		
		if (y>490 ||y<10){
			dy = -dy;
		}
		
	}
	public void draw(){
		if (color== 1){
			Zen.setColor("white");
		}
		if (color== 2){
			Zen.setColor("red");
		}
		if (color== 3){
			Zen.setColor("black");
		}
		if (color== 4){
			Zen.setColor("purple");
		}
		if (color== 5){
			Zen.setColor("green");
		}
		Zen.fillOval(x-10, y-10 , 20,20);
	}
}
