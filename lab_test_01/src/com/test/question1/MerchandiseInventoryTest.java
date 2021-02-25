package com.test.question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MerchandiseInventoryTest {

	public static void main(String[] args) {
		
		try {			
			BufferedReader readFile = new BufferedReader(new FileReader("C:\\Users\\ve00ym232\\Desktop\\Test\\lab_test_01\\file.txt"));
			
			String data;
			List<Merchandise> merchandises = new ArrayList<>();
			
			while(true) {
				data = readFile.readLine();
				if(data == null) break;
				
				String[] splittedData = data.split(" ");
				 
				String itemCode = splittedData[0];
				 int quantity = Integer.parseInt(splittedData[1]);
				 double unitPrice = Double.parseDouble(splittedData[2]);
				 
				Merchandise merch = new Merchandise(itemCode, quantity, unitPrice);
				
				merchandises.add(merch);
			}
			
			
			List<Merchandise> merchsSortedByName = merchandises.stream()
													.sorted(Comparator.comparing(Merchandise::getItemCode))
													.collect(Collectors.toList());
			
			
			merchsSortedByName.forEach(System.out::println);
			
			List<Merchandise> merchsSortedByPrice = merchandises.stream()
					.sorted(Comparator.comparing(Merchandise::getUnitPrice))
					.collect(Collectors.toList());

			Collections.reverse(merchsSortedByPrice);
			merchsSortedByPrice.forEach(System.out::println);
			
			
			readFile.close();			
			
		} catch(IOException ex) {
			System.out.println("Some issue occured");
		}
		
		
	}

}
