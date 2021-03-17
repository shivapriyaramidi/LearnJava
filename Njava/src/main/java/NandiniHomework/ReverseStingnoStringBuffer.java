package NandiniHomework;

import java.util.Scanner;

public class ReverseStingnoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str =  " ";
		String revstr = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string value ::");
		str = sc.nextLine();
		
		int len = str.length();
		for ( int i = len-1 ; i>=0  ; i--) {
			revstr = revstr+str.charAt(i);
			System.out.println("reverse string is ::" + revstr);
			
			
			
		}
		
        	
        }
        
	}
	
	


