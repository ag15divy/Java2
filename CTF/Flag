package CTF;

import zen.core.Zen;

public class Flag {
	int x;
	int y;
	String owner;
	String team;
	public Flag(String color){
		team = color;
		owner = Zen.read(team + "owner");
		
	}
	public void draw(){
		Zen.setColor(team);
		Zen.fillRect(x - 15, y - 15, 30, 30);
		
	}
	public void move(){
		
	}
}
