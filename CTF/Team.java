package CTF;

import java.util.ArrayList;


public class Team {
	ArrayList <Player> players;
	Flag myFlag;
	public Team(String color){
		players = new ArrayList <Player> ();
		myFlag = new Flag(color);
		
	}
	public void addPlayer(Player p ){
		players.add(p);
	}
	public void draw(){
		for(Player p : players){
			p.draw();
		}
	}
	public void move(){
		myFlag.draw();
		for(Player p : players){
			p.move();
		}
		
	}
	public boolean isTouching(Player target) {
		for(Player p : players){
			if(Math.abs(p.x - target.x) < 20 && Math.abs(p.y-target.y)<20){
				return true;
			}
		}
				return false;
	}

}
