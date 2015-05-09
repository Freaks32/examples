
public class Problem1 {
	public static void main(String[] args) {
		int[] list = {1,66,2,52,6,43,-25,12,520,-129,25,2,61};
		System.out.println(sumfor(list));
		System.out.println(sumwhile(list));
		System.out.println(sumrecursion(list));
	}
	
	public static int sumfor(int[] input) {
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}
	
	public static int sumwhile(int[] input) {
		int sum = 0;
		int i = 0;
		while(i < input.length) {
			sum += input[i];
			i++;
		}
		return sum;
	}
	
	public static int sumrecursion(int[] input) {
		return sumrecursionhelper(input, 0);
	}
	
	public static int sumrecursionhelper(int[] input, int l) {
		if(l >= input.length) {
			return 0;
		}
		return input[l] + sumrecursionhelper(input, l+1); 
	}
}
