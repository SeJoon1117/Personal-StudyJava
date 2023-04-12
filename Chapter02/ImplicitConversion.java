package study01.chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10; //형 변환
		float fNum = lNum; //작은 수에서 큰 수로는 자연스럽게 변경
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum);
	}

}
