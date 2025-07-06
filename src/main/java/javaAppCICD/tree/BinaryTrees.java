package javaAppCICD.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Stack;

class Node{

	int data;
	Node left,right;
	
	Node(int item){
		this.data=item;
		left=right=null;
	}
}

class BinarySearch{
	Node root;
	
	void iterativePreorder()

	{

	iterativePreorder(root);

	}
	
	
	void iterativeInorder() {
		iterativeInorder(root);
	}
	
	void iterativePreorder(Node node) {

		
		if(node == null) {
			return ;
		}
		Stack<Node> nodeStack = new Stack<Node>();
		
		nodeStack.push(root);
		
		while (nodeStack.empty() == false) {

			Node mynode = nodeStack.peek();

			System.out.print(mynode.data + " ");

			nodeStack.pop();


			if (mynode.right != null) {

			nodeStack.push(mynode.right);

			}

			if (mynode.left != null) {

			nodeStack.push(mynode.left);
			}
		}
	}
	
	
void iterativeInorder(Node node) {

		
		if(node == null) {
			return ;
		}
		Stack<Node> nodeStack = new Stack<Node>();
		
		Node curr = root;
		
		while (curr != null || !nodeStack.isEmpty()) {

			while (curr != null) {


				nodeStack.push(curr);

				curr = curr.left;

				}
			curr = nodeStack.pop();

			System.out.print(curr.data+" ");



			curr = curr.right;
		}
	}
	
	
	void Inorder(Node node) {
		if(node == null) {
			return ;
			
		}
	}
	}


class BinaryTrees {
	
	
	 public static Node sortedArrayToBST(int[] nums) {

	       return helper(nums, 0, nums.length - 1);
	    }
	 
	 public static Node helper(int[] nums,int left,int right) {
		 if(left >right) {
			 return null;
			 
		 }
		 
		 int mid = (right + left)/2;
		 Node treeNode = new Node(nums[mid]);
		 treeNode.left = helper(nums,mid+1,right);
		 treeNode.right = helper(nums,left ,mid-1);
		 return treeNode;
	 }
	 
	    public static int[] topKFrequent(int[] nums, int k) {
//	    	int[]arr = new int[k];
	    	  HashMap<Integer,Integer> h1 = new HashMap();
	          int[] ans = new int[k];
	          int idx = 0;
	          
	          for(int i=0;i<nums.length;i++){
	              // int count = 1;
	              if(h1.containsKey(nums[i])){
	                  h1.put(nums[i],h1.get(nums[i]) + 1);
	              }else{
	                  h1.put(nums[i],1);
	              }
	          }
	          
	          for (Map.Entry<Integer, Integer> i : h1.entrySet()) {
					if(i.getValue()>=k) {
						ans[idx++] = i.getKey();
						
					}
				}
	    	
	    	return ans;
	    }
	    

public static void main(String args[]) {
	BinarySearch tree = new BinarySearch();
	tree.root = new Node(10);
	tree.root.left = new Node(8);
	tree.root.right = new Node(2);
	tree.root.left.left = new Node(3);
	tree.root.left.right = new Node(5);
	tree.root.right.left = new Node(2);

//	tree.iterativePreorder();
//	tree.iterativeInorder();
	
	
	int[] arr = {1,1,1,2,2,3};
	int k=2;
	int[] temp = topKFrequent(arr,k);
	for(int i=0;i<temp.length;i++) {
		System.out.println(temp[i]);
	}
//	int [] arr = {-10,-3,0,5,9};
//	Node ans = sortedArrayToBST(arr);
//	System.out.println(ans.data);
	
	
}




}
