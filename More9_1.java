package more;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class More9_1 {

	// 日常生活でよく使われているのは１０になったら繰り上がる１０進数です
	// １０進数が普及したのは人間の指が１０本あるからだといわれています

	// もし、サイのように３本指の動物が文明をもったら、
	// ６進数が一般的な世界になるかもしれません
	// ここではそんなサイ文明での足し算をプログラムで表現してください
	// 足し算の結果はintの最大値（2147483647）を超える可能性があります

	// サイたちは０から５の数字を以下の文字で表しています（便宜上、サイ数字といいます）
	// 6進数の文明なので６以上の数字は存在していません
	// 0：A
	// 1：B
	// 2：C
	// 3：D
	// 4：E
	// 5：F

	// コンソールにはサイ数字で２つの数字が半角スペース区切りで入力されます
	// 二つの数字を足し算した結果をサイ数字でコンソールに出力してください
	// 以下の状況は考慮外とする
	// ①サイ文字以外が入力される可能性
	// ②0から始まる入力値

	// 入力例①
	// CDC【半角スペース】EA
	// ヒト数字に換算すると６進数で232 40

	// 出力例①
	// DBC
	// ヒト数字に換算すると６進数で312

	// 入力例②
	// FFDADCAAFFDB【半角スペース】B
	// ヒト数字に換算すると６進数で553032005531(2147483647) 1

	// 出力例②
	// FFDADCAAFFDC
	// ヒト数字に換算すると６進数で553032005532

	public static void main(String[] args) {

		Map<String, Integer> numMap = new HashMap<>();
		numMap.put("A", 0);
		numMap.put("B", 1);
		numMap.put("C", 2);
		numMap.put("D", 3);
		numMap.put("E", 4);
		numMap.put("F", 5);

		Scanner sc = new Scanner(System.in);
		System.out.println("サイ数字を入力してください");

		long sum = 0;
		long numA = 0;
		long numB = 0;
		String str = "";

		String[] saiArray = sc.next().split("");
		for (String s : saiArray) {
			String numStr = String.valueOf(numMap.get(s));
			str += numStr;
		}
		numA = Integer.parseInt(str);
		System.out.println(numA);

		str = "";

		saiArray = sc.next().split("");
		for (String s : saiArray) {
			String numStr = String.valueOf(numMap.get(s));
			str += numStr;
		}
		numB = Integer.parseInt(str);
		System.out.println(numB);

		sum = numA + numB;
		System.out.println(sum);

	}

}
