package week1.day3;



public class FindIntersection {

	public static void main(String[] args) {
	int a[]= {3,2,11,4,6,7};
	int b[]= {1,2,8,4,9,7};
	int array1=a.length;
	int array2=b.length;
	for (int i = 0; i < array1; i++) {
		for (int j = 0; j < array2; j++) {
			if (a[i]==b[j]) {
				System.out.println("The common elements in both arrays are :"+a[i]);
			}
		}
	}
	

	}

}
