package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {     
	Robot r1 = new Robot(100, 300);  
	Robot r2 = new Robot(200, 200);  
	Robot r3 = new Robot(300, 300); 
	Robot r4 = new Robot(400, 200); 
	Robot r5 = new Robot(500, 300); 
	
	r1.hide();
	r2.hide();
	r3.hide();
	r4.hide();
	r5.hide();
	
	r1.setSpeed(10);  
	r1.setPenColor(Color.BLUE);
	r2.setSpeed(10); 
	r2.setPenColor(Color.YELLOW);
	r3.setSpeed(10); 
	r3.setPenColor(Color.BLACK);
	r4.setSpeed(10);
	r4.setPenColor(Color.GREEN);
	r5.setSpeed(10);
	r5.setPenColor(Color.RED);
	
	r1.penDown();
	r2.penDown();
	r3.penDown();
	r4.penDown();
	r5.penDown();
	
	new Thread(()->{for(int i = 0; i <= 360; i++){r1.move(2);r1.turn(1);}}).start();
	new Thread(()->{for(int i = 0; i <= 360; i++){r2.move(2);r2.turn(1);}}).start();
	new Thread(()->{for(int i = 0; i <= 360; i++){r3.move(2);r3.turn(1);}}).start();
	new Thread(()->{for(int i = 0; i <= 360; i++){r4.move(2);r4.turn(1);}}).start();
	new Thread(()->{for(int i = 0; i <= 360; i++){r5.move(2);r5.turn(1);}}).start();
	
	
	}
	
}

