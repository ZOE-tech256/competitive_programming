package atcoder.abs.abc081b;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner sc;
			File f = new File("src/atcoder/abs/abs_input.txt"); 
			sc = (f.exists()) ? new Scanner(f) : new Scanner(System.in);

			int n = sc.nextInt();
			List<Integer> listA = new ArrayList<Integer>();
			
			Main main = new Main();
			
			// 操作回数
			int count = 0;
			// 全て偶数か
			boolean isEvenNumber = false;
			
			for (int i = 0; i < n; i++) {
				listA.add(sc.nextInt());
			}
			
			do {
				// 偶数かチェック
				isEvenNumber = main.evenNumberCheck(listA);
				if (isEvenNumber) {
					// リストの各要素を2で割る
					listA = main.DivideEvenNumberdByTwo(listA);
					// 全ての要素が偶数の場合は操作回数+1
					count++;
				}
					
			} while (isEvenNumber);
			
			System.out.println(count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 与えられたリストの要素がすべて偶数ならtrueを返却する
	private boolean evenNumberCheck(List<Integer> listA) {
		
		for (int i = 0; i < listA.size(); i++) {
			// 偶数かチェック
			if (listA.get(i) % 2 == 0) {
				// 全ての要素が偶数の場合はtrue
				if ((i + 1) == listA.size()) {
					return true;
				}
			} else {
				break;
			}
		}
		return false;
	}
	
	// 与えられたリストの要素（偶数）を2で割る
	private List<Integer> DivideEvenNumberdByTwo(List<Integer> list) {
		List<Integer> listA = new ArrayList<Integer>();
		for (int a: list) {
			listA.add(a / 2);
		}
		return listA;
	}
}