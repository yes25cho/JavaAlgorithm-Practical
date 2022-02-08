package Chap01;

import java.util.Scanner;
//1-Q7. 실습 1-5 프로그램을 참고하여 n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램을 작성하세요

public class fortest_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하는 프로그램입니다.");
		System.out.print("n의 값 입력 : ");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i =1; i<=n; i++) {
			sum=sum+i;
			if(i==1) {
				System.out.print(i);
			}
			else {
				System.out.print(" + "+i);
			}
		}
		System.out.println(" = "+sum);
		sc.close();
	}

}
