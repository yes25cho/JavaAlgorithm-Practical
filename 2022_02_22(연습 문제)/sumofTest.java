package Chap01;
//1-Q9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반홤하는 아래 메서드를 작성하세요. 

import java.util.Scanner;

public class sumofTest {
	static int sumof(int a, int b) {
		int max, min, add=0;
		if(a>b) {
			max = a;
			min = b;
		}
		else if(a<b) {
			max = b;
			min = a;
		}
		else {
			return a;
		}
		for(int i=min; i<=max; i++) {
			add+=i;
		}
		return add;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a값 입력 : ");
		int sa = sc.nextInt();
		System.out.print("b값 입혁 : ");
		int sb = sc.nextInt();
		
		System.out.print("a와 b사이의 합 : "+sumof(sa,sb));
		
		sc.close();
	}

}
