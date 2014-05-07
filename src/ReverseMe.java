/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class ReverseMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Madhulika Prasad";
		
		 StringBuilder sb = new StringBuilder();
		   for(int i = s.length() - 1; i >= 0; --i)
		     sb.append(s.charAt(i));
		   System.out.println(sb.toString());

	}

}
