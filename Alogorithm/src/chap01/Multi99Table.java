package chap01;
//곱셉표를 출력해보자

public class Multi99Table {

	public static void main(String[] args) {
		System.out.println("-----구구단을 외자 -----");
		
		
		for (int i = 1 ; i <= 9 ; i++) {
			for ( int j = 1 ; j <= 9 ; j++)
				
				System.out.printf("%3d", i*j);
				System.out.println();
				
		}
	}

}
