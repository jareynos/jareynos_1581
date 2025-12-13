import java.util.Scanner;
public class SimpleCalculator{
public static void main(String[] args){
//setup Scanner object
Scanner input = new Scanner(System.in);
//define class attributes
//firstInt, operator, secondInt, answer, cases
int cases = input.nextInt();
int firstInt, secondInt, answer = 1, temp;
String operator;
//setup test cases for loop
for(int i = 0;i<cases;i++){
//pull in the data
firstInt = input.nextInt();
operator = input.next();
secondInt = input.nextInt();
//design logic
//if the operator is + then add the first and second
if(operator.equals("+")){
answer = firstInt + secondInt;
}
//if the operator is - then subtract the first and second
else if(operator.equals("-")){
answer = firstInt - secondInt;
}
//if the operator is * then multiple the first and second
else if(operator.equals("*")){
answer = firstInt * secondInt;
}
//if the operator is / then divide the first and second
else if(operator.equals("/")){
answer = firstInt / secondInt;
}
//if the operator is % then modulus the first and second
else if(operator.equals("%")){
answer = firstInt % secondInt;
}
//if the operator is ** then raise the first by the second
else if(operator.equals("**")){
answer = 1;
for (int j = 0;j<secondInt;j++){
answer *= firstInt;
}
}
//print out answer
System.out.println(answer);
}//end of for loop
}//end of main method
} //end of class