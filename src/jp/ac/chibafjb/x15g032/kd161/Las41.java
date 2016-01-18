package jp.ac.chibafjb.x15g032.kd161;

public class Las41 {

	public static void main(String[] args) {
		int[]a = new int[2];
		
		a[0] = 10;
		a[1] = 20;
		
		int work = 0;
		work = a[1];
		a[1] = a[0];
		a[0] = work;
		
		for(int i = 0;i < 2;i++)
			System.out.println("test["+ i+"] = "+ a[i]);
		
		
	}

}
