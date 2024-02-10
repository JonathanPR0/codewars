public class DecodeTheMorseCode {
	public static void main(String[] args) {
		System.out.println(decode(". ..- / --.- ..- . .-. .. .- / ... .- -... . .-. / --- / --.- ..- . / . ... - .- / -.. .- -. -.. --- / . .-. .-. .- -.. --- --- --- ---"));
	}
	private static String decode(String morseCode) {
		String answer = "";
		String[] listOfWords = morseCode.trim().split("   ");

		for(int i=0; i<listOfWords.length; i++) {
			System.out.println(listOfWords[i]);
			String[] arrayOfLetters = listOfWords[i].split(" ");
			for(int j=0; j<arrayOfLetters.length; j++) {
				answer += "K";
//				Correto
//				answer += MorseCode.get(arrayOfLetters[j]);
			}				
			answer+=" ";
		}
		return answer.trim();
	}
}
