package Chap01;
import java.util.Scanner;
//1-Q10. �����ʰ� ���� �� ���� a, b�� ������ �Է��ϰ� b - a�� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��, ���� b�� �Է��� ����  a���ϸ� ���� b�� ���� �ٽ� �Է��ϼ���.

public class SumWhileTest{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a �Է� : ");
		int a=sc.nextInt();//a�Է� 
		int b=0;//b���� �ʱ�ȭ
		
		do {//b�Է� 
			System.out.print("n �Է� : ");
			b=sc.nextInt();
		}while(a>=b);
		
		System.out.println("b - a ="+(b-a));//���
		sc.close();
	}

}
