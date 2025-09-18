package algorithms.combinatorics;

/**
 * 組合せのアルゴリズム nCr
 */
public class Combination {

	public static void main(String[] args) {
		
		String[] array = { "A", "B", "C", "D", "E"};
		int count = 0;
		
		// r=1
		System.out.println("1つ取り出す組合せ");
		for (int i = 0; i < array.length; i++) {
			count++;
			System.out.print("{" + array[i] + "}");
		}
		System.out.println();
		System.out.println("組合せ： " + count + "通り");
		
		
		// r=2
		count = 0;
		System.out.println();
		System.out.println("2つ取り出す組合せ");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				count++;
				System.out.print("{" + array[i] + ", " + array[j] +"}");
			}
			System.out.println();
		}
		System.out.println("組合せ： " + count + "通り");
		
		
		// r=3
		count = 0;
		System.out.println();
		System.out.println("3つ取り出す組合せ");
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
					count++;
					System.out.print("{" + array[i] + ", " + array[j] + ", " + array[k] +"}");
				}
			}
			System.out.println();
		}
		System.out.println("組合せ： " + count + "通り");
	}
	
}
