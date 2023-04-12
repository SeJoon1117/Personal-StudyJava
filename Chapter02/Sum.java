package study01.chapter02;

public class Sum {

	public static void main(String[] args) {

		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		//num2 는 num1의 2의 보수
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}

}
