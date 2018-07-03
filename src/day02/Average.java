package day02;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double kor;
		double eng;
		double mat;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		kor = scan.nextDouble();
		System.out.println("영어 점수를 입력하세요.");
		eng = scan.nextDouble();
		System.out.println("수학 점수를 입력하세요.");
		mat = scan.nextDouble();
		
		double ave = (kor + eng + mat)/3;
		System.out.println("평균 점수는 "+ ave + "입니다.");
		
		if(kor>ave) {
			System.out.println("국어점수는 평균점수보다 높습니다.");
		} else if (kor == ave) {
			System.out.println("국어점수는 평균점수와 같습니다.");
		} else {System.out.println("국어점수는 평균점수보다 낮습니다.");
		}
		if(eng>ave) {
			System.out.println("영어점수는 평균점수보다 높습니다.");
		} else if (eng == ave) {
			System.out.println("영어점수는 평균점수와 같습니다.");
		} else {System.out.println("영어점수는 평균점수보다 낮습니다.");
		}
		if(mat>ave) {
			System.out.println("수학점수는 평균점수보다 높습니다.");
		} else if (mat == ave) {
			System.out.println("수학점수는 평균점수와 같습니다.");
		} else {System.out.println("수학점수는 평균점수보다 낮습니다.");
		}
		
	}

}
