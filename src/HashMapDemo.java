import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * 
 */

/**
 * @author rakesh
 *
 */
public class HashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Madhulika", 5);
		hm.put(null, null);
		hm.put("stat", null);
		hm.put("prasad", null);
		hm.put("math", 9);
		
		System.out.println(hm.get("Madhulika"));
		System.out.println(hm.get(null));
		System.out.println(hm.get("stat"));
		System.out.println(hm.get("prasad"));
		
		Map<String,Integer> ht = new Hashtable<String,Integer>();
		ht.put("madhu", 5);
		
		//ht.put(null, null);
		
	//	ht.put("prasad", null);
		System.out.println(ht.get("madhu"));
	//	System.out.println(ht.get(null));
	//	System.out.println(ht.get("prasad"));
		
		
		

	}

}
