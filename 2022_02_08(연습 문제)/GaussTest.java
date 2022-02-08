package Chap01;

import java.util.Scanner;
//1-Q8. 1부터 10까지으 합은 (1+10)+5와 같은 방법으로 구할 수 있습니다.
//가우스의 덧셈이라는 방법을 이용하여  1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.

public class GaussTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하는 프로그램입니다.");
		System.out.print("n의 값 입력 : ");
		int n = sc.nextInt();
		
		int sum = (1+10)*5;
		if(n==0) {	
		}
		else if(n<10) {
			for(int i = n+1; i<=10; i++) {
				sum=sum-i;
			}
		}
		else {
			for(int i = 11; i<=n; i++) {
				sum=sum+i;
			}
		}
		
		System.out.println("1부터 "+n+"까지의 합 : "+sum);
		sc.close();
	}

}
