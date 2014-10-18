import java.util.Arrays;
import java.lang.String;


public class Code1_3 {
	public static String sort(String s){
		char[] tmp = s.toCharArray();
		Arrays.sort(tmp);
		return new String(tmp);
	}
	
	public static boolean isPermutation(String str1, String str2){
		if (str1.length() != str2.length()) return false;
		return sort(str1).equals(sort(str2));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCDE";
		String str2 = "ABCED";
		String str3 = "AAAAA";
		String str4 = "ABCDEF";
		
		System.out.println("Is " + str1 + " a permutation of " + str2 + "?" + "  :" + isPermutation(str1, str2));
		System.out.println("Is " + str1 + " a permutation of " + str3 + "?" + "  :" + isPermutation(str1, str3));
		System.out.println("Is " + str1 + " a permutation of " + str4 + "?" + "  :" + isPermutation(str1, str4));
	}
}
