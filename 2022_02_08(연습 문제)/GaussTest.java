package Chap01;

import java.util.Scanner;
//1-Q8. 1���� 10������ ���� (1+10)+5�� ���� ������� ���� �� �ֽ��ϴ�.
//���콺�� �����̶�� ����� �̿��Ͽ�  1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.

public class GaussTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("n�� �� �Է� : ");
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
		
		System.out.println("1���� "+n+"������ �� : "+sum);
		sc.close();
	}

}
