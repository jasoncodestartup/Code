/**
 * 
 */

/**
 * @author jmp
 *
 */
import java.util.HashSet;

public class Code1_1 {
	public static boolean hasUniqueCharacters(String checkme){
		// need to distinguish between lower and upper case?  Assume no.
		String checkme_lowercase = checkme.toLowerCase();
		HashSet<Character> set = new HashSet<Character>(26, 1);
				
		for (int i = 0; i < checkme_lowercase.length(); i++) {
			if (set.contains(checkme_lowercase.charAt(i))) {
				return false;
			} else {
				set.add(checkme_lowercase.charAt(i));
			}
		}
		
		return true;
	}
	
	// one with no additional data structures
	public static boolean hasUniqueCharacters2(String checkme){
		// need to distinguish between lower and upper case?  Assume no.
		String checkme_lowercase = checkme.toLowerCase();
		for (int i = 0; i < checkme_lowercase.length(); i++){
			for (int j = i+1; j < checkme_lowercase.length(); j++){
				if (checkme_lowercase.charAt(i) == checkme_lowercase.charAt(j)) return false;
			}
		}
		
		return true;
	}
	
	public static boolean hasUniqueCharacters3(String checkme){
		// assume ASCII characters, distinguish between lower, upper, all different characters
		if (checkme.length() > 256) return false;
		
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < checkme.length(); i++){
			if (char_set[checkme.charAt(i)]) return false;
			else char_set[checkme.charAt(i)] = true;
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String \"abcdc\" has unique characters? " + hasUniqueCharacters("abCdc"));
		System.out.println("String \"abcde\" has unique characters? " + hasUniqueCharacters("abcde"));
		
		System.out.println("String \"abcdc\" has unique characters3? " + hasUniqueCharacters2("abCdc"));
		System.out.println("String \"abcde\" has unique characters3? " + hasUniqueCharacters2("abcde"));
	}

}
