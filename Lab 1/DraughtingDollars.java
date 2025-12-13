import java.util.Scanner;

public class DraughtingDollars{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double kegInGallons = 15.5;
		double kegInOunces = kegInGallons * 128;
		double kegRemaining = input.nextDouble();
		double price = input.nextDouble();
		double ouncesRemaining = kegInOunces * kegRemaining;
		double pintsRemaining = ouncesRemaining / 16;
		double dollarSupply = pintsRemaining * price;
		System.out.printf("There is %.2f of beer left in keg\n", dollarSupply);
	}
}