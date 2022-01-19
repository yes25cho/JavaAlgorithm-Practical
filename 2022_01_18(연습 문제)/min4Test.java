package chap01;
import java.util.Scanner;
//Q3.네 값의 최솟값을 구하는 max4 메서드를 작성하세요.
//min4 메소드
//static int min4(int a, int b, int c, int d)

public class min4Test {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max>b)
			max = b;
		if(max>c)
			max = c;
		if(max>d)
			max = d;
		
		return max; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("네 값의 최뎃값을 구하는 프로그램");
		System.out.print("a의 값 입력 : "); int a= sc.nextInt();
		System.out.print("b의 값 입력 : "); int b= sc.nextInt();
		System.out.print("c의 값 입력 : "); int c= sc.nextInt();
		System.out.print("d의 값 입력 : "); int d= sc.nextInt();
		
		System.out.println();
		System.out.println("최댓값은 "+max4(a, b, c, d)+"입니다.");
		sc.close();
	}

}
