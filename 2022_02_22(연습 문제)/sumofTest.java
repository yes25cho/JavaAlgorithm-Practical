package Chap01;
//1-Q9. ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ���c�ϴ� �Ʒ� �޼��带 �ۼ��ϼ���. 

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
		System.out.print("a�� �Է� : ");
		int sa = sc.nextInt();
		System.out.print("b�� ���� : ");
		int sb = sc.nextInt();
		
		System.out.print("a�� b������ �� : "+sumof(sa,sb));
		
		sc.close();
	}

}
