package javaAppCICD;

public class Rever_bit {
	 public static int reverseBits(int n) {
         int result = 0;
       for (int i = 0; i < 32; i ++) {
           int lsb = n & 1; 
           int reverseLsb = lsb << (31 - i);  
           result = result | reverseLsb;
           n = n >> 1;
       }
       return result;
   }
	 
	public static void main(String[] args) {
		System.out.println("Reverse Bit");
//		BigInt n = 00000010100101000001111010011100;
		int n =5;
		
		int ans = reverseBits(n);
	}
}
