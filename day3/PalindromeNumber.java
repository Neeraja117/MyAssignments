package week1.day3;

public class PalindromeNumber {

	public static void main(String[] args) {
		int input=121,output=0,remainder;
		int i=input;
	for (; i>0;i/=10) {
	
		remainder=i%10;
		output=(output*10)+remainder;
	}
if (input==output) {
	System.out.println("The given number is a palindrome");
}
else {
	System.out.println("The given number is not a palindrome");
}
	}

}
