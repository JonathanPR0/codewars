
public class ValidBraces {
	public static void main(String[] args) {
		System.out.println(isValid("[])"));
	}
	private static boolean isValid(String braces) {
		boolean brackets = braces.matches(".*\\[.*\\].*");
	    boolean parentheses = braces.matches(".*\\(.*\\).*");
	    boolean curlyBraces = braces.matches(".*\\{.*\\}.*");

	    while (brackets || parentheses || curlyBraces) {
	        if (brackets) {
	            braces = braces.replaceFirst("\\[", "");
	            braces = braces.replaceFirst("\\]", "");
	            brackets = braces.matches(".*\\[.*\\].*");
	        } else if (parentheses) {
	            braces = braces.replaceFirst("\\(", "");
	            braces = braces.replaceFirst("\\)", "");
	            parentheses = braces.matches(".*\\(.*\\).*");
	        } else if (curlyBraces) {
	            braces = braces.replaceFirst("\\{", "");
	            braces = braces.replaceFirst("\\}", "");
	            curlyBraces = braces.matches(".*\\{.*\\}.*");
	        }
	    }

	    return braces.isBlank();
	}
}
