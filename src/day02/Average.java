package day02;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double kor;
		double eng;
		double mat;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		kor = scan.nextDouble();
		System.out.println("���� ������ �Է��ϼ���.");
		eng = scan.nextDouble();
		System.out.println("���� ������ �Է��ϼ���.");
		mat = scan.nextDouble();
		
		double ave = (kor + eng + mat)/3;
		System.out.println("��� ������ "+ ave + "�Դϴ�.");
		
		if(kor>ave) {
			System.out.println("���������� ����������� �����ϴ�.");
		} else if (kor == ave) {
			System.out.println("���������� ��������� �����ϴ�.");
		} else {System.out.println("���������� ����������� �����ϴ�.");
		}
		if(eng>ave) {
			System.out.println("���������� ����������� �����ϴ�.");
		} else if (eng == ave) {
			System.out.println("���������� ��������� �����ϴ�.");
		} else {System.out.println("���������� ����������� �����ϴ�.");
		}
		if(mat>ave) {
			System.out.println("���������� ����������� �����ϴ�.");
		} else if (mat == ave) {
			System.out.println("���������� ��������� �����ϴ�.");
		} else {System.out.println("���������� ����������� �����ϴ�.");
		}
		
	}

}
