	package labs;
	
	import java.util.Scanner;
	
	public class PerformanceTask {
	
		public static void main(String[] args) {
			
		Scanner inKey1 = new Scanner(System.in);									
		System.out.print("Enter launch velocity (m/s) >>> ");	
		int launchVelocity = inKey1.nextInt();
		System.out.print("Enter launch angle (degrees) >>> ");	
		int launchAngle = inKey1.nextInt();	
		System.out.println("Projectile's path: ");
				
		int time=0;
		int yPos = 0;
		double xPos=Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
		double ypos=Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(launchAngle, launchVelocity);
		boolean launch = true;
		System.out.println("Time: " + time);
		System.out.println("xPos:  " + xPos +" m");
		System.out.println( "yPos:  " + yPos + " m");
		
		while (launch) {
		
		
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