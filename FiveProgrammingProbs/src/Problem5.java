public class Problem5 {
	public static int ADD = 0;
	public static int SUBTRACT = 1;
	public static int NONE = 2;
	public static int[] ops = {ADD, SUBTRACT, NONE};
	
	public static void main(String[] args) {
		printPossibilities();
	}
	
	public static void printPossibilities() {
		printPossibilitiesHelper(2, new int[8], 1, 1);
	}
	
	public static void printPossibilitiesHelper(int i, int[] preOps, int last, int total) {
		if(i > 9) {
			if(total == 100){
				printStack(preOps);
			}
		} else {
			for(int op : ops) {
				if(op == ADD) {
					preOps[i-2] = ADD;
					printPossibilitiesHelper(i+1, preOps, i, total+i);
				} else if(op == SUBTRACT) {
					preOps[i-2] = SUBTRACT;
					printPossibilitiesHelper(i+1, preOps, -i, total-i);
				} else {
					preOps[i-2] = NONE;
					int newlast = last*10;
					if(newlast < 0) {
						newlast -= i;
					} else {
						newlast += i;
					}
					printPossibilitiesHelper(i+1, preOps, newlast, total-last+(newlast));
				}
			}
		}
	}
	
	public static void printStack(int[] preOps) {
		for(int i = 1; i < 9; i++) {
			if(preOps[i-1] == ADD) {
				System.out.print(i + " + ");
			} else if(preOps[i-1] == SUBTRACT) {
				System.out.print(i + " - ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println(9);
	}
}
