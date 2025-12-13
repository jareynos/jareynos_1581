import java.util.Scanner;

public class SummingItUp{
	public static void main(String[] args){
	
		// create a scanner object of name inputScanner to read input
		Scanner inputScanner = new Scanner(System.in);
			int number_testcase = inputScanner.nextInt();
			for(int j=0;j<number_testcase;j++)
			{
				//declaration of results variable as integer type
				int result=0;
				
				int x = inputScanner.nextInt();
				
				int y = inputScanner.nextInt();
				
				int begin, end;
				// 10 4
				if (x<y){
						 begin=x;
						 end=y;
				}
				else
				{
						 begin=y;
						 end=x;
				}
				// begin=4 end=10
				//i=4 result=0+4=4
				//i=5 result=4+5=9
				//............
				
				//i=10
				for(int i=begin;i<=end;i++)
				{
						result+=i;
				}
				
				System.out.println(result);
		}
	}
}