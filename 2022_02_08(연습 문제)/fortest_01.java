package Chap01;

import java.util.Scanner;
//1-Q7. �ǽ� 1-5 ���α׷��� �����Ͽ� n�� 7�̸� '1+2+3+4+5+6+7=28'�� ����ϴ� ���α׷��� �ۼ��ϼ���

public class fortest_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("n�� �� �Է� : ");
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
