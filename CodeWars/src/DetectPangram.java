import java.util.HashSet;

public class DetectPangram {
	public static void main(String[] args) {
		System.out.println(DetectPangram.check("Hello World!"));
	}
	
	static public boolean check(String sentence){
		HashSet<String> listaDeLetras = new HashSet<>();
	    String newSentence = sentence.replace(" ", "").toLowerCase();
	    for (int i = 0; i < newSentence.length(); i++) {
	        if(Character.toString(newSentence.charAt(i)).matches("[a-z]*")) {
	        	listaDeLetras.add(Character.toString(newSentence.charAt(i)));	        	
	        }
	    }
	    
	  
		return listaDeLetras.size() > 26;
	}
}
