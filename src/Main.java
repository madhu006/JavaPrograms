import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1000;
		int n =2;
		int sum =0;
		List<Integer> primeList = new ArrayList<Integer>();
		while(primeList.size() <1000){
		if(	isPrimeNumber(n)){
			primeList.add(n);
			sum +=n;
		}
			n++;
			
		}
		System.out.println("sum of first 1000 prime " +sum);

	}

	private static boolean isPrimeNumber(int n) {
		// TODO Auto-generated method stub
		boolean isPrime =true;
		for(int count =2;count<=n/2;count++){
			if(n%count ==0){
				isPrime =false;
				break;
			}
		}
			
		return isPrime;
	}

}
