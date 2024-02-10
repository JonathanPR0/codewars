public class FindTheParityOutlier {
	public static void main(String[] args) {
		System.out.println(find(new int[] {2, 6, 8, -11, 4}));
	}
	private static int find(int[] integers) {
		int odd = 0;
	    int even = 0;
		
	    for(int i=0; i<3; i++) {
	    	if(Math.abs(integers[i])%2==0) {
	    		odd++;
	    	}else {
	    		even++;
	    	}
	    }
	    
	    for(int i=0; i<integers.length; i++) {
	    	if(odd>even&&Math.abs(integers[i])%2==1) {
	    		return integers[i];
	    	}else if(odd<even&&Math.abs(integers[i])%2==0) {
	    		return integers[i];	    		
	    	}
	    }
	    
		return 0;
	}
}
