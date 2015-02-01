import zen.core.Zen;


public class Log {
		int x;
		int y;
		int width;
		int length;
		int speed;
		
	public void setup(){
		x = -100;
		y = Zen.getRandomNumber(20,150);
		width = Zen.getRandomNumber(20, 40);
		length = Zen.getRandomNumber(5, 15);
		speed = Zen.getRandomNumber(2,5);
	}
	public void draw(){
	
		Zen.setColor("brown");
		Zen.fillRect(x, y, width, length);
		
		
	}
	public void move(){
		x = x + speed;
		if (x>800){
			setup();
		}
		
	}
		
}

