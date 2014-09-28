import zen.core.Zen;


public class Truck {
		int x;
		int lane;
		int speed;
		
		public boolean isKilling(Frog target){
			int y = 180 + 50 * lane;
			if (Math.abs(target.x - (x + 80)) < 30 && Math.abs(target.y- y )< 30 ){
				
			}else{
				return false;
			}
			return false;
			
		}
	public void setup(){
		x = -100;
		lane = Zen.getRandomNumber(0,5);
		speed = Zen.getRandomNumber(5, 10);
	}
	public void draw(){
		int y = 180 + 50 * lane;
		Zen.setColor("light blue");
		Zen.fillRect(x, y, 80, 40);
		
		
	}
	public void move(){
		x = x + speed;
		if (x>800){
			setup();
		}
	}
		
}
