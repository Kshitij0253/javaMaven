package javaAppCICD.dsa.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;

class TreeNode {
    int data;
    TreeNode left, right;

    // Constructor to initialize a new node
    TreeNode(int value) {
        data = value;
        left = null;
        right = null;
    }
}
public class Test {
//[3, 1, 2, 4, 5]


public static int maxWat(int[]arr) {
int n = arr.length;
int ans=0;
for(int i=0;i<n;i++) {
for(int j=i+1;j<n;j++) {
int no = j-i;
int temp = Math.min(arr[i],arr[j]) * no;

if(temp > ans) {
ans = temp;
}
}
}

return ans;

}

 static boolean check(int[] arr, int n, int initEnergy)
   {
       int energy = initEnergy;
       for (int i = 0; i < n; i++) {
           energy += arr[i];
           if (energy <= 0) {
               return false;
           }
       }
       return true;
   }

   static int minInitialEnergy(int[] arr, int n)
   {
       int minEnergy = 1;
       while (!check(arr, n, minEnergy)) {
           minEnergy++;
       }
       return minEnergy;
   }
   
   public static int CountNumber(int l,int r,int q) {
    int ans = 0;
    for(int i=l;i<=r;i++) {
//     System.out.println(i)
    int num = i * q;
//     System.out.println(num);
    if(!hasCommonDigit(num,i)) {
    ans++;
    }
   
//     System.out.println(i * q);
//     System.out.println(ans);
    }
    return ans;
   }
   
 
   
   public static boolean hasCommonDigit(int a, int b) {
       boolean[] digits = new boolean[10];

       
       while (a != 0) {
           digits[a % 10] = true;
           a /= 10;
       }

       while (b != 0) {
           if (digits[b % 10]) {
               return true;
           }
           b /= 10;
       }

       return false;
   }
   
   public static void encoding(String str ) {
    int n = str.length();
   
    for(int i=0;i<n;i++) {
    int count =1;
    while(i<n-1 && str.charAt(i) == str.charAt(i + 1)) {
    count++;
    i++;
    }
    System.out.print(str.charAt(i) + ""+count);
    }
   }
   
 
   static int missingNumber(int[] arr) {
       Arrays.sort(arr);

       // res will hold the current smallest missing number,
       // initially set to 1
       int res = 1;
       for (int i = 0; i < arr.length; i++) {

          
           if (arr[i] == res) {
               res++;
           }

        
           else if (arr[i] > res) {
               break;
           }
       }
       return res;
   }

   
   //bfs
   public static List<List<Integer>> levelOrder(TreeNode root) {
       if (root == null)
           return new ArrayList();

       Queue<TreeNode> q = new java.util.LinkedList<TreeNode>();
       List<List<Integer>> res = new ArrayList();

     
       q.offer(root);
       int currLevel = 0;

       while (!q.isEmpty()) {
           int len = q.size();
           res.add(new ArrayList());

           for (int i = 0; i < len; i++) {
             
        	   TreeNode node = q.poll();
               res.get(currLevel).add(node.data);

               
               if (node.left != null)
                   q.offer(node.left);

             
               if (node.right != null)
                   q.offer(node.right);
           }
           currLevel++;
       }
       return res;
   }
   
   public static int printBFS(TreeNode node) {
    if(node == null) {
    return 0;
    }
    Queue<TreeNode> q1 = new java.util.LinkedList();
    int n = 1;
   
    q1.add(node);
   
    while(!q1.isEmpty()) {
   
//     int size = q1.size();

//     while(size>0) {
    	TreeNode current = q1.remove();
   
    System.out.print(current.data+" ");
   
    if(current.left!=null) {
    q1.add(current.left);
   
    }
   
    if(current.right!=null) {
    q1.add(current.right);
    }
//        size--;
    }
   
//     if(!q1.isEmpty()) {
//     n++;
//     }
   
   
//     }
   
    return n;
   }
   
   public static int longestPalindrome(String s) {
       int length = 0;
      
       HashSet<Character> hset = new HashSet<Character>();
       
       for (int idx = 0; idx < s.length(); idx++) {
  
           char character = s.charAt(idx);
           
           if (hset.contains(character)) {
               length += 2;
               hset.remove(character);
           }
         
           else {
               hset.add(character);
           }
       }
       
       if (hset.size() > 0) {
           length ++;
       }
       return length;      
   }

   
   
   public static int noFlips(String s) {
    int n = s.length();
   
    int open =0;
    int flips =0;
    for(int i=0;i<n;i++) {
    char ch = s.charAt(i);
   
    if(ch == '{') {
    open++;
    }else {
    if(open == 0) {
    open++;
    flips++;
    }else {
    open--;
    }
    }
    }
   
    flips+= open/2;
    return flips;
   
   
   }
   public static String printDefault() {
    System.out.println("Print Default");
    return "Shristi";
   }
   
   public static int lengthOfLongestSubString(String s) {
    Set<Character> charSet = new HashSet();
   
    int maxLength =0;
    int left =0;
    for(int right=0;right<s.length();right++) {
    while(charSet.contains(s.charAt(right))) {
    charSet.remove(s.charAt(left));
    left++;
    }
    charSet.add(s.charAt(right));
    maxLength = Math.max(maxLength, right-left+1);
    }
   
    return maxLength;
   }
public static void main(String[] args)
   {

//1
//        int[] arr = { 4, -10, 4, 4, 4 };
//        int n = arr.length;
//        System.out.println(minInitialEnergy(arr, n));
//        
//        //2
// int l = 10, r = 12, q = 2;
// System.out.println(CountNumber(l,r,q));
//
//
//
// //3
// String str = "wwwwaaadexxxxxxywww";
//        encoding(str);
//        
//        
//        //4
//        int[] arr2 = { 2, 1, 5, 3, 1, 0, 4 };
int[] arr2 = {3, 1, 2, 4, 5};
int arr3[] = {2, 1, 8, 6, 4, 6, 5, 5};
// int[] arr2 = {2, 1, 8, 6, 4, 6, 5, 5};
//        System.out.println(maxWater(arr2));
//        System.out.println(maxWat(arr3));
//        
//        int[] missingarr = {2, -3, 4, 1, 1, 7};
//        System.out.println(missingNumber(missingarr ));
       
       

TreeNode root = new TreeNode(5);
       root.left = new TreeNode(12);
       root.right = new TreeNode(13);

       root.left.left = new TreeNode(7);
       root.left.right = new TreeNode(14);

       root.right.right = new TreeNode(2);

       root.left.left.left = new TreeNode(17);
       root.left.left.right = new TreeNode(23);

       root.left.right.left = new TreeNode(27);
       root.left.right.right = new TreeNode(3);

       root.right.right.left = new TreeNode(8);
       root.right.right.right = new TreeNode(11);

   
//        List<List<Integer>> res = levelOrder(root);
//
//    
//        for (List<Integer> level : res) {
//            System.out.print("[");
//            for (int i = 0; i < level.size(); i++) {
//                System.out.print(level.get(i));
//                if (i < level.size() - 1) System.out.print(", ");
//            }
//            System.out.print("] ");
//        }
//        int add = printBFS(root);
//        System.out.println(add);
       
      String s = "abccccdd";
      String s2 = "abcabcbc";
//       int ans = longestPalindrome(s);
      int ans = lengthOfLongestSubString(s2);
      System.out.println(ans);
   
      int n = noFlips("}}}}");
//       System.out.println(n);
       
      Optional<String> opt = Optional.ofNullable("Sripriya");
//       String res = opt.map(String::toUpperCase).orElse(printDefault());
//       System.out.println(res);
     
     }
}
