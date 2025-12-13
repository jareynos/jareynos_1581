import java.util.Scanner;
public class RockPaperScissors
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int cases = input.nextInt();
input.nextLine();
//String player1 = input.nextLine();
//String player2 = input.nextLine();
for(int i = 0; i < cases; i++){
String player1 = input.next();
String player2 = input.next();
String paper = "paper";
String rock = "rock";
String scissors = "scissors";
if(player1.equals(paper) & player2.equals(paper)) {
System.out.println("Tie!");
}
else if(player1.equals(rock) & player2.equals(rock)){
System.out.println("Tie!");
}
else if(player1.equals(scissors) & player2.equals(scissors)){
System.out.println("Tie!");
}
else if(player1.equals(rock) & player2.equals(scissors)){
System.out.println("Player 1 wins!");
}
else if(player1.equals(scissors) & player2.equals(rock)){
System.out.println("Player 2 wins!");
}
else if(player1.equals(scissors) & player2.equals(paper)){
System.out.println("Player 1 wins!");
}
else if(player1.equals(paper) & player2.equals(scissors)){
System.out.println("Player 2 wins!");
}
else if(player1.equals(paper) & player2.equals(rock)){
System.out.println("Player 1 wins!");
}
else if(player1.equals(rock) & player2.equals(paper)){
System.out.println("Player 2 wins!");
}
}
}
}