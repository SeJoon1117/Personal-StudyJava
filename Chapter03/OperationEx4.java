package study01.chapter03;

public class OperationEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;	//00000101
		int num2 = 10;	//00001010
		
		int result = num1 & num2;	// AND 연산 > 00000000
		int result1 = num1 | num2;	// OR 연산  > 00001111
		System.out.println(result);
		System.out.println(result1);
		
		int num3 = 5;	//00000101
		System.out.println(num3<<1);// x2 한거랑 같은 효과
		System.out.println(num3);
		System.out.println(num3<<2);// x4 한거랑 같은 효과
		System.out.println(num3<<3);// x8 한거랑 같은 효과
		
		System.out.println(num3>>1);//00000010 /2한거랑 같은 효과
	}

}
