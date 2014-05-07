import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class DuplicateNumber {
	
	public void findDuplicateNumber(List<Integer> n){
		int highestNumber = n.size()-1;
		System.out.println("highestNumber "+highestNumber);
		int total = sumOfList(n);
		int duplicate = total -highestNumber*(highestNumber +1)/2;
		System.out.println("the duplicate number "+ duplicate);
	}

	private int sumOfList(List<Integer> n) {
		int sum=0;
		for(Integer num : n)
			sum +=num;
		// TODO Auto-generated method stub
		return sum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> n = new ArrayList<Integer>();
		for(int i =1;i <15;i++)
			n.add(i);
		n.add(9);
		DuplicateNumber dn = new DuplicateNumber();
		dn.findDuplicateNumber(n);

	}

}
