package study01.chapter04;

public class ForEx2_2468 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 2;
		int times = 1;
		
		while( dan<= 9 ) {
			if (dan % 2 != 0) {
				dan++;
				continue;
			}
			times=1;
			while( times <=9 ) {
				System.out.println(dan + "X" + times + "=" +dan*times);
				times++;
				}
			dan++;
			System.out.println();
		}
	}
}