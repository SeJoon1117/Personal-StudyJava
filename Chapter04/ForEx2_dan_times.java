package study01.chapter04;

public class ForEx2_dan_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 2;
		int times = 1;
		
		while( dan<= 9 ) {

			times=1;
			while( times <=9 ) {
				if (times>dan)
					break;
				System.out.println(dan + "X" + times + "=" +dan*times);
				times++;
				}
			System.out.println();
			dan++;
		}
	}
}