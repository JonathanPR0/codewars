
public class CreatePhoneNumber {
	public static void main(String[] args) {
		System.out.println(create(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}
	private static String create(int[] numbers) {
		String phoneNumber = "";
	    for(int i=0; i<numbers.length; i++){
	      if(i==0)
	        phoneNumber+=("("+numbers[i]);
	      else if(i==2)
	        phoneNumber+=(numbers[i]+") ");
	      else if(i==5)
	        phoneNumber+=(numbers[i]+"-");
	      else
	        phoneNumber+=numbers[i];
	    }
	    
	    return phoneNumber;
	}
}
