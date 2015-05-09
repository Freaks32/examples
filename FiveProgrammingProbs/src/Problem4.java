import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

public class Problem4 {
	public static final Comparator<Integer> myComparator = new Comparator<Integer>() {
		public int compare(Integer l, Integer r) {
			String ls = '0' + l.toString();
			String rs = '0' + r.toString();
			
			int max = Math.max(ls.length(), rs.length());
			for(int i = 0; i < max; i++) {
				if(i >= ls.length() && i >= rs.length()) {
					return 0;
				}
				if(i >= ls.length()) {
					return rs.charAt(i-1) - rs.charAt(i);
				}
				if(i >= rs.length()) {
					return ls.charAt(i-1) - ls.charAt(i);
				}
				if(ls.charAt(i) != rs.charAt(i)) {
					return rs.charAt(i) - ls.charAt(i);
				}
			}
			return 0;
		}
	};
	
	public static void main(String[] args) {
		int[] input = {1, 3, 5, 6, 9, 10, 55, 59, 54};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		Collections.sort(list, myComparator);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}