import java.util.Random;

import org.jointheleague.graphical.robot.*;
public class robotShapeMaker {
private Robot john;
	
	
	robotShapeMaker(Robot r){
	this.john=r;
john.hide();
	
	

	
}
	Random random = new Random();

	public void drawSquare(){
	int length = random.nextInt(500);
	john.penDown();	
	john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
	    john.setSpeed(10);
		john.move(length);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.turn(90);
		john.move(length);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.turn(90);
		john.move(length);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.turn(90);
		john.move(length);
}
	public void drawCircle(){
	for (int i =0;i<360;i++){
	john.setSpeed(10);
	john.penDown();
	john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
	john.move(2);
	john.turn(1);
		
	}	
	}
	public void drawTriangle(){
		john.move(120);
		john.turn(120);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.move(120);
		john.turn(120);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.move(120);
		john.turn(120);
		
	}
	public void drawRect(){
		john.move(50);
		john.turn(90);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.move(120);
		john.turn(90);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.move(50);
		john.turn(90);
		john.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
		john.move(120);
	}
	public void drawCube(){
		john.penUp();
		int y = 500;
		int x = 500;
		john.moveTo(x, y);
		john.penDown();	
		john.setRandomPenColor();
		    john.setSpeed(10);
			john.move(100);
						john.turn(90);
			john.move(100);

			john.turn(90);
			john.move(100);
	
			john.turn(90);
			john.move(100);

			   john.setSpeed(10);
				john.turn(10);
			   john.move(20);
				john.turn(-10);
			   

				john.turn(90);
				john.move(100);

				john.turn(90);
				john.move(100);

				john.turn(90);
				
				john.move(104);
				john.turn(90);
				
				
				john.move(80);
				john.turn(90);
				john.move(100);
				john.turn(-80);
				john.move(20);
john.turn(-190);
				john.move(100);
				john.turn(10);
				john.move(20);


		
	}


}


	
	
	
	
	


