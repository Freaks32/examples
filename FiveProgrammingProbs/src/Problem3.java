
public class Problem3 {
	public static void main(String[] args) {
		double[] fib = formFibonacci(100);
		for(int i = 0; i < fib.length; i++) {
			System.out.print(fib[i] + " ");
		}
		System.out.println();
	}
	
	public static double[] formFibonacci(int n) {
		if(n <= 0) {
			return null;
		}
		double[] out = new double[n];
		out[0] = 0;
		if(out.length > 1) {
			out[1] = 1;
			for(int i = 2; i < out.length; i++) {
				out[i] = out[i-1] + out[i-2];
			}
		}
		return out;
	}
}
