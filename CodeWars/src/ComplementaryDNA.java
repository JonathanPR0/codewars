
public class ComplementaryDNA {
	public static void main(String[] args) {
		System.out.println(makeComplement("TAACG"));
	}
	private static String makeComplement(String dna) {
	    String complement = "";
	    for(int i=0; i<dna.length(); i++) {
	    	if(Character.toString(dna.charAt(i)).equals("T"))
	    		complement += "A";
	    	else if(Character.toString(dna.charAt(i)).equals("A"))
	    		complement += "T";
	    	else if(Character.toString(dna.charAt(i)).equals("C"))
	    		complement += "G";
	    	else if(Character.toString(dna.charAt(i)).equals("G"))
	    		complement += "C";
	    }
		return complement;
	}
}
