package NandiniHomework;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s[] = "testing java code".split(" "); 
		      String ans = " "; 
		      for (int i = s.length - 1; i >= 0; i--) { 
		        ans += s[i] + " "; 
		      } 
		      System.out.println("Reversed String: " + ans); 
		    }
}
	


