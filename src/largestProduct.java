
public class largestProduct extends readFile {

	

	private String cadena;
	private long resultado = 0L;


	
	public largestProduct(String url ) throws Exception {	
		super(url);
		this.cadena = super.getCadena();
	}
	
	
	public long getAnswer() {
     
		
		for (int i = 0; i < cadena.length(); i++) {
			resultado +=   Character.getNumericValue(cadena.charAt(i));
			
			System.out.println(cadena.charAt(i));
		}
		System.out.println("El resultado es: " +resultado);
		
		return resultado;
			
	}
	
	
	
}
