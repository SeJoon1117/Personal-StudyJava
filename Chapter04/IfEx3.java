package study01.chapter04;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다.");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생 입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}
		System.out.println("입장료는" + charge + "입니다.");
		//"입장료는 charge 입니다." 안됨 파이썬처럼 이용
	}
}
