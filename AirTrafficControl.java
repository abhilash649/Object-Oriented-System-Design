
package airTraffic;
import java.util.*;

public class AirTrafficControl{


//static Aircraft aircraft = new Aircraft ();

static Scanner in = new Scanner (System.in);
	private static int k;
	private static int[][] lane={{1,0},{1,0},{1,0},{1,0},{1,0},{1,0},{1,0},{1,0}};
	//private static int[][] lan={}
	private static int[][] elane={{1,0},{1,0}};
	private static String[] laneFlight=new String[8];
	private static String[] elaneFlight=new String[2];

public static void landing() {
	for(k=0;k<8;k++){
		if(lane[k][0]==1) break;
	}
	if(k==8){ 
		System.out.println("Sorry!!! All lanes are occupied.");
		System.out.println("Please wait for the aircraft to take off or in case of emergency inform the airport.");
	}
	else{ 
		System.out.println("Enter the number and name of flight ");
		System.out.print("Number");
		lane[k][1]=in.nextInt(); lane[k][0]=0; in.nextLine();
		System.out.print("Name");
		laneFlight[k]=in.nextLine();
	}
}
    
    public static void showFlight () {
    System.out.println("Enter flight number for details: ");
    int flag=0;
    int check = in.nextInt();
    for(k=0;k<8;k++){
    	if(lane[k][1]==check){
    		System.out.print("Flight number:"+lane[k][1]+"  Flight name:"+laneFlight[k]+" is in lane "+(k+1));
    		flag=1;
    	}
    }
    for(k=0;k<2;k++){
		if(elane[k][1]==check){
			System.out.print("Flight number:"+elane[k][1]+"  Flight name:"+elaneFlight[k]+" is in emergency lane "+(k+1));
			flag=1;
		}
	}
    if(flag==0) System.out.println("the flight number you entered may be incorrect!! please try again");
}


    public static void displayAll () {
    	for(k=0;k<8;k++){
    		if(lane[k][0]==0){
    			System.out.print("Flight number:"+lane[k][1]+"  Flight name:"+laneFlight[k]+" is in lane "+(k+1));
    		}
    	}
    	for(k=0;k<2;k++){
    		if(elane[k][0]==0){
    			System.out.print("Flight number:"+elane[k][1]+"  Flight name:"+elaneFlight[k]+" is in emergency lane "+(k+1));
    		}
    	}
    }

    public static void removeFlight (){

        System.out.printf("Enter flight number to take off the plane ");
        int flag=0;
        int check = in.nextInt();
    	for(k=0;k<8;k++){
        	if(lane[k][1]==check){
        		System.out.print("Flight name:"+laneFlight[k]+" in lane "+(k+1)+" is ready to take off.");
        		flag=1;
        		lane[k][0]=1;
        	}
        }
        for(k=0;k<2;k++){
    		if(elane[k][1]==check){
    			System.out.print("Flight name:"+elaneFlight[k]+" in emergency lane "+(k+1)+" is ready to take off.");
    			flag=1;
    			elane[k][0]=1;
    		}
    	}
        if(flag==0) System.out.println("the flight number you entered may be incorrect!! please try again");
}
    public static void elanding() {
    	for(k=0;k<2;k++){
    		if(lane[k][0]==1) break;
    	}
    	if(k==2){ 
    		System.out.println("Sorry!!! All emergency lanes are occupied.");
    	}
    	else{ 
    		System.out.println("Enter the number and name of flight ");
    		System.out.print("Number");
    		elane[k][1]=in.nextInt(); elane[k][0]=0; in.nextLine();
    		System.out.print("Name");
    		elaneFlight[k]=in.nextLine();
    	}
    }
}