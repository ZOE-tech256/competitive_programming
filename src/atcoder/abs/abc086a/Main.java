package atcoder.abs.abc086a;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner sc;
			File f = new File("src/atcoder/abs/abs_input.txt"); 
			sc = (f.exists()) ? new Scanner(f) : new Scanner(System.in);

			int a = sc.nextInt();
			int b = sc.nextInt();
			int product = a * b;
			
			if (product % 2 == 0) {
				// 偶数
				System.out.println("Even");
			} else {
				// 奇数
				System.out.println("Odd");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}