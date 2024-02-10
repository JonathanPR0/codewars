
public class DecodeTheMorseCodeAdvanced {
	public static void main(String[] args) {
		System.out.println(decodeBits("1100000011"));
		System.out.println(". .");
		System.out.println(decodeBits("1100011"));
		System.out.println("..");
	}
	private static String decodeBits(String bits) {
		return bits.trim().replace("111111", "-").replaceAll("1+", ".").replace("00000000000000", "   ").replace("000000", " ").replace("00", "").replace("0","");
	}
}
