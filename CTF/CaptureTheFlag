package CTF;

import zen.core.Zen;

public class CaptureTheFlag {

	public static void main(String[] args) {
		Zen.connect("capture the flag");
		Zen.write("divyax", 250);
		Zen.write("divyay", 250);
		Zen.write("divyateam", "red");
		Zen.create(1000, 500);
		
		Player me = new Player ("divya");
		Game g = new Game();
		Team redTeam = new Team("red");
		redTeam.addPlayer(me);
		redTeam.addPlayer(new Player("ruchi"));
		redTeam.addPlayer(new Player("alejandro"));
		redTeam.addPlayer(new Player("nathan"));
		redTeam.addPlayer(new Player("aakash"));
		redTeam.addPlayer(new Player("keshav"));
		g.addTeam(redTeam);
		
		Team blueTeam = new Team("blue");
		blueTeam.addPlayer(new Player("nicolas"));
		blueTeam.addPlayer(new Player("anoop"));
		blueTeam.addPlayer(new Player("amogh"));
		blueTeam.addPlayer(new Player("rishi"));
		blueTeam.addPlayer(new Player("rohan"));
		g.addTeam(blueTeam);
		while(true){
			Zen.setBackground("green");
			Zen.setColor("white");
			Zen.drawLine(500, 0, 500, 500);
			if (Zen.isKeyPressed("left") && getX()>0){
				Zen.write("divyax", Zen.readInt("divyax") - 10);
			}
			if (Zen.isKeyPressed("right") && getX()<1000){
				Zen.write("divyax", Zen.readInt("divyax") + 10);
			}
			if (Zen.isKeyPressed("up") && getY()>0){
				Zen.write("divyay", Zen.readInt("divyay") - 10);
			}
			if (Zen.isKeyPressed("down") && getY()<500){
				Zen.write("divyay", Zen.readInt("divyay") + 10);
			}
			if (getX()>50 && blueTeam.isTouching(me)){
				Zen.write("divyax", 250);
				Zen.write("divyay", 250);
			}
			g.draw();
			g.move();
			Zen.buffer(33);
		}

	}
	private static int getX(){
		return Zen.readInt("divyax");
	}
	private static int getY(){
		return Zen.readInt("divyay");
	}

}
