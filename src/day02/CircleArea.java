package day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//원의 면적을 계산하는 프로그램 작성하기
		//원의 반지름 사용자로 부터 입력받아 계산하시오.
		//Scanner 객체를 사용
		
		double radius;
		double area;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		radius = scan.nextDouble();
		area = radius*radius*3.14;
		System.out.println(area);
		
	}

}
