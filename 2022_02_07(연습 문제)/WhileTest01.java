package Chap01;
import java.util.Scanner;
//01-Q6. �ǽ� 1-4���� while ���� ���� �ɶ� ���� i���� n+1�� ���� Ȯ�� �ϼ���
//(����  i ���� ��� �ϵ��� ���α׷��� ���� �ϼ���)

public class WhileTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n  = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum +=i;
			i++;
		}
		System.out.println("i�� �� : "+i);		//i�� ��Ȯ��
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}

}
