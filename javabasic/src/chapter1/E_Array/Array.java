package chapter1.E_Array;

import java.util.Scanner;

// 배열
// '같은 타입'의 변수가 나열된 형태
// 배열은 '생성'해서 사용함 => 생성해서 사용하는 변수 : 참조 변수
// new 연산자로 생성 할 수 있음
// 배열은 실제 데이터가 저장되는 것이 아니라
// 데이터 배열이 저장된 첫 번째 메모리 주소가 저장됨

public class Array {

	public static void main(String[] args) {
		
		// 동일한 그룹의 데이터를 변수로만 선언해서 사용할 때
		int score1, score2, score3, score4, score5;
		score1 = 90;
		score2 = 100;
		score3 = 70;
		// 위 방식의 문제점
		// 관리가 어려움, 특정 조건에 따른 데이터는 가져오기 힘듦
		
		// 배열
		// 동일 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태
		// 선언 방법 : 데이터타입[] 배열명;
		int[] scoreList;
		// 생성 방법 : 배열명 = new 데이터타입[배열의 길이];
		scoreList = new int[5];
		System.out.println(scoreList);
		// 초기화 방법: 배열명[인덱스번호] = 데이터
		scoreList[0] = 90;
		scoreList[1] = 100;
		scoreList[2] = 80;
		scoreList[3] = 70;
		scoreList[4] = 60;
		Scanner scanner = new Scanner(System.in);
		
//		for(int i = 0;i < 5;i++) {
//			scoreList[i] = scanner.nextInt();
//		}
//		for(int i = 0;i < 5;i++) {
//		System.out.print(scoreList[i]);
//		}
//		System.out.println();
		
		// 선언과 동시에 생성 및 초기화
		// 1. 데이터타입[] 배열명 = new 데이터타입[]{ 요소1, ...}
		int[] scores = new int[] {90,80,100};
		System.out.println(scores.length);
		
		// 2. 데이터타입[] 배열명 = { 요소1, ... };
		char[] string = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(string);
		string[0] = 'k';
		System.out.println(string);
		
		// 다차원 배열
		// 선언 방법: 데이터타입[][] 배열명;
		// 생성 방법: 배열명 = new 데이터타입[첫번째 배열길이][두번째 배열길이];
		// 선언과 동시에 초기화
		// 1. 데이터타입[][] 배열명 = new 데이터타입[][] { { 요소11,... }, { 요소21,... },  ... };
		// 2. 데이어타입[][] 배열명 = { { 요소11, ...}, { 요소21, ...}, ... };
		
		// int[] scores = new int[] {90,80,100};
		int[] extraScoreList = scores;
		
		System.out.println(scores);
		System.out.println(extraScoreList);
		
		extraScoreList[0] = 70;
		
		System.out.println(scores[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
