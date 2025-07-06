package javaAppCICD.tree;

public class LeetcodePr {
	
	 public  static long countSubarrays(int[] nums, long k) {
	     
		 long count=0;
		int n = nums.length;
		
		long sum=0;
		
		int i=0;
		int j=0;
		
		while(j<n) {
			sum+=nums[j];
			while(i<=j && sum * (j-i+1)>=k) {
				sum-=nums[i];
				i++;
			}
			
			sum += (j-i +1);
			j++;
		}
		return sum;
	 }
	 
	 public static int countNum(int n ) {
		 if(n ==0) {
			 return n ;
		 }
		 
		 int ans =0;

		 while(n!=0) {
			 n = n / 10;
			 ++ans;
		 }
		 return ans;
	 }
	 
	 public static int findNumbers(int[] nums) {
		 int ans =0;
		 for(int i=0;i<nums.length;i++) {
			 int temp = countNum(nums[i]);
			 if(temp % 2 == 0) {
				 ++ans;
			 }
		 }
		 return ans;
		 
	 }
	 
	 
	 public static boolean threeConsecutiveOdds(int[] arr) {
	     int ans =0;
	     for(int i=0;i<arr.length;i++){
	        if(arr[i]%2 == 0){
	            ans++;
	            if(ans==3){
	                return true;
	            }
	        }
	        else{
	            ans=0;
	        }
	     }   
	     return false;
	    }
	 
	public static void main(String args[]) {
		int arr[] = {2,1,4,3,5};
		int k = 10;
		
		long ans = countSubarrays(arr, k);
		
		System.out.println(ans);
		
//		int arr2[] = {555,901,482,1771};
//		
//		int ans1 = findNumbers(arr2);
//		
//		System.out.println(ans1);
		
//		int ans[] = {1,2,34,3,4,5,7,23,12};
//        boolean test = threeConsecutiveOdds(ans);
//        System.out.println(test);
    }
	
}
