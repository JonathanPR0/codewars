import java.util.List;

public class ListFiltering {
	public static void main(String[] args) {
		ListFiltering.filterList(List.of(-1, 2, "a", "b"));
		System.out.println(ListFiltering.filterList(List.of(-1, 2, "aasf", "1", "123", 123)));
	}
	
	public static List<Object> filterList(final List<Object> list) {   
		return list.stream().filter(a->a instanceof Integer).filter(num->(Integer)num>=0).toList();		
	}
}
