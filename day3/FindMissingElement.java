package week1.day3;
import java.util.Arrays;
public class FindMissingElement {

	public static void main(String[] args) 	
	{
	

	
				int num[]= {1,4,3,2,8,6,7};
				int arrayLength=num.length;
			
				Arrays.sort(num);
				
				for (int i = 1; i <=arrayLength; i++) {
					boolean ifFound=false;
				for (int j = 0; j < arrayLength; j++) {
					
				
					
						if (num[j]==i) {
							ifFound=true;
						break;
						
						}
				}
				
			
				if(ifFound==false) {
					System.out.println("The missing element is :"+i);
				
				}
				}
	}
}


	



		


	
	


