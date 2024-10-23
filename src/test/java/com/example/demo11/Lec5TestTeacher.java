package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5TestTeacher {

	@Test
	public void mathTest() {
		int a = Math.max(99, 2);
		System.out.println(a);
		int b = Math.min(99, 2);
		System.out.println(b);
		int c = Math.max(1, Math.max(2, 99)); // �n����T�ӭȥH�W���ܡA�@�˱o��Ӥ�A�A��Ĺ�a�h����U�@�� (�I�s�h�� max/min ����k)
		System.out.println(c);

		int d = Math.abs(-1);
		System.out.println(d);
		int e1 = (int) Math.round(3.4);
		int e2 = (int) Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		int f1 = (int) Math.rint(2.5); // 2 (0.5) 2.5 (1.5) 4
		int f2 = (int) Math.rint(3.5); // 2 (1.5) 3.5 (0.5) 4
		System.out.println(f1);
		System.out.println(f2);
		int g1 = (int) Math.ceil(2.5);
		int g2 = (int) Math.floor(2.5);
		System.out.println(g1);
		System.out.println(g2);

		int h1 = (int) Math.sqrt(4);
		int h2 = (int) Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);

		int i = (int) Math.pow(10, 2); // 10^2
		System.out.println(i);
	}

	@Test
	public void stringTest() {
		// ����
		String str1 = "123456";
		int a = str1.length();
//		System.out.println(a);

		// �P�_���e���L�N�q
		String str5 = new String(); // �w�]�Ŧr��
		String str4 = null; //
		String str2 = ""; // �Ŧr�� (empty string)
		String str3 = " "; // �ťզr��
//		System.out.println(str5);
//		System.out.println(str4);
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		if (str4 != null) {
			boolean b21 = str4.isEmpty();
		}
//		System.out.printf("�r����׬��G%d, isEmpty�����G���G%b\n", str2.length(), b1);
//		System.out.printf("�r����׬��G%d, isEmpty�����G���G%b\n", str3.length(), b2);
		boolean b3 = str2.isBlank();
		boolean b4 = str3.isBlank();
//		System.out.printf("�r����׬��G%d, isBlank�����G���G%b\n", str2.length(), b3);
//		System.out.printf("�r����׬��G%d, isBlank�����G���G%b\n", str3.length(), b4);
		boolean b5 = StringUtils.hasLength(str2);
		boolean b6 = StringUtils.hasLength(str3);
		boolean b7 = StringUtils.hasLength(str4);
//		System.out.printf("�r����׬��G%d, hasLength�����G���G%b\n", str2.length(), b5);
//		System.out.printf("�r����׬��G%d, hasLength�����G���G%b\n", str3.length(), b6);
//		System.out.printf("�r����׬��G%d, hasLength�����G���G%b\n", 0, b7);
		boolean b8 = StringUtils.hasText(str2);
		boolean b9 = StringUtils.hasText(str3);
		boolean b10 = StringUtils.hasText(str4);
//		System.out.printf("�r����׬��G%d, hasText�����G���G%b\n", str2.length(), b8);
//		System.out.printf("�r����׬��G%d, hasText�����G���G%b\n", str3.length(), b9);
//		System.out.printf("�r����׬��G%d, hasText�����G���G%b\n", 0, b10);

		// �j�M
		String s1 = "�p�s�k�P���L�P���P��";
		String s2 = "�L";
//		System.out.println(s1.contains("��"));
//		System.out.println(s1.charAt(4));
//		System.out.println(s1.indexOf("��"));
//		System.out.println(s1.indexOf("��"));  // �p�G�j�M���쵲�G�A�|�^�� -1 
//		System.out.println(s1.lastIndexOf("��"));
//		System.out.println(s1.indexOf("��", 4));
//		System.out.println(s1.indexOf("��", 5));
//		System.out.println(s1.lastIndexOf("��", 9));		
//		System.out.println(s1.lastIndexOf("��", 8));		
//		indexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
//		lastIndexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M

		// ����
//		s1 = s1.substring(7);  // �b�ϥ� String �����Ť�k�ɡA�j�������O�N���G�^�� (���|�������ܰO���餺����)�A�G�n���ܼƸ˰_�ӡA�~����o���ܪ����e��
//		System.out.println(s1);
//		System.out.println(s1.substring(7));
//		System.out.println(s1.substring(7, 9));   // index >= 7  AND index < 9
//		System.out.println(s1);
//		System.out.println(s1.trim());
//		System.out.println(s1.replace("�P", ""));  // ��H�Ŧr����N�Y�Ӥ�r�ɡA�Y�i��q�R���Y�Ӥ�r
//		System.out.println(s1.replace(" ", ""));  // ��H�Ŧr����N�ťծɡA�Y�i��r�ꤤ���Ҧ��ťծ�R��
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.replaceAll("�P", ""));

		// �ഫ��ƫ��A
		String[] ar1 = s1.split("�P");
		String[] ar2 = s1.split("");
