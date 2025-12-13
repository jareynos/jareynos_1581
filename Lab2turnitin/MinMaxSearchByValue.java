import java.util.Scanner;
public class MinMaxSearchByValue{
public static void main(String[] args){
//get number of test cases
Scanner input = new Scanner(System.in);
int cases = input.nextInt();
//for each test case
input.nextLine();
for (int i = 0; i < cases; i++){
// get the sequence of numbers and save it
String sequence = input.nextLine();
//get the first number from sequence and save it as both max and min value
Scanner reader = new Scanner(sequence);
int min = reader.nextInt();
int max = min;
 //while there is a next numbers in sequence
 while (reader.hasNextInt() == true){
 //get the next number from the sequence
 int number = reader.nextInt();
 //if that number is smaller than min than update min value
 if (number > max){
 max = number;
 }
//if that number is bigger than max than updatemax value
 if (number < min){
 min = number;
 }
 }
//output: print sequence, min, max new line
System.out.println( sequence );
System.out.println( min );
System.out.println( max );
System.out.println();
}
}
}
