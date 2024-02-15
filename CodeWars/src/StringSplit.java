public class StringSplit {
	public static void main(String[] args) {
		System.out.println(solution("HelloWorl"));
	}
	public static String[] solution(String s) {
		String[] arrayString = new String[(int) Math.ceil(s.length()/2.0)];
		System.out.println(Math.ceil(s.length()/2.0));
		if(s.length()%2!=0) {
			s+="_";
		}
		int j = 0;
		for(int i = 0; i<s.length(); i+=2) {
			arrayString[j] = s.substring(i, i+2);
			j++;
		}
		return arrayString;
    }
}
