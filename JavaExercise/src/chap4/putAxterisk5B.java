package chap4; // 4- 17
import java.util.Scanner;

/*
 * 읽은 갯수만큼 *을 표시하는 문제 4-11을 변경해서 5개 단위로 줄 바꿈해서 표시하는 프로그램을 작성하자.
 */
public class putAxterisk5B {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요?");
		int n = stdIn.nextInt();

		if (n > 0) {
			for (int i = 0; i < (n/5); i++)
				System.out.println("*****");

			int rest = n % 5;
			System.out.println("ㅇ rest값 : " +rest);
			if (rest > 0) {
				for (int i = 0; i < rest; i++)
					System.out.print("*");
				System.out.println();
			}

		}
	}
}

