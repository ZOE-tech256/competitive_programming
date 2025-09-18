package atcoder.abs.practiceA;

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
			int c = sc.nextInt();
			String s = sc.next();
			System.out.println((a+b+c) + " " + s);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}