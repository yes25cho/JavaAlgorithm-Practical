package chap01;
import java.util.Scanner;
//Q1.�� ���� �ֵ����� ���ϴ� max4 �޼��带 �ۼ��ϼ���.
//max4 �޼ҵ�
//static int max4(int a, int b, int c, int d)
public class max4Test {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max<b)
			max = b;
		if(max<c)
			max = c;
		if(max<d)
			max = d;
		
		return max; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �ֵ����� ���ϴ� ���α׷�");
		System.out.print("a�� �� �Է� : "); int a= sc.nextInt();
		System.out.print("b�� �� �Է� : "); int b= sc.nextInt();
		System.out.print("c�� �� �Է� : "); int c= sc.nextInt();
		System.out.print("d�� �� �Է� : "); int d= sc.nextInt();
		
		System.out.println();
		System.out.println("�ִ��� "+max4(a, b, c, d)+"�Դϴ�.");
		sc.close();
	}

}
