package day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		//���� ������ ����ڷ� ���� �Է¹޾� ����Ͻÿ�.
		//Scanner ��ü�� ���
		
		double radius;
		double area;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���.");
		radius = scan.nextDouble();
		area = radius*radius*3.14;
		System.out.println(area);
		
	}

}
