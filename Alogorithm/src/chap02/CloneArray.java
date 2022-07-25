package chap02;
//배열을 복제합시다 ~

public class CloneArray {

	public static void main(String[] args) {
		int [] a = { 1, 2, 3, 4, 5 } ;  // 배열 초기자에 의해 생성 
		int [] b = a.clone() ;   // 배열을 복제하자 
		
		b[3] = 0 ;  // B3에는 0을 집어넣기 
		
		
		System.out.println("a=");
		for (int i = 0 ; i< a.length ; i++) 
			System.out.println(" "+ a[i] ) ;
		
		System.out.println("\nb=");
		for ( int i = 0 ; i< b.length ; i++)
			System.out.println("" + b[i]);
	}
}


