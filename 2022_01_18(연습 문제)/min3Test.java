package chap01;

import java.util.Scanner;
//Q2.������ �ּڰ��� ���ϴ� min3 �޼��带 �ۼ��Ͻÿ�
//min3 �޼���
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
		System.out.println("�� ���� �ֵ����� ���ϴ� ���α׷�");
		System.out.print("a�� �� �Է� : "); int a= sc.nextInt();
		System.out.print("b�� �� �Է� : "); int b= sc.nextInt();
		System.out.print("c�� �� �Է� : "); int c= sc.nextInt();
		
		System.out.println();
		System.out.println("�ּڰ��� "+min3(a, b, c)+"�Դϴ�.");
		sc.close();
	}//main

}//class