//		System.out.println(Arrays.toString(ar1));
//		System.out.println(String.join("+", ar1));
//		System.out.println(s1.toCharArray());   // char array �O�}�C�����S�ҡA���|�L�X�O�����m�A�ӥi�H�����C�X���e�ȡA���L�X�����G���|�� , ���j
//		System.out.println(Arrays.toString(s1.toCharArray()));
		char[] ch = new char[2];
//		System.out.println(ch);
//		s1.getChars(7, 9, ch, 0);
//		System.out.println(ch);
		String q1 = String.valueOf(1);
		String q2 = String.valueOf(true);
		String q3 = String.valueOf(0.0);
		q1 = 1 + "";
		Integer z1 = Integer.valueOf("1");
		int z2 = Integer.parseInt("1");

		// ������e��
		String st1 = "a";
		String st2 = "a";
		String st3 = new String("a");
		String st4 = new String("A");
//		System.out.println(st1==st2);
//		System.out.println(st1==st3);
//		System.out.println(st1.equals(st2));
//		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(str4));
		System.out.println(st1.equalsIgnoreCase(st4));

	}

	// ****** �m�� *******
	@Test
	public void practice() {
		String q = "AAB";
		this.m1(q);
	}

	// ���i�g�k�G��r�걽�@�M�A�����P�ɽT�{�O���@�Ӧr��
	public void m1(String str) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
//		String[] a1 = str.split("");
//		for(int i = 0; i < a1.length; i++) {
//			switch(a1[i]) {
//			case "A":
//				a++;
//				break;
//			case "B":
//				b++;
//				break;
//			case "C":
//				c++;
//				break;
//			case "D":
//				d++;
//			}
//		}

//		char[] a2 = str.toCharArray();
//		for (int i = 0; i < a2.length; i++) {
//			switch (a2[i]) {
//			case 'A':
//				a++;
//				break;
//			case 'B':
//				b++;
//				break;
//			case 'C':
//				c++;
//				break;
//			case 'D':
//				d++;
//			}
//		}
		
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
				a++;
				break;
			case 'B':
				b++;
				break;
			case 'C':
				c++;
				break;
			case 'D':
				d++;
			}
		}		
		System.out.printf("%d��A  %d��B  %d��C  %d��D", a, b, c, d);

	}

	// indexOf �g�k�G�@���u�p��Y�Ӧr��
	public void m2(String str) {
		int a = this.m2Branch(str, "A");
		int b = this.m2Branch(str, "B");
		int c = this.m2Branch(str, "C");
		int d = this.m2Branch(str, "D");
	}
	
	public int m2Branch(String str, String target) {
		int count = 0;
		int i = 0;
		while(str.indexOf("A", i) != -1) {
			count++;
			i = str.indexOf("A", i) + 1;
		}
		return count;
	}
	
	// replace�G�ǥѭ쥻�����שM�ѤU�����סA����֤F�X�ӭ�
	public void m3(String str) {
		String[] targetArr = {"A", "B", "C", "D"};
		int[] countArr = new int[4];   // 0:A���ƥءA1�GB���ƥءA2�GC���ƥءA3�GD���ƥ�
		for(int i = 0; i < targetArr.length; i++) {
			if(str.length()==0) {
				break;
			}
			int old = str.length();
			str = str.replace(targetArr[i], "");
			int newest = str.length();
			countArr[i] = old - newest;			
		}
	}
}
