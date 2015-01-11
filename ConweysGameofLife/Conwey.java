package ConvoyGameOfLife;

import zen.core.Zen;

public class Convoy {
	static boolean [][] grid = new boolean [50][50];
	
	public static void main(String[] args) {
		Zen.create(500, 500);
		randomize();
		while(true){
			draw();
			click();
			if(Zen.isKeyPressed("space")){
			step();
			}
			Zen.buffer(30);
			
			}
		}
	public static void randomize(){
		for (int x = 0; x<50;x++){
			for (int y = 0; y<50; y++){
				if (Math.random() < 0.5){
					grid[x][y]=true;
				}
				else{
					grid[x][y]=false;
				}
					
			}
		}
	}
	public static void draw(){
		Zen.setBackground("black");
		Zen.setColor("white");
		for (int x = 0; x<50;x++){
			for (int y = 0; y<50; y++){
				if (grid[x][y]){
					Zen.fillRect(x*10, y*10, 10, 10);
				}
				
			}
		}
		
	}
	public static void step(){
		boolean[][] newgrid = new boolean[50][50];
		for(int x = 0; x<50; x++){
				for(int y = 0; y <50; y++){
					if(grid[x][y]==true && neighbors(x,y)<2){
						newgrid[x][y]= false;
					}
					if(grid[x][y]==true && (neighbors(x,y)==2 || neighbors(x,y)==3)){
						newgrid[x][y]=true;
					}
					if(grid[x][y]==false && neighbors(x,y)==3){
						newgrid[x][y]=true;
					}
				}
		}
		grid= newgrid;
	}
	public static int neighbors(int x, int y){
		int count = 0;
		if (x>0 && y>0 && grid[x-1][y-1]){
			count++;
		}
		if(y>0 && grid[x][y-1] ){
			count++;
		}
		if(x<49 && y>0 && grid[x+1][y-1]){
			count++;
		}
		if(x>0 && grid[x-1][y] ){
			count++;
		}
		if(x<49 && grid[x+1][y]){
			count++;
		}
		if(x>0 && y<49 && grid[x-1][y+1]){
			count++;
		}
		if(y<49 && grid[x][y+1] ){
			count++;
		}
		if(x<49 && y<49 && grid[x+1][y+1]){
			count++;
		}
		return count;
	}
	public static void click(){
		if(Zen.isMouseClicked() ){
			int x= Zen.getMouseClickX() / 10;
			int y= Zen.getMouseClickY() / 10;
			if (x<50&&y<50) {
				grid[x][y] = true;
			}
			
		}
		
	}


}
