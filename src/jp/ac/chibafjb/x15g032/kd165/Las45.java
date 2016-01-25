package jp.ac.chibafjb.x15g032.kd165;

public class Las45 {

	public static void main(String[] args) {
		int[]a ={5,10,15};
		int[]b =new int[3];
		int i;
		int m =3;
		for(i = 0;i < m;i++)
			b[m - i - 1] =a[i];
		for(i= 0;i < m;i++)
			System.out.println("b["+i+"] = "+b[i]);
	}
}
