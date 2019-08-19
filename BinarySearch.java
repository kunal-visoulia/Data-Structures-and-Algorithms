import java.util.Scanner;


public class BinarySearch {

	int binarysearch(int arr[], int x, int len){
		int low = 0;
		int high = len-1;
		
		while(low <= high){
			int m=low+(high-low)/2;
			if(arr[m]==x){
				return m;
			}
			
			if(arr[m]<x){
				low=m+1;
			}
			
			else
				high=m-1;
		}
	return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     System.out.println("Hello Java"); 
		BinarySearch bs = new BinarySearch();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter n");
	     int n = sc.nextInt();
	     int arr[] = new int[n];
	     System.out.println("Enter elements in ascending order");
	     for(int i=0;i<n;i++){
	    	 arr[i] = sc.nextInt();
	     }
//	     for(int i=0;i<n;i++){
//	     System.out.println(arr[i]);
//	     }
	     System.out.println("Enter number to find");
	     int x = sc.nextInt();
	     int result = bs.binarysearch(arr,x,n);
	     if(result==-1)
		     System.out.println("element not found");
	     else
		     System.out.println("element found at index "+result);

	     

	     sc.close();
	     	     }

}
