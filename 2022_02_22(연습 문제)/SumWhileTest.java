package Chap01;
import java.util.Scanner;
//1-Q10. 오름쪽과 같이 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
//단, 변수 b에 입력한 값이  a이하면 변수 b의 값을 다시 입력하세요.

public class SumWhileTest{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력 : ");
		int a=sc.nextInt();//a입력 
		int b=0;//b선언 초기화
		
		do {//b입력 
			System.out.print("n 입력 : ");
			b=sc.nextInt();
		}while(a>=b);
		
		System.out.println("b - a ="+(b-a));//출력
		sc.close();
	}

}
