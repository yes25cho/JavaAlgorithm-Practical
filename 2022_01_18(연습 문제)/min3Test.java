package chap01;

import java.util.Scanner;
//Q2.세값의 최솟값을 구하는 min3 메서드를 작성하시오
//min3 메서드
//static int min3(int a, int b, int c)

public class min3Test {
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		return min;
	}//min3
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네 값의 최뎃값을 구하는 프로그램");
		System.out.print("a의 값 입력 : "); int a= sc.nextInt();
		System.out.print("b의 값 입력 : "); int b= sc.nextInt();
		System.out.print("c의 값 입력 : "); int c= sc.nextInt();
		
		System.out.println();
		System.out.println("최솟값은 "+min3(a, b, c)+"입니다.");
		sc.close();
	}//main

}//class
