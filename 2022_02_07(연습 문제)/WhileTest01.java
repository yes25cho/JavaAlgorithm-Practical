package Chap01;
import java.util.Scanner;
//01-Q6. 실습 1-4에서 while 문이 종료 될때 변수 i값이 n+1이 됨을 확인 하세요
//(변수  i 값을 출력 하도록 프로그램을 수정 하세요)

public class WhileTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n  = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			sum +=i;
			i++;
		}
		System.out.println("i의 값 : "+i);		//i의 값확인
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}
