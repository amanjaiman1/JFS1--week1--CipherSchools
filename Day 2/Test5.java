import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Assuring You are Riding a Bike and Police Officer Stops You
		Police Officer Asking you to Provide 2 Details
		Your Current Speed
		
		if it iS Your Birthday Today ?
		
		The Police Officer Calculate Find Based on Following Parameters
		If it is your Birthday Your be Waived Off (exe.ted) with
		SMiles/Hour
		
		If it is not your Birthday No Exemption will be Given
		
		//Find the
		Speed is greater than 80 Ticket raised be • High Ticket •
		Speed is between 60 and 80 Ticket raised wilt be Ticket •
		speed is Below 60 Ticket Raised be No Ticket.
		Ticket!  */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Speed");
		int speed = scn.nextInt();
		
		System.out.println("Today is your Birthday ?");
		boolean isBirthday = scn.nextBoolean();
		
		if(isBirthday == true) {
			speed = speed-5;
		}
		
		if(speed > 80) {
			System.out.print("High Ticket");
		} else if(speed >= 60) {
			System.out.print("Mid Ticket");
		} else {
			System.out.print("No Ticket");
		}
	}

}
