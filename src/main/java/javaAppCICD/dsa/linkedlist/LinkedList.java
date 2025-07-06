package javaAppCICD.dsa.linkedlist;

public class LinkedList {

	int data;
	LinkedList next;
    
	public LinkedList(int x) {
		data=x;
		next = null;
		
	}
	
	public static void printList(java.util.LinkedList<Integer> curr) {
		while(curr!=null) {
			System.out.println(curr.get(0) + " : ");
//			curr = curr.next;
		}
	}
	
	public static boolean find_element(LinkedList list) {
		
//		for(int i=0;i<list.;)
		return false;
	}
	
	public static void main(String args[]) {
		System.out.println("test");
		
		LinkedList li = new LinkedList(2);
		 li.next = new LinkedList(1);
	        li.next.next = new LinkedList(32);
	        li.next.next.next = new LinkedList(10);
	        li.next.next.next.next = new LinkedList(78);
		
//	        printList(li);
	}
}
