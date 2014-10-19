package NinJump;

import zen.core.Zen;

public class Ninja {
	int x;
	int y;
	int dy;
	boolean jumping = false;
	Platform ground;
	public Ninja(){
		x = 400;
		y = 475;
		
	}
	
	public void draw(){
		Zen.setColor("black");
		Zen.fillOval(x-25, y-25, 50, 50);
	}
	
	public void checkPlatform(Platform p){
		if(p.y + dy > y && Math.abs(p.x - x)< 50){
			ground = p;
		}
		
	}
	public void move(){
		if(Zen.isKeyPressed("right")){
		x = x+5;	
		}
		if(Zen.isKeyPressed("left")){
		x = x-5;
		}
		if(Zen.isKeyPressed("up")&& jumping == false ){
			dy = -15;
			y = y-1;
			jumping = true;
		}
		if (ground == null){
			if(y < 475){
		y = y + dy;
		dy = dy + 1;
		}
		else{
			y = 475;
			jumping = false;
		}
		}
		else{
			if(y < ground.y){
				y = y + dy;
				dy = dy + 1;
				
			}
			else{
				y = ground.y;
				jumping = false;
			}
		}
	
		ground = null;
	}

}
