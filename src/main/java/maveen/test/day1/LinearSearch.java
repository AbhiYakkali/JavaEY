package maveen.test.day1;
import java.util.*;


public class LinearSearch {
	
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = in.nextInt();
		int[] arr = new int[n];
	         
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		System.out.println("");
		
		
		 System.out.println("Enter Num to search");
		 int search = in.nextInt();
		 int flag=1;
		 
		 for(int i=0;i<n;i++) {
			 if(search == arr[i]) {
				 System.out.println(search+" is found in the array");
				 flag=0;
				 break;
			 }
		 }
		 if(flag==1) {
			 System.out.println(search+" is not found in the array");
		 }
		 

		  in.close();
	}

   

}


