import java.util.Scanner;

public class HowOdd{
	public static void main(String[] args){
		Scanner sc_object = new Scanner(System.in);
		//Integer number
		int number = sc_object.nextInt();
		
		boolean isOdd = !(number%2==0);
		
		System.out.println(isOdd);
		
	}
}