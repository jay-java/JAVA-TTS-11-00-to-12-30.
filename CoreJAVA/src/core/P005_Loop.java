package core;

public class P005_Loop {
	public static void main(String[] args) {
		for(int i=10;i<=5;i++) {
			System.out.println(i);
		}
		for(int l=10;l>=1;l--) {
			System.out.println(l);
		}
		int j = 10;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		int k =10;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
