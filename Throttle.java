package car;

import java.util.Scanner;

public class Throttle {
	private static int brake=0;
	private static int engine=1;
	private static int acc=0;
	private static float currentSpeed=0;
	private static float desiredSpeed=0;
	private static float wheel;
	private static float time;
	private static float throttleSetting=0;
	public static void changeSpeed(float cs,float ds){
		if(ds>cs){
			System.out.println("your car is running slow. The accl is pressed to achieve the desired speed");
			System.out.print("You will soon achieve the desired speed.");
			throttleSetting=((int)(ds-cs))/15+1;
			System.out.println("Throttle setting has been changed to:"+ throttleSetting );
			acc=1; brake=0;
			currentSpeed=desiredSpeed;
		}
		else if(ds==cs){
			System.out.println("your car is running at perfect speed.");
			System.out.println(" The accl and brake is released to maintain the desired speed");
			acc=0; brake=0;
		}
		else{
			System.out.println("your car is running fast. The brake is pressed to achieve the desired speed.");
			System.out.print("You will soon achieve the desired speed.");
			throttleSetting=((int)(ds-cs))/15+1;
			System.out.println("Throttle setting has been changed to:"+ throttleSetting );
			acc=0; brake=1;
			currentSpeed=desiredSpeed;
		}
	}
	public static void main(String args[])
	{
		Scanner input;
		int choice;
		int flag=1;
	while(flag==1) 
	{
		System.out.println("Welcome to car control System!!");
		System.out.println("Press 1 to turn the engine on or off");
		System.out.println("Press 2 to change the brake state");
		System.out.println("Press 3 to find out the current speed");
		System.out.println("Press 4 to set the desired speed");
		System.out.println("Press 5 to change the accelerator state ");
		System.out.println("Press 6 to exit");
		input=new Scanner(System.in);
		choice= input.nextInt();
		switch(choice)
		{
		case 1: 
				if(engine==1){
					System.out.println("Your engine is on.press 0 to turn it off or 1 to continue");
					engine=input.nextInt();
				}
				else{
					System.out.println("Your engine is off.press 1 to turn it on");
					engine=input.nextInt();
				}
				System.out.println("1. exit\n2. continue");
				choice=input.nextInt()-1;
		        break;
		        
		case 2: 
				if(brake==1){
				System.out.println("Your brake state is pressed.press 0 to release the brake");
				brake=input.nextInt();
				}
				else{
				System.out.println("Your brake state is released.press 1 to press the brake");
				brake=input.nextInt();
				}
				System.out.println("1. exit\n2. continue");
				choice=input.nextInt()-1;
		        break;
		        
		case 3: System.out.println("please enter the pulse obtained from the wheel");
		       	wheel=input.nextFloat();
		        System.out.println("please enter the time obtained from the clock");
		        time=input.nextFloat();
		        currentSpeed=wheel/time;
		        System.out.println("THE CURRENT SPEED OF THE CAR IS:"+(currentSpeed));
		        System.out.println("1. exit\n2. continue");
				choice=input.nextInt()-1;
		        break;
		        
		case 4: System.out.println("Current Speed="+currentSpeed);
		        System.out.println("PLEASE ENTER THE DESIRED SPEED YOU WISH TO ACHIEVE");
		        desiredSpeed=input.nextFloat();
		        changeSpeed(currentSpeed,desiredSpeed);
		        System.out.println("1. exit\n2. continue");
				choice=input.nextInt()-1;
		        break;
		        
		case 5: 
				if(acc==1){
				System.out.println("Your accl state is pressed.press 0 to release the accl");
				acc=input.nextInt();
				}
				else{
				System.out.println("Your accl state is released.press 1 to press the accl");
				acc=input.nextInt();
				}
				System.out.println("1. exit\n2. continue");
				choice=input.nextInt()-1;
		        break;
		case 6: 
				choice=0;
				break;
		default: System.out.println("PLEASE ENTER A VALID CHOICE");
		         break;
		         
		}
	}

	}
}
