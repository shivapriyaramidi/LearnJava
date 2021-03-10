package NandiniHomework;

public class SubString {

	public static void main(String args[]) {
	      String str = "javacodeing";
	      String substr = "java";
	      int a = str.length();
	      int b  = substr.length();
	      System.out.println("String: " + str);
	      System.out.println("Substring: " + substr);
	      for (int i = 0; i <= a - b; i++) {
	         int j;
	         for (j = 0; j < b ; j++) {
	            if (str.charAt(i + j) != substr.charAt(j))
	               break;
	         }
	         if (j == b) {
	            System.out.println("The substring is present in the string at index " + i);
	            return;
	         }
	      }
	      System.out.println("The substring is not present in the string");
	   }
	}

