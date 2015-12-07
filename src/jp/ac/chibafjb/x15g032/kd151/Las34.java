package jp.ac.chibafjb.x15g032.kd151;

import java.util.Scanner;

public class Las34 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("a -->");
		float a = sin.nextFloat();
		System.out.print("b -->");
		float b = sin.nextFloat();
		sin.close();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));

	}

}
