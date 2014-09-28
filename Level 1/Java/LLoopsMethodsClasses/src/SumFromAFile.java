import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class SumFromAFile {
	public static void main(String[] args) {
		
		int temp = 0;
		int sum = 0;
		BufferedReader br = null;
		 try {
			br = new BufferedReader(new FileReader("src\\Input.txt"));
	        String line = br.readLine();

	        while (line != null) {
	        	temp = Integer.parseInt(line);
	        	sum = sum + temp;
	            line = br.readLine();
	        }
	    } catch (Exception e ) {
	    	//System.out.println(e.toString());
	    	System.out.println("Error");
	    	//e.printStackTrace();
	    	
	    } finally {
	    	try {
	    		if (br != null) {
	    			br.close();
				}
				
			} catch (IOException e) {
				System.out.println("Error");
				//e.printStackTrace();
			} 
	    }
	   if (br != null) {
		
		   System.out.println(sum);
	   }
	    
	}

}
