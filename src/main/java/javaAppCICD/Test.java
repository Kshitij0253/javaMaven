package javaAppCICD;

public class Test {
	
	public static int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
       int result = k;

       for (int i = 0; i <= n - k; i++) {
           int W = 0;
           for (int j = i; j - i + 1 <= k; j++) {
               if (blocks.charAt(j) == 'W') {
                   W++;
               }
           }
           result = Math.min(result, W);
       }

       return result;
   }
	
	public static int maxSum(int arr[], int n, int k)
	    {
	        
	        int max_sum = Integer.MIN_VALUE;

	       
	        for (int i = 0; i < n - k + 1; i++) {
	            int current_sum = 0;
	            for (int j = 0; j < k; j++)
	                current_sum = current_sum + arr[i + j];

	            max_sum = Math.max(current_sum, max_sum);
	        }

	        return max_sum;
	    }

		  public static void main(String[] args) {
		        System.out.println("Try programiz.pro");
//		        int [] arr = {0,1,5,10,14};
//		        int k = arr.length - 3;
//		        System.out.println(k);
//		        int ans = arr[arr.length-1]-arr[0];
//		        System.out.println(ans);
//		        for(int i = k -1;i<arr.length;i++){
//		            ans = Math.min(ans,arr[i]-arr[i-k+1]);
//		            
//		        }
//		        System.out.println(ans);
//		    }
		        //
//		        String s = "WBBWWBBWBW";
//		        int k = 7;
//		        int ans = minimumRecolors(s, k);
//		        System.out.println(ans);
		        
		        //sliding window
		        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		        int k = 4;
		        int n = arr.length;
		        System.out.println(maxSum(arr, n, k));
		  }
		        
		  
	}
