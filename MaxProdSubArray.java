import java.io.*;
 
class Main {
    /* Returns the product of max product subarray.*/
    static int maxSubarrayProduct(int arr[], int n){
        // max positive product
        // ending at the current position
        int max_ending_here = arr[0];
 
        // min negative product ending
        // at the current position
        int min_ending_here = arr[0];
 
        // Initialize overall max product
        int max_so_far = arr[0];
    
        for (int i = 1; i < n; i++)
        {
            int temp = max({arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here});
       
            min_ending_here = min({arr[i], arr[i] * max_ending_here, arr[i] * min_ending_here});
            max_ending_here = temp;
            max_so_far = max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
        System.out.println("Maximum Sub array product is " + maxSubarrayProduct(arr));
    }
}
