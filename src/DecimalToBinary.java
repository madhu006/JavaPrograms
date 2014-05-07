import java.util.Scanner;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class DecimalToBinary {
	

	public void convertDecimalToBinary(int num){
		
		int[] binary = new int[25];
		int i =0;
		while(num !=0){
			binary[i] = num%2;
			num = num/2;
			i++;
		}
		
		//print binary
		
		for(int j=i-1; j>=0;j--)
			System.out.print(binary[j]);
		
	}
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalToBinary  dtb = new DecimalToBinary();
	
		
		System.out.println("Please enter the number ");
		Scanner ins = new Scanner((System.in));
		
		int num = ins.nextInt();
		System.out.println("This is input "+num);	
		
		dtb.convertDecimalToBinary(num);

	}

}




