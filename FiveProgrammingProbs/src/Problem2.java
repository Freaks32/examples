public class Problem2 {
	public static void main(String[] args) {
		Object[] a = {0, 6, 'a', 'f', 5, 'q'};
		Object[] b = {'a', 'b', 'c', 'd', 'e', 'f'};
		Object[] c = combineLists(a, b);
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + ", ");
		}
		System.out.println();
	}
	
	public static Object[] combineLists(Object[] a, Object[] b) {
		Object[] out = new Object[a.length + b.length];
		int max = Math.max(a.length, b.length);
		int outindex = 0;
		for(int i = 0; i < max; i++) {
			if(i < a.length) {
				out[outindex++] = a[i];
			}
			if(i < b.length) {
				out[outindex++] = b[i];
			}
		}
		return out;
	}
}
