/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MyDuplicateElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,3,5,7,8,8,8,11,13,25,25,46,56,57,58,66,66,66,66,71,79};
		int[] b = new int[a.length];
		int j=0;
		MyDuplicateElement de = new MyDuplicateElement();
		de.findDistinctElementSortedAr(a,b);

	}

	private void findDistinctElementSortedAr(int[] a,int[] b) {
		// TODO Auto-generated method stub
		int j=0;
		b[0]=a[0];
		j=1;
		for(int i=1;i<a.length;i++){
			if(a[i]!=a[i-1])
				b[j++]=a[i];
			
		}
		
		for(int i=0;i<j;i++){
			
			System.out.print(" "+ b[i]);
		}
	}

}
