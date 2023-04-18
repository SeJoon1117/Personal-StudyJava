package study01.chapter04;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 10;
		int day;
		
		//break를 꼭 넣어줘야되고 안넣으면 break 나올때까지 switch 문이 돌아감
		switch(month) {
			case 1: case 3: case 5: case 7: case 9: case 11:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 8: case 10: case 12:
				day = 30;
				break;
			default: 
				day = 0;
				break;
		}
		System.out.println(month+"월은"+day+"일 까지 있습니다.");
	}

}
