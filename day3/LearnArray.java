	package week1.day3;

	import java.util.Arrays;

public class LearnArray {




		public static void main(String[] args) {
		int num[]= {15,12,28,4,12,15};
		int arrayLength=num.length;
		System.out.println("Length of array is:"+arrayLength);
	Arrays.sort(num);
	
	System.out.println(("Min value in array after sort:"+num[0]));
	System.out.println(("Max value in array after sort:"+num[arrayLength-1]));
	for(int i=0;i<arrayLength-1;i++)
	{
		if (num[i]==num[i+1]) {
			System.out.println("The duplicate values are:"+num[i]);
		}


	}
		

	}
	}





