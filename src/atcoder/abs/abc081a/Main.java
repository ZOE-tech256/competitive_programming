package atcoder.abs.abc081a;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner sc;
			File f = new File("src/atcoder/abs/abs_input.txt"); 
			sc = (f.exists()) ? new Scanner(f) : new Scanner(System.in);

			String s = sc.nextLine();
			
			// ビー玉の数
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				// 1文字ずつ切りだしてチェック
				if (s.substring(i, i + 1).equals("1")) {
					count++;
				}
			}
			
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}