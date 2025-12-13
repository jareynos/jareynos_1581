public class Fraction{
private int numerator;
private int denominator;
//constructor
public Fraction(int numerator, int denominator){
this.numerator = numerator;
this.denominator = denominator;
}//end of constructor
public Fraction add(Fraction otherFraction){
int commonDenom = this.denominator * otherFraction.denominator;
int number1 = this.numerator * otherFraction.denominator;
int number2 = otherFraction.numerator * this.denominator;
int newNum = number1 + number2;
return new Fraction( newNum, commonDenom);
}//end add
@Override
public String toString(){
return this.numerator + "/" + this.denominator;
}//end of toString
public Fraction subtract(Fraction otherFraction){
int commonDenom = this.denominator * otherFraction.denominator;
int number1 = this.numerator * otherFraction.denominator;
int number2 = otherFraction.numerator * this.denominator;
int newNum = number1 - number2;
return new Fraction(newNum, commonDenom);
}
public Fraction multi(Fraction otherFraction){
int number1 = this.denominator * otherFraction.denominator;
int number2 = this.numerator * otherFraction.numerator;
return new Fraction(number1, number2);
}
public Fraction div(Fraction otherFraction){
int number1 = this.denominator * otherFraction.numerator;
int number2 = this.numerator * otherFraction.denominator;
return new Fraction(number1, number2);
}
}