import java.util.Scanner;

public class Fibonacci
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		for(int test=0; test<cases; test++)
		{
			int position = input.nextInt();
			int num1=0;//fib(0)=0
			int num2=1;//fib(1)=1
			//0        1         1      2      3       5
			//fib(0)  fib(1)  fib(2)  fib(3)  fib(4)  fib(5)
			for(int i=2; i<position; i++)
			{
				int temp = num1;
				num1 = num2;
				num2 += temp;
			}

			int result = (position < 1) ? 0 : num1+num2;
			System.out.println(result);
		}
	}
}
