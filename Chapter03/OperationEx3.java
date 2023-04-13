package study01.chapter03;

public class OperationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		System.out.println(num1 +=1);
		
		System.out.println(num1%=10);
		num1 -=1; // num1 = num1-1
		System.out.println(num1);
		
		//변수1 : 변수 2 참이면 변수 1, 거짓이면 변수 2
		int num = (5<3)? 10:20;
		System.out.println(num);
		
	}

}
