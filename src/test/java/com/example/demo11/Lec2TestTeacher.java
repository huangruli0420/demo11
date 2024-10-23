package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2TestTeacher {


	// **********  ���� ***********
	@Test
	public void commentTest() {
		//	������

		/*
		 * �h�����
		 * �o�ӵ��Ѥ覡�i�H���g����h�檺���O
		 */
		this.fileCommentTest(0);
	}
	
	/**
	 * ������
	 * @param test �ѥ���ISBN�s��
	 * @return �ѥ��W��
	 */
	public String fileCommentTest(int test) {
		return null;
	}
	

	// **********  �B�� ***********
	@Test
	public void computeTest() {
		
		// �ӻP�l
		int quotient = 10/3;
		int remaidar = 10%3;
		System.out.println("10���H3 ���ӼƬO�G" + quotient);
		System.out.println("10���H3 ���l�ƬO�G" + remaidar);

		// �ϦV�B��
		boolean test = true;
		System.out.println(!test);

		// ����B��
		boolean res1 = (1!=1);  // false
		boolean res2 = (1==1);  // true
		System.out.println(res1);
		System.out.println(res2);

		// �޿�B��
		System.out.println(res1 && res2);  // && ��ӳ��n���ߤ~�|�O true
		System.out.println(res1 || res2);  // || �u�n���@�Ӧ��ߴN�|�O true

		// �e�m�B��P��m�B��
		int a = 10;
		System.out.println(a--);
		System.out.println(a);
		System.out.println("**************");
		a = 10;
		System.out.println(--a);
		System.out.println(a);

		a = 10;
		System.out.println(a);
		System.out.println(a++ * 10);  // a*10; a=a+1;
		System.out.println(a);
		System.out.println("*******************");
		a = 10;
		System.out.println(a);
		System.out.println(++a * 10);  // a=a+1; a*10;
		System.out.println(a);
		
	}

	
	// **********  �m�� ***********
	@Test
	public void practiceTest1() {

		// �ƾǺ⦡�ഫ�m��
		System.out.println(this.convertToF(30));
		System.out.println(this.convertToC(86));

		// ���t�ƦC�M�������m��
		System.out.println(this.sum(1, 100));

	}

	/**
	 * �ഫ�ū׳�쬰�ئ�
	 * @param c ���ū�
	 * @return �ئ��ū�
	 */
	public double convertToF(double c) {
		return c * 9 / 5 + 32;
	}

	/**
	 * �ഫ�ū׳�쬰���
	 * @param f �ؤ�ū�
	 * @return �ᦡ�ū�
	 */
	public double convertToC(double f) {
		return (f - 32) * 5 / 9;
	}

	/**
	 * �Q�Τ����p��ƦC�`�M
	 * @param start �ƦC�_�l��
	 * @param end �ƦC�פ��
	 * @return �ƦC�`�M
	 */
	public int sum(int start, int end) {
		int sum;
		return (1 + end) * (end) / 2;
	}
	

	// **********  �j�鱱�� ***********
	@Test
	public void forLoop() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	@Test
	public void compareWhile() {
		this.whileLoop();
		System.out.println("*********");
		this.doWhileLoop();
	}
	
	@Test
	public void whileLoop() {
		boolean i = true;
		while(!i) {
			System.out.println("I am in~");
		}
	}
	
	@Test
	public void doWhileLoop() {
		boolean i = true;
		do{
			System.out.println("I am in~");
		} while(!i);
	}

	@Test
	public void infiniteForLoop() {
		// while �L�a�j�骺�g�k
//		while(true) {
//			System.out.println("Hi");
//		}
		int i = -1;

		// for �L�a�j�骺�g�k
		for(;;) {
			i++;
			if(i == 1) {
//				continue;  // ���L�@��
//				return;  // ��������k
				break;  // �������j��
			}
			if(i == 5) {
//				break;
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I still here");
	}

	// **********  �m�� ***********
	@Test
	public void practiceTest2() {

		// ���t�ƦC�M���T�ذj��g�k
		System.out.println(this.sumByForLoop(2, 1));
		System.out.println(this.sumByWhileLoop(1, 100));
		System.out.println(this.sumByDoWhileLoop(1, 100));
		
		// �E�E���k����ؼg�k
		this.mutipleFormByForLoop();
		this.mutipleFormByWhileLoop();
		
	}

	/**
	 * �Q�� for �j��p��ƦC�`�M
	 * @param start �ƦC�_�l��
	 * @param end �ƦC�פ��
	 * @return �ƦC�`�M
	 */
	public int sumByForLoop(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			System.out.println("sum �����e�|�O :"+ start + "~" + i + "���`�M");
			sum+=i; 
			System.out.println(sum);
		}
		return sum;
	}

	/**
	 * �Q�� while �j��p��ƦC�`�M
	 * @param start �ƦC�_�l��
	 * @param end �ƦC�פ��
	 * @return �ƦC�`�M
	 */
	public int sumByWhileLoop(int start, int end) {
		int sum = 0;
		int i = start;
		while(i <= end) {
			sum+=i;
			i++;
		}
		return sum;		
	}

	/**
	 * �Q�� do while �j��p��ƦC�`�M
	 * @param start �ƦC�_�l��
	 * @param end �ƦC�פ��
	 * @return �ƦC�`�M
	 */
	public int sumByDoWhileLoop(int start, int end) {
		int sum = 0;
		int i = start;
		do {
			sum+=i;
			i++;			
		} while(i <= end);
		return sum;		
	}

	/**
	 * �Q�� for �j��ͦ��E�E���k��
	 */
	public void mutipleFormByForLoop() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%2d  ", i, j, i*j);
			}
			System.out.print("\n");
		}
	}

	/*
	 * �Q�� while �ͦ��E�E���k��
	 */
	@Test
	public void mutipleFormByWhileLoop() {
		int i=1;
		while(i < 10) {
			int j=1;  // �C�� i ���槹�@������A�N�|���s��l�� j
			while(j < 10) {
				System.out.printf("%d*%d=%2d  ", i, j, i*j);
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
	
}
