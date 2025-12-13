import java.util.Scanner;
public class RSAPublicKey{
public static void main (String[] args){
Scanner sc_object = new Scanner(System.in);
int cases = sc_object.nextInt(); //cases = 4
//for each test cases check if the numbers are valid for generating RSA public key or not
while(cases-- > 0){ //equivalent to this statement -> for(int i=0; i < cases; i++)
long p =sc_object.nextLong();
long q = sc_object.nextLong();
long e = sc_object.nextLong();
long n = p * q;
long totient = (p-1)*(q-1);
if((isPrime(p) == false) || (isPrime(q) == false)){
System.out.println("Invalid n for RSA Key!");
}
//if e is not between 1 and totient value or e is not a corprime to n
else if(!(e>1 && e<totient) || (n%e==0)){
System.out.println("Invalid e for RSA Key!");
}
else{
System.out.printf("RSA Public KEy: n=%d e=%d%n", n,e);
}
}
}
//declare and define a method to check if a number is prime or not
//return boolean value i.e either true or false
public static boolean isPrime(long val){
long number = val; //declared and initialized a new variable to store a number
int count = 0;
for (int x = 1; x <= number; x++){
if(number%x==0){
count++;
}
if(count>=3) break;
}
return count==2; //true or false
}
}