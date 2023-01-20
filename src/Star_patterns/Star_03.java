package Star_patterns;

public class Star_03 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1) {
					System.out.print("@ ");
				}
				else if(i==4&&j==4) {
					System.out.print("# ");
				}
				else {
					System.out.print("* ");
				}//else body close
			}//inner for loop body close
		System.out.println();
		}//outer for loop body close
	}//main method body close
}//class body close
