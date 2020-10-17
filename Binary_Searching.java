


package javaDev;

import java.lang.reflect.Array;
import java.util.Scanner;
class BinarySearch{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	while(T>0)
	{
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 
		int key =sc.nextInt();
		Learn g = new Learn();
		System.out.println(g.bin_search(arr,0,n-1,key));
		
	}
}
}

class Learn
{
	int bin_search(int A[], int left, int right,  int k)
	{
		int[] array1={1,2,3,4,5,54,3};
		int answer;
		int min=left;
		int max= right;
	  
	while(min!=max)	{
	    int point =(min-max)/2;
	    if(k<point) {
	    	max=point-1;
	    	
	    }else if (k>point ) {
	    	
	    	min=point+1;
	    }
	    
	  
	}
	
	return min;
		
	}
}
