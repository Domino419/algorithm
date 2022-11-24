package chap6;

/*
 * 요소의 갯수가 5인 배열에 순서대로 1.1,2.2,3.3,4.4,5.5을 대입하는 프로그램을 작성하자 
 */ 

public class DoubleArrayFor {

	public static void main(String[] args) {
		Double[] a = new Double[5] ;   

		for(int i=0;i<a.length;i++){
			a[i]= (i+1)* 1.1 ; 
		}	
			
	   for(int i=0;i<a.length;i++){
			System.out.println("A["+ i+"] = " +a[i] );
		}
	}
}	


