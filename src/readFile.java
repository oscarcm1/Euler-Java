import java.io.File;
import java.util.Scanner;

public class readFile {

	private String  cadenaTexto = "";
	private String url;
	
	
	public readFile(String url){
		this.url = url;
	}
	
	public void getText() throws Exception {
		
		File doc = new File(url);
		    
	    try (Scanner obj = new Scanner(doc)) {
	        while (obj.hasNextLine()) {
	            String line = obj.nextLine();
	            cadenaTexto += line; // 
	        }
	    }
	}
	
	
	public String getCadena() throws Exception {
		getText();
		return  cadenaTexto;
	}
	
	
}
