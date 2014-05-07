/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class ReversedString {

	String reverse = ""; 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madhulika prasad";
		
		ReversedString rs = new ReversedString();
		String rev = rs.findReverseString(str);
		System.out.println(rev);

	}

	private String findReverseString(String str) {
			if(str.length() ==1)
				return str;
			else{
			reverse += str.charAt(str.length()-1) + findReverseString(str.substring(0, str.length()-1));
			return reverse;
			}	
	}

}
