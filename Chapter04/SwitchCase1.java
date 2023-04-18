package study01.chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank = 1;
		char medalColor;
		
		//break를 꼭 넣어줘야되고 안넣으면 break 나올때까지 switch 문이 돌아감
		switch(rank) {
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank+"등 메달의 색갈은"+medalColor+"입니다.");
	}

}
