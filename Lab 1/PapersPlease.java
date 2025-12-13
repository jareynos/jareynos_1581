import java.util.Scanner;
public class PapersPlease {
	public static void main( String[] args){
		/**
		*Using Scanner class object named sc to take input from the user
		**/
		Scanner sc = new Scanner(System.in);
		
		/**
		* Boolean variables declaration
		**/
		boolean passport, drivingLicense, birthCertificate;
		/**
		* Scanning the input
		**/
		passport = sc.nextBoolean();
		drivingLicense = sc.nextBoolean();
		birthCertificate = sc.nextBoolean();
		
		if(passport==true || (drivingLicense==true && birthCertificate==true)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
		