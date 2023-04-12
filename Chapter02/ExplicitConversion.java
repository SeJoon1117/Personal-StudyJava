package study01.chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);

		double dNum = 3.14;
		iNum = (int)dNum; //소수 무시하고 정수부분만 갖고오기
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 3 + 0 = 3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 = 4.04
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
