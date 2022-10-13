package chap4;

import java.util.Scanner;

public class Primetest {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하자 ");
				int n = sc.nextInt();
				int a = 0;
				
				for (int i = 1; i <= n ; i++) {
					if(n%i == 0) {
						a = a + 1;
					}
				}
				if (a == 2) {
					System.out.println("prime");
				}
				else {
					System.out.println("not prime");
				}
			}
		}

