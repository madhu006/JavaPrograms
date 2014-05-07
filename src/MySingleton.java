/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MySingleton {
	
	
		private static MySingleton newObj = null;
		
		private	MySingleton(){};
		
		static {
			newObj = new MySingleton();
		}
		
		public static MySingleton getInstance(){
			return newObj;
		}
		
		public void test(){
			System.out.println("This is a singleton class");
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySingleton ms = getInstance();
		
		ms.test();
		

	}

}
