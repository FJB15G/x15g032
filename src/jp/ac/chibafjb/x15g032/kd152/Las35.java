package jp.ac.chibafjb.x15g032.kd152;

import java.util.Scanner;

public class Las35 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("半径r  -->");
		float r = sin.nextFloat();
		sin.close();
		double π =3.14;
		System.out.println("円周  ="+(2*π*r));
		System.out.println("面積  ="+(π*r*r));
		

	}

}
