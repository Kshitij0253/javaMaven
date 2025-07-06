package javaAppCICD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove_elememt {

	  public static int removeElement(int[] nums, int val) {
	      
	    List<Integer> il = new ArrayList<Integer>();
	    
	       int ans2 =0;
	       for(int i=0;i<nums.length;i++) {
	    	   if(nums[i]==val) {
	    		   ans2++;
	    	   }
	    	   else {
	    		   il.add(nums[i]);
	    	   }
	       }
	       System.out.println(il);
	        return ans2;
	    }
	  
	  
	  public static int removeElementLetCha(int[] nums, int val) {
	        int i = 0;
	       
	        for (int j = 0; j < nums.length; j++) {
	            if (nums[j] != val) {
	                nums[i] = nums[j];
	                i++; 
	            }
	        }
	        return i;
	    }
	  public int removeDuplicates(int[] nums) {
		  int ans =0;
		 for(int i=0;i<nums.length;i++) {
			 
		 }
		 return ans;
	    }
	  
	  public static int minCapability(int[] nums, int k) {
	        int ans = Integer.MAX_VALUE;
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                int sample = nums[i]+nums[j];
	                ans = Math.min(ans,sample);
	            }
	        }
	        return ans;
	    }
	  
	  public static int minCapability2(int[] nums,int k) {
		  int ans = Integer.MIN_VALUE;
		  List<Integer> test = new ArrayList<Integer>();
		  
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1+1;j<nums.length;j++){

	                ans = Math.max(nums[i],nums[j]);
	                test.add(ans);

	            }
	        }
	        
	        int minValue = Collections.min(test);  
	        System.out.println("Minimum value from the test list: " + minValue);
	        
	        return minValue;  
	      
	  }
	public static void main(String args[]) {
		
		System.out.println("LeetCode Remove Element problem medium ");
		int[] nums = {3,2,2,3};
		int val = 3;
		int ans = removeElementLetCha(nums,val);
		int[] nums2 = {2,7,9,3,1};
		int [] nums3 = {2,3,5,9};
		int k = 2;
		int minCap = minCapability2(nums3,k);

		System.out.println(minCap);
		
		
//		System.out.println(ans);
	}
}


//Input: nums = [3,2,2,3], val = 3
//Output: 2, nums = [2,2,_,_]

//Input: nums = [0,1,2,2,3,0,4,2], val = 2
//Output: 5, nums = [0,1,4,0,3,_,_,_]


//second question 
//Input: nums = [1,1,1,2,2,3]
//Output: 5, nums = [1,1,2,2,3,_]
//Explanation: Your function should return k = 5, 
//
//Code
//Testcase
//Test Result
//Test Result
//80. Remove Duplicates from Sorted Array II