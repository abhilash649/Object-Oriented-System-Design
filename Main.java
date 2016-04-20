package airTraffic;

import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	private static int loop=1;
	public static void main(String[] args) {

	    do {
	        try {
	            System.out.println("Please enter command to proceed: ");
	            System.out.println("prees 1 to Enter new aircraft in the airport");
	            System.out.println("prees 2 to Display all aircraft");
	            System.out.println("prees 3 to Show specific flight ");
	            System.out.println("prees 4 to take off an aircraft from the airport");
	            System.out.println("prees 5 to For emergency landing");
	            System.out.println("prees 0 to exit");
	            int val = in.nextInt();
	            if ( val==1 ) {
	                AirTrafficControl.landing();
	                System.out.println("press 1 to continue and 0 to exit");
	                loop=in.nextInt();
	                
	            } else if ( val==2 ) {
	            	AirTrafficControl.displayAll();
	            	System.out.println("press 1 to continue and 0 to exit");
	                loop=in.nextInt();

	            } else if ( val==3 ){
	                AirTrafficControl.showFlight();
	                System.out.println("press 1 to continue and 0 to exit");
	                loop=in.nextInt();

	            } else if ( val==4 ) {
	            	AirTrafficControl.removeFlight();
	            	System.out.println("press 1 to continue and 0 to exit");
	                loop=in.nextInt();

	            } else if ( val==5 ) {
	            	AirTrafficControl.elanding();
	            	System.out.println("press 1 to continue and 0 to exit");
	                loop=in.nextInt();
	                
	            } else if(val==0){
	            	break;
	            }
	        } catch (InputMismatchException ex) {
	            System.out.println("Wrong entry, please try again:");
	        }
	    } while (loop==1);
	}
	
}
