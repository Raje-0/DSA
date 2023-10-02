package basicQuestion;

public class ReverseString {
	public static void main(String[] args) {
		String str = "abcd";
		int n = str.length();
		String rev = "";
		for (int i = n - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		//using String buffer
		
		String str2= "hello";
		StringBuffer sb = new StringBuffer(str2);
		
		System.out.println("using String buffer= "+sb.reverse());
	}
}
