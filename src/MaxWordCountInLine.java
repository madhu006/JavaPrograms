import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Madhulika
 *
 */
public class MaxWordCountInLine {
	
	public void findMaxCountInLine(String fileName){
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		int maxWordCount =0;
		List<String> lines = new ArrayList<String>();
		
		try {
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			try {
				while((line = br.readLine())!= null){
					int count = line.split("\\s+").length;
					if(count>maxWordCount){
						lines.clear();
						lines.add(line);
						maxWordCount = count;
					}
					else if(count == maxWordCount)
					{
						lines.add(line);
					}
				
				}
				// display the line
				System.out.println("The line is "+ lines.get(0) + " count "+ maxWordCount);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C:/Temp/input.txt";
		MaxWordCountInLine mwc = new MaxWordCountInLine();
		mwc.findMaxCountInLine(fileName);

	}

}
