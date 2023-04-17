package study01.chapter04;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		//for(;;) 무한 루프
		for(i=0; i<=10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}
}