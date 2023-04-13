package study01.chapter03;

public class OperationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int i = 2;
		
		boolean value = (((num1 = num1 + 10)>10) && ((i = i+2)>10));
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//논리곱은 두 항 모두 true 일 때만 true AND 연산자
		
		 value = (((num1 = num1 + 10)>10) || ((i = i+2)>10));
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		//논리곱은 두 항 모두 false 일 때만 false OR 연산자

	}

}
