package jp.ac.chibafjb.x15g032.kdT21;

import java.util.Scanner;

public class Las40 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数  -->");
		int h = sin.nextInt();
		System.out.print("フライドポテトの個数  -->");
		int f = sin.nextInt();
		
		System.out.println("ハンバーガーの代金  = "+(100*h)+"円");
		System.out.println("フライドポテト      = "+(180*f)+"円");
		System.out.println("小計                = "+((100*h)+(180*f))+"円");
		System.out.println("");
		System.out.println("消費税              ="+(int)(Math.floor((100*h)+(180*f))*0.08)/1+"円");
		System.out.println("合計金額            ="+(int)(Math.floor((100*h)+(180*f))*1.08)/1+"円");
		System.out.println("");
		System.out.print("受取金額             -->");
		int k = sin.nextInt();
		System.out.println("つり銭              ="+(k-(int)(Math.floor((100*h)+(180*f))*1.08)/1+"円"));
		sin.close();

	}

}
