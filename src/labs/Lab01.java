package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Choose a Posotive Integer: ");
		int userNum = inKey.nextInt();
		
		System.out.print("Choose a Posotive Integer: ");
		int userNum2 = inKey.nextInt();
		
		System.out.println(userNum + "^" + userNum2 + " = " + Math.pow(userNum, userNum2) + "");
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Choose a Posotive Integer: ");
		int userNum = inKey.nextInt();
		
		System.out.println("The square root of " + userNum + " is " + Math.sqrt(userNum));
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("What is the right triangles A side length? ");
		int userNum = inKey.nextInt();
		
		System.out.print("What is the right triangles A side length? ");
		int userNum2 = inKey.nextInt();

		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(userNum, 2) + (Math.pow(userNum2, 2))));
	}


	
	
	public static void problem04() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Scanner inKey = new Scanner(System.in);
		int userNum = 1;
		boolean not0 = true;
		
		while (not0) {
			System.out.print("Choose any integer, input 0 when you're ready to continue: ");
			userNum = inKey.nextInt();
			if (userNum == 0) {
				not0 = false;
			}
			else {
				if (userNum > max){
					max = userNum;
				}
				else if (userNum < min && userNum != 0) {
					min = userNum;
				}
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min + "\n");
	}
	
	
	
	
	
	
}
