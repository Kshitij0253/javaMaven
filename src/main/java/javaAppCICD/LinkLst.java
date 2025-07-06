package javaAppCICD;

import java.util.LinkedList;

public class LinkLst {

	public static boolean findElement(LinkedList<Integer> li,int n) {
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i)==n) {
				return true;
			}
		}
		return false;
	}
	
	public static LinkedList<Integer> deleteElement(LinkedList<Integer> li,int n){
		
		for(int i=0;i<li.size();i++) {
			if (li.get(i) == n) {
                li.remove(i); 
                i--; 
            }
		}
		return li;
	}
	
	
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		li.add(4);
		li.add(2);
		li.add(9);
		li.add(10);
		
		int n=5;
		boolean ans = findElement(li,n);
		
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(ans);
	}
}
