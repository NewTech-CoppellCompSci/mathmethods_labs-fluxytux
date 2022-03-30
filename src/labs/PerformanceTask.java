	package labs;
	
	import java.util.Scanner;
	
	public class PerformanceTask {
	
		public static void main(String[] args) {
			
		Scanner inKey1 = new Scanner(System.in);		
		//Asks for launch velocity and angle
		System.out.print("Enter launch velocity (m/s) >>> ");	
		int launchVelocity = inKey1.nextInt();
		System.out.print("Enter launch angle (degrees) >>> ");	
		int launchAngle = inKey1.nextInt();	
		//prints "projectile path
		System.out.println("Projectile's path: ");
		//integers for time, y position, and x positions
		int time=0;
		int yPos = 0;
		//calculates x and y positions with decimals 
		double xPos=Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
		double ypos=Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(launchAngle, launchVelocity);
		boolean launch = true;
		System.out.println("Time: " + time);
		System.out.println("xPos:  " + xPos +" m");
		System.out.println( "yPos:  " + yPos + " m");
		
		while (launch) {
		
		//adds time to equation calculates velocity w/ time
		     time++;
		     xPos=Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
		     yPos=Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(ypos, ypos);
		     
		     if (yPos < 0) {
		         yPos=0;
		
		
		     }
		     System.out.println("Time: " + time );
		   System.out.println("xPos:  " + xPos +" m");
		   System.out.println( "yPos:  " + yPos + " m");
	
	         if (yPos==0) {
	             launch=false;
	       }   
		}    
		}
		}