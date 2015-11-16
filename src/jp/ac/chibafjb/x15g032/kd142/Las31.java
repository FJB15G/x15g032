package jp.ac.chibafjb.x15g032.kd142;

import java.util.Scanner;

public class Las31 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int s1 = sin.nextInt();
		int s2 = sin.nextInt();
		
		sin.close();
		System.out.println("整数aの入力   ―→"+s1);
		System.out.println("整数bの入力   ―→"+s2);
		
		System.out.println(s1+"+"+s2+"="+(s1+s2));
		System.out.println(s1+"-"+s2+"="+(s1-s2));
		System.out.println(s1+"/"+s2+"="+(s1/s2));
		System.out.println(s1+"*"+s2+"="+(s1*s2));

	}

}
