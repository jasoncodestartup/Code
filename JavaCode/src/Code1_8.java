
public class Code1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "waterbottle"
		// "erbottlewat"
		// isSubstring()
		// check to see if s2 is a rotation of s1
		//
		// Initial thought is:
		// s1.isSubstring(s2 + s2);
		//
		// "waterbottle".isSubstring("erbottlewaterbottlewat");
		// can there be a case that this is true without being a rotation if the two strings are the same length?
		// 
		// No.
		//
		// return (s1.isSubstring(s2+s2) && (s1.length() == s2.length());
		//
		// ** Forgot to check for null string
	}

}
