/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MyNumberSumRec {
	
	public int findNumberSum(int num){
		int sum =0;
		if(num ==0){
			return sum+num;
		}
		else{
			sum += num%10 + findNumberSum(num/10);
		}
		return sum;
	}

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 236110;
		MyNumberSumRec mns = new MyNumberSumRec();
		int total = mns.findNumberSum(num);
		System.out.println("total values" +total);

	}

}
