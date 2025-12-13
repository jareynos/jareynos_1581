import java.util.Scanner;

public class FahrenheitToCelcius{
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in); // create scanner object
		double fahrenheit = sc_object.nextDouble(); //declare and initialize user input as double value// other methods such as next() ; nextInt() ; nextDouble()
		double celsius = (fahrenheit - 32) * (5.0/9.0); 
		System.out.println(celsius);
	}
}
