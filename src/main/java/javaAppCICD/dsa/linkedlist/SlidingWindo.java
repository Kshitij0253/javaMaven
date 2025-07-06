package javaAppCICD.dsa.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SlidingWindo {
	
	public static void slidingWind(int arr[],int n,int k) {
		int max =0;
		for(int i=0;i<n-k;i++) {
			max = arr[i];
			
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) {
					max = arr[i+j];
				}

			}
			System.out.println(max+" ");			
		}
	}
	
	
	
	
	public static void slidingWindMaxSum(int arr[],int n,int k) {
		int max =0;
		for(int i=0;i<n-k;i++) {
//			max = arr[i];
			
			for(int j=1;j<k;j++) {
				int sumMax =0;
				sumMax+=arr[j];
				
				if(sumMax>max) {
					max = sumMax;
				}

			}
			System.out.println(max+" ");			
		}
	}
	
	
	public static void slidingWindMaxSum2(int arr[], int n, int k) {
	    	    if (n < k) {
	        System.out.println("Invalid input: k is larger than the array size.");
	        return;
	    }

	    int maxSum = 0;
	    for (int i = 0; i < k; i++) {
	        maxSum += arr[i];
	    }

	  
	    int windowSum = maxSum;
	    for (int i = k; i < n; i++) {
	        windowSum += arr[i] - arr[i - k];
	        maxSum = Math.max(maxSum, windowSum);
	    }

	    System.out.println("Maximum sum of " + k + " consecutive elements is: " + maxSum);
	}
	
	public static int slidingWindoeMax(int arr[],int k ) {
		int n = arr.length;
		int count=0;
		for(int i=0;i<=n-k;i++) {
			int temp=0;
			for(int j=i; j< k+i;j++) {
				temp+=arr[j];
				
			}
//			k++;
			
			
			System.out.println(temp);
			if(temp>count) {
				count = temp;
			}
		}
		return count;
	}
	
	public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();
        int maxLength = 0;

        int start = 0; // Left pointer of the window

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // If the character is repeated, move the start pointer
            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch) + 1, start);
            }

            // Update the character's latest index
            map.put(ch, end);

            // Calculate max length so far
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
	
	public static int kadens(int[] arr) {
		int res = arr[0];
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			ans = Math.max(arr[i], arr[i]+ans);
			
			res = Math.max(ans, res);
		}
		return res;
	}

	 public static  List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> ans = new ArrayList();
	        int n = words.length;
	        System.out.println(n);
	        System.out.println(words[1]);
	        
	        for(int i=0;i<n ;i++) {
	        	int count = 0;
	        	for(int j = 0;j< words[i].length();j++) {
	        		if(words[i].charAt(j)== x && count == 0) {
	        			count++;
	        			ans.add(i);
	        		}
	        	}
	        }
	        return ans;
	    }

	 
	 
	 
	public static void main(String args[]) {
		int arr[] = {4,1,3,5,1,2,3,2,1,15};
//		8,9,9,8,6,7,6,18
		int n = arr.length;
		int k = 3;
		
//		slidingWindMaxSum2(arr,n,k);
		
		int ans = slidingWindoeMax(arr,k);
		System.out.println("Max k Sum answer is :"+ ans);
		int arr2[] = {2, 3, -8, 7, -1, 2, 3};
		int ans2 = kadens(arr2);
		System.out.println(ans2);
		
		
//		List<Integer> l2 = new ArrayList<Integer>();
//		
//		
//		
//		for(int i=0;i<=n-k;i++) {
//			int temp=0;
//			
//			 for (int j = i; j < i + k; j++) {
////			for(int j=i;j<k;j++) {
//				temp+=arr[j];
//			}
//			l2.add(temp);
//		}
//		
//		int slidV =0;
//		System.out.println(l2);
//		
//		for(int i=0;i<l2.size();i++) {
//			
//			if(l2.get(i)>slidV) {
//				slidV = l2.get(i);
//			}
//		}
//		System.out.println(slidV);
//		
//		 String[] words = {"leet","code"};
//	        char x = 'e';
//	        
//	        List<Integer> ans = findWordsContaining(words,  x);
//	        
//	        System.out.println(ans);
	}
}
