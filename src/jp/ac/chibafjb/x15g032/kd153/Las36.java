package jp.ac.chibafjb.x15g032.kd153;

import java.util.Scanner;

public class Las36 {
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r  -->");
		float r = sin.nextFloat();
		double π =3.14;
		System.out.println("円周  ="+(Math.round(2*π*r*10)/10.0f));
		System.out.println("面積  ="+(Math.round(π*r*r*10)/10.0f));
	}

}
