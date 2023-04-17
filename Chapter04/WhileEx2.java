package study01.chapter04;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do{	//do는 무조건 한 번 실행하고 아래 while 조건이 맞지 않으면 실행하지 않음
			sum += i;	//+= =+ 차이점 알아두기
			i++;
		}while (i<=10);
		//while(true); 무한 루프
		System.out.println("1부터 10까지의 합은"+sum+"입니다.");
	}

}
