package largeSum;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class readFile {
	
	private String url;
	private BigInteger suma =  BigInteger.ZERO;
    int longitud = 10;
	
	
	public readFile(String url){
		this.url = url;
	}
	
	public void getText() throws Exception {
		
		File doc = new File(url);
    
	    try (Scanner obj = new Scanner(doc)) {
	        while (obj.hasNextLine()) {
	            String line = obj.nextLine();
	            BigInteger numero = new BigInteger(line);
	            suma = suma.add(numero);
	        }
	        
	        String sumaToString = suma.toString();
	        String primerosDiezDigitos = sumaToString.substring(0, Math.min(sumaToString.length(), longitud));

	        System.out.println("suma = " + suma);
	        System.out.println("Los primeros " + longitud + " son: " +primerosDiezDigitos );
	    }
	}
	
}
