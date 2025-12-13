import java.util.*;
public class AroundTheClock
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t,h;
	System.out.println("Enter the value of depareture time and hours");
	t = sc.nextInt();
	h = sc.nextInt();
	
	// Since it is cycle of 12
	int arrival_time = (t+h) % 12;
	System.out.println(arrival_time);
	}
}
	