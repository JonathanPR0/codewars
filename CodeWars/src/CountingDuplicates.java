import java.util.HashSet;

public class CountingDuplicates {
	public static void main(String[] args) {
		System.out.println(duplicateCount("aA11"));
	}
	private static int duplicateCount(String text) {
		String newText = text.replace(" ", "").toLowerCase();
		HashSet<String> listOfLetters = new HashSet<>();
		HashSet<String> listOfRepeatedLetters = new HashSet<>();
		
		for (int i = 0; i < newText.length(); i++) {
	        if(listOfLetters.contains(Character.toString(newText.charAt(i)))) {
	        	listOfRepeatedLetters.add(Character.toString(newText.charAt(i)));	        	
	        }else {
	        	listOfLetters.add(Character.toString(newText.charAt(i)));	        		        	
	        }
	    }
		return listOfRepeatedLetters.size();
	}
}


