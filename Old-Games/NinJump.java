package NinJump;
import zen.core.Zen;
import java.util.ArrayList;

public class NinJump {

	public static void main(String[] args) {
		Zen.create(800, 600);
		Ninja ned = new Ninja();
		Platform p1 = new Platform(300, 400);
		
		
		
		ArrayList<Platform> plats = new ArrayList<Platform>();
		
		while(true){
			Zen.setBackground("light blue");
			Zen.setColor("green");
			Zen.fillRect(0,500,800,100);
			
			ned.draw();
			ned.move();
			ned.checkPlatform(p1);
			p1.draw();
			
			Zen.buffer(30);
		}

	}

}
