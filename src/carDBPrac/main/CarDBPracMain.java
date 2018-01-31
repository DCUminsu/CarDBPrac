package carDBPrac.main;

import java.util.Scanner;

public class CarDBPracMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("=================");
		System.out.println("번호를 입력하세요");
		System.out.println("1. 자동차 정보 보기");
		System.out.println("2. 자동차 정보 입력");
		System.out.println("3. 자동차 정보 수정");
		System.out.println("4. 자동차 정보 삭제");
		System.out.println("==================");
		int inputNum = sc.nextInt();
		if(inputNum == 1) { // 자동차 정보 조회
		} else if(inputNum == 2) { // 자동차 정보 입력
			break;
		} else if(inputNum == 3) { // 자동차 정보 수정 
			break;
		} else if(inputNum == 4) { // 자동차 정보 삭제
			break;
		} else { // 다른 번호 입력했을때
			System.out.println("다시 입력해 주세요.");
		}
		}
		System.out.println("종료");
	}

}
