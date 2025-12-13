import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int i = 0; i < cases; i++){
			int num = input.nextInt();
			if (num % 3 == 0 && num % 5 == 0){
				System.out.println("fizzbuzz");
			}
			else if (num % 3 == 0 ){
				System.out.println("fizz");
			}
			else if (num % 5 == 0 ){
				System.out.println("buzz");
			}
			else{
				System.out.println(num);
			}
		}
	}
}