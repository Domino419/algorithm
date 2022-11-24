package chap6;

/*
 * 요소의 갯수가 5인 배열에 순서대로 5,4,3,2,1을 대입하는 프로그램을 작성하자 
 */ 

public class IntArrayFor {

	public static void main(String[] args) {
		int[] a = new int[5] ;   

		for(int i=0;i<a.length;i++){
			a[i]= 5-i ; 
		}	
			
	   for(int i=0;i<a.length;i++){
			System.out.println("A["+ i+"] = " +a[i] );
		}
	}
}	


