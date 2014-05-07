/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MiddleIndex {
	
	public int findMiddleIndex(int[] n) throws Exception{
		int startIndex =0;
		int lastIndex =n.length-1;
		int sumLeft =0;
		int sumRight =0;
		while(true){
			if(sumLeft>sumRight){
				sumRight += n[lastIndex--];
			}
			else
				sumLeft += n[startIndex++];
		
		if(startIndex > lastIndex){
			if(sumLeft == sumRight){
				System.out.println("This is a proper array");
				break;
			}
			else {
				throw new Exception("This not a proper array");
			}
		}
		
	}
		return lastIndex;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {2,3,1,2,1,11};
		MiddleIndex mi = new MiddleIndex();
		try {
			System.out.println("middle index "+mi.findMiddleIndex(n));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
