import java.util.*;

class Main
{

    // function to print half of the array in
    // ascending order and the other half in
    // descending order
    static void printOrder(int[] arr, int n)
    {
       // sorting the array
       Arrays.sort(arr);

      // printing first half in ascending order
      for (int i = 0; i < n / 2; i++) 
      { 
        System.out.print(arr[i] + " "); 
      } 
     // printing second half in descending order 
      for (int j = n - 1; j >= n / 2; j--)
      {
         System.out.print(arr[j] + " ");
      }

   }

   // Driver code
   public static void main(String[] args)
   {
      int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
      int n = arr.length;
      printOrder(arr, n);
   }
}
