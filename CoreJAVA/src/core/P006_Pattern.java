package core;

//1
//01
//101
//0101
//10101
public class P006_Pattern {
	public static void main(String[] args) {
		//row
		for(int i=1;i<=5;i++) {
			
			//column
			for(int j=1;j<=i;j++) {
				if((i+j)%2 ==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
