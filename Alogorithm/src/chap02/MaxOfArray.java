package chap02;
import java.util.Scanner;

class MaxOfArray {
 // 배열 A 요소의 최댓값을 구하여 반환합니다.
	static int MaxOf(int[] a) {
		int max = a[0] ;
		for (int i = 1 ;i<a.length ; i++)
			if (a[i]>max)
				max =a[i] ;
		return max ;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in) ;
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = stdIn.nextInt() ;
		
		int[] height = new int[num] ; // 요소수가 num인 배열 생성 
		
		for ( int i = 0 ; i < num ; i++) {
			System.out.println("height[" + i + "]:");
			height[i] = stdIn.nextInt() ;
		}
		
		System.out.println("최댓값은 " + MaxOf(height) + "입니다.");
	}

}
