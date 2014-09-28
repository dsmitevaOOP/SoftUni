import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;


public class OrderOfProducts {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		ArrayList<Products> products = new ArrayList<Products>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Double> quant = new ArrayList<>();
		BufferedReader reader = null;
		Writer writer = null;
		
		double sum = 0;
		double temp = 0;
		
		try {
			reader = new BufferedReader(new FileReader("Products.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] splittedLine = line.split(" ");
				products.add(new Products(splittedLine[0], Double.parseDouble(splittedLine[1])));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		try {
			reader = new BufferedReader(new FileReader("Order.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] splittedLine = line.split(" ");
				name.add(splittedLine[1]);
				quant.add(Double.parseDouble(splittedLine[0]));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
		if (products.size() >= name.size()) {
			
			for (int i = 0; i < name.size(); i++) {
				for (int j = 0; j < products.size(); j++) {
					if (name.get(i).equals(products.get(j).name)) {
						temp = products.get(j).price * quant.get(i);
						sum = sum + temp;
					}
				}
			}	
		}
		
		if (products.size() < name.size()) {
			
			for (int i = 0; i < products.size(); i++) {
				for (int j = 0; j < name.size(); j++) {
					if (name.get(j).equals(products.get(i).name)) {
						temp = products.get(i).price * quant.get(j);
						sum = sum + temp;
					}
				}
			}
		}
		
		System.out.print(sum);
		
		try {
			writer = new BufferedWriter(new FileWriter("Output.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				writer.write("" + sum + "\r\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
	            try {writer.close();} catch (Exception ex) {}
	         }
	} 

}
