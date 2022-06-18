package week2.day1;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String test = "feeling good";
		char[] ca=test.toCharArray();
		for(int i=ca.length-1;i>=0;i--) {
			System.out.print(ca[i]);
		}
		

	}

}
