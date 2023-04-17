package study01.chapter04;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		//while(true){ 무한 루프
		while (i<=10){	//while문은 조건이 맞지 않으면 한번도 실행 안시킬 수도 있음
			sum += i;	//+= =+ 차이점 알아두기
			i++;
		}
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}

}
