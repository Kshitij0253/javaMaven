package javaAppCICD.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	
	//brute force 3sum 2-7-25
	  public static List<List<Integer>> threeSum(int[] nums) {
	        int n = nums.length;
	        List<List<Integer>> ans = new ArrayList();
	        Arrays.sort(nums);
	        for(int i=0;i<n;i++){
	            //first optimization to ignore i repraing values
	            if(i>0 && nums[i] == nums[i-1])
	                continue;
	            
	           int j = i+1,k = n-1;

	           while(j<k){
	            int sum = nums[i]+nums[j]+nums[k];
	            if(sum<0){
	                j++;
	            }else if (sum>0){
	                k--;
	            }else{
	                ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                j++;
	                k--;

	                while(j<k && nums[j] == nums[j-1]) j++;
	            }
	           }
	        }
	        return ans;
	    }
	  
	  //by kshitij 2-7-25
	  public static List<List<Integer>> ThreesumKs(int[] nums){
		  List<List<Integer>> ans = new ArrayList<List<Integer>>();
		  
//		  Arrays.sort(nums);

		  for(int i=0;i<nums.length;i++) {
			  for(int j=i+1;j<nums.length;j++) {
				  for(int k=j+1;k<nums.length;k++) {
					  if(nums[i]+nums[j]+nums[k]==0) {
						  ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
						  
					  }
				  }
			  }
		  }
		  
		  return ans;
	  }
	  
	  
	  //Minimun Arrow to Burstrow (codewithmike) 03-07-25
	  public static  int findMinArrowShots(int[][] points) {
	      
	        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
	        int n = points.length;
	        int[] prev = points[0];
	        System.out.println(points);
		  int count=1;
		  for(int i=1;i<n;i++){
			   int currStartPoint = points[i][0];
	            int currEndPoint = points[i][1];
	            
	            int prevStartPoint = prev[0];
	            int prevEndPoint = prev[1];
	            
	            if (currStartPoint > prevEndPoint) { // no overlap
	                count++;
	                prev = points[i];
	            } else {
	                // overlap
	                prev[0] = Math.max(prevStartPoint, currStartPoint);
	                prev[1] = Math.min(prevEndPoint, currEndPoint);
	            }
		  }
		  return count;
		  
	    }
	  
	  //print all the duplcates in array : 03-07-25
	  
	  public static List<Integer> findDuplicates(int[] nums) {
	        List<Integer> l1 = new ArrayList();

	        Set<Integer> s1 = new HashSet<>();

	        for(int i=0;i<nums.length;i++){
	            if(s1.contains(nums[i])){
	                l1.add(nums[i]);
	            }else{
	                s1.add(nums[i]);
	            }
	        }
System.out.println(l1);
	        return l1;
	    }
	  
	  
	  //first mmising positive leetcode hard : 03-07-25 it break at 121 test case out of 130 
	  public static int firstMissingPositive(int[] nums) {

	        int n = nums.length;
	        Arrays.sort(nums);
	        int ans=1;
	        for(int i=0;i<n;i++){
	            if(nums[i]<=0){
	                continue;
	            }else if(nums[i]>ans){
	                return ans;
	            }else{
	                ans++;
	            }
	        }        
	        return ans;
	    }
	  
	  //04 - 07 -25 42. Trapping Rain Water
	  public int[] getLeftMax(int[] height,int n){
	        int[] leftArr = new int[n];
	        leftArr[0] = height[0];
	        for(int i=1;i<n;i++){
	            leftArr[i] = Math.max(leftArr[i-1],height[i]);

	        }
	        return leftArr;
	    }


	public int[] getRightMax(int[] height,int n){
	        int[] rightArr = new int[n];
	        rightArr[n-1] = height[n-1];
	        for(int i=n-2;i>=0;i--){
	            rightArr[i] = Math.max(rightArr[i+1],height[i]);

	        }
	        return rightArr;
	    }

	    public int trap(int[] height) {
	        int n = height.length;
	        if(n==1||n==0){
	            return 0;
	        }

	        int[] left = getLeftMax(height,n);
	        int[] right = getRightMax(height,n);
	        int sum=0;
	        for(int i=0;i<n;i++){
	            sum+=Math.min(left[i],right[i])-height[i];

	        }
	return sum;
	    }
	    
	    
	    
//	    find larger and smallest number in array 3
//	    1509. Minimum Difference Between Largest and Smallest Value in Three Moves
	    public int minDifference(int[] nums) {
	        int n = nums.length;
	        if(n<=4){
	          return 0;
	        }      

	        Arrays.sort(nums);

	         int ans = nums[n-4]-nums[0];
	          ans = Math.min(ans,nums[n-1]- nums[3]);
	          ans = Math.min(ans,nums[n-2] - nums[2]);
	          ans = Math.min(ans,nums[n-3]- nums[1]);
	        
	         
	        return ans;
	      
	      }
	    
	    public static int minDifferenceofK(int[] nums,int k) {
	    
	    	int n = nums.length;
	    	if(n<=1) {
	    		return 0;
	    	}
	    	  Arrays.sort(nums);
	    	int ans=Integer.MAX_VALUE;
	    	for(int i=0;i<=k;i++) {
	    		int leftIndex = i;
	    		int rightIndex = n-(k-i)-1;
//	    		if (rightIndex < 0 || leftIndex >= n) continue;

	    	 
	    		ans = Math.min(ans,nums[rightIndex]-nums[leftIndex]);
	    		
	    	}
	    	return ans;
	    }
	    
	    //05-07-25 Factorials of large numbers
	    
	   
	public static void main(String args[]) {
		System.out.println("Array Leetcode Practise for Companys ");
		
		int num[] = {-1,0,1,2,-1,-4};
		List<List<Integer>> ans = threeSum(num);
//		List<List<Integer>> ans = ThreesumKs(num);
		
		System.out.println(ans);
		
		
		int points[][] = {{10,16},{2,8},{1,6},{7,12}};
		int ans2 = findMinArrowShots(points);
//		System.out.println(ans2);
		
		int nums2[] = {4,3,2,7,8,2,3,1};
		findDuplicates(nums2);
		
		
		//
		int nums3[] = {1,5,0,10,14};
		int k = 3;
		
		int ans3 = minDifferenceofK(nums3,k);
		System.out.println("larges diff "+ ans3);
		
		
		
		}
	}
}
