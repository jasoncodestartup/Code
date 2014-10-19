import java.lang.StringBuffer;

public class Code1_5 {
	
	public static String compressString(String str){
		StringBuffer strb = new StringBuffer();
		
		int count = 1;
		strb.append(str.charAt(0));
		
		for (int i = 1; i < str.length(); i++){
			if (str.charAt(i) == str.charAt(i-1)){
				count++;
			} else {
				Integer compression = count;
				strb.append(compression.toString());
				count = 1;
				strb.append(str.charAt(i));
			}
		}
		strb.append(((Integer)count).toString());
		if (strb.length() < str.length()) return strb.toString();
		else return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaaabcccddddeeeeeeeeeega";
		String str2 = "abcdefg";
		
		System.out.println("Original string  : " + str1);
		System.out.println("Compressed string: " + compressString(str1));
		
		System.out.println("Original string  : " + str2);
		System.out.println("Compressed string: " + compressString(str2));
	}
}
