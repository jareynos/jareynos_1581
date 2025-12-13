import java.util.Scanner;
class MinutesToSeconds
{
	public static void main(String[] arg)
	{
	int min,sec;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Minutes");
	min=sc.nextInt();
	sec=min*60;
	System.out.println("Seconds: "+sec);
	}
}