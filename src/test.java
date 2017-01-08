import java.util.Random;

import org.jointheleague.graphical.robot.*;
public class test {
public static void main(String[] args) {
Random random = new Random();	
	Robot John = new Robot();
while(0==0){
	John.setSpeed(100);
	John.setPenColor(random.nextInt(255),random.nextInt(255),random.nextInt(255));
	John.penDown();
	John.move(random.nextInt(200));
	John.turn(random.nextInt(360));

}

	
	
}

}
