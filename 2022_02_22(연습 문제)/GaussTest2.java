package Chap01;

import java.util.Scanner;
//1-Q8. 1���� 10������ ���� (1+10)+5�� ���� ������� ���� �� �ֽ��ϴ�.
//���콺�� �����̶�� ����� �̿��Ͽ�  1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.

public class GaussTest2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("n�� �� �Է� : ");
		int n = sc.nextInt();
		
		int sum = (1+n)*n/2;
		
		System.out.println("1���� "+n+"������ �� : "+sum);
		sc.close();
	}

}
