package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
int num1=0,num2=1,num3,range=8;

//To print the initial values of Fibonacci Series
System.out.println(num1);
System.out.println(num2);
//To print the other numbers in series till max range given
for (int i = 2; i < range; i++) {
	num3=num1+num2;
System.out.println(num3);
num1=num2;
num2=num3;

}
}
}