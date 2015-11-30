package jp.ac.chibafjb.x15g032.kd143;

import java.util.Scanner;

public class Las32 {

	public static void main(String[] args) {
		Scanner sin =new Scanner(System.in);
		System.out.print("住所の入力 -->");
		String s1 =sin.next();
		System.out.print("氏名の入力 -->");
		String s2 =sin.next();
		System.out.print("電話番号の入力 -->");
		String s3 =sin.next();
		sin.close();
	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
