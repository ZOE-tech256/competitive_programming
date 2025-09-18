package algorithms.combinatorics;

/**
 * 順列のアルゴリズム nPr
 */
public class Permutation {

	public static void main(String[] args) {
		
		String[] array = { "A", "B", "C", "D", "E"};
		int count = 0;
		
		// r=1
		System.out.println("1つ取り出す順列");
		for (int i = 0; i < array.length; i++) {
			count++;
			System.out.print("{" + array[i] + "}");
		}
		System.out.println();
		System.out.println("順列： " + count + "通り");
		
		
		// r=2
		count = 0;
		System.out.println();
		System.out.println("2つ取り出す順列");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				 // 同じ要素は使わない
				if (j == i) {
					continue;
				}
				count++;
				System.out.print("{" + array[i] + ", " + array[j] +"}");
			}
			System.out.println();
		}
		System.out.println("順列： " + count + "通り");
		
		
		// r=3
		count = 0;
		System.out.println();
		System.out.println("3つ取り出す順列");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (j == i) {
					continue;
				}
				for (int k = 0; k < array.length; k++) {
					if (k == i || k == j) {
						continue;
					}
					count++;
					System.out.print("{" + array[i] + ", " + array[j] + ", " + array[k] +"}");
				}
			}
			System.out.println();
		}
		System.out.println("順列： " + count + "通り");
	}
	
}
