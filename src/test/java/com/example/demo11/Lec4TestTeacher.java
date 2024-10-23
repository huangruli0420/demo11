package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Lec4TestTeacher {

	@Test
	public void arrayTest() {

		// �ŧi�}�C
		int[] arr1 = new int[7];  // ��«ŧi
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7];  // ��«ŧi
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7};  // �ŧi�P�ɵ���

		// ��ŧi���}�C���e�ȳ��|�O null �άO �w�]�� (�p�G�ŧi�ɨS�����)
//		System.out.println(arr1[0]);       // �p�G�ϥΰ򥻸�ƫ��A�ŧi�A�|�۰����A�˶i�w�]��
//		System.out.println(arr1Class[0]);  // �p�G�ϥ����O�ŧi�A���|���w�]�ȡA�|�O�Ū�
//		System.out.println(arr3[7]);       // �]�����ޭȬO�q 0 �}�l�A�G���׬� 7 �ɡA���ޭȷ|�b 0~6�A�{���䤣����ޭȬ� 7 ����l�A�N�|����

		// ���
		arr1[0] = 99;
//		System.out.println(arr1[0]);
		
		// practice
		double weatherW1 = 30.0;
		double weatherW2 = 26.5;
		double weatherW3 = 27.5;
		double weatherW4 = 23.3;
		double weatherW5 = 21.8;
		double weatherW6 = 28.5;
		double weatherW7 = 35.9;
		double[] weather = {30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9};	// �ϥΰ}�C�i�H�٥h�h�Ӭۦ����ܼơA��K�޲z
		
		System.out.println(this.avgWeather(weather));
		
	}

	public double avgWeather(double[] weatherData) {
		System.out.println(weatherData.toString());   // �u�n���O�򥻸�ƫ��A�ܼƸ̭��s���|�O�O�����m�A�G�������ܼƦW���ഫ���r��A�|�L�X�O�����m
		System.out.println(Arrays.toString(weatherData));   // �ݭn�ϥ� Arrays ���Ѫ���k�~�ॿ�T�L�X���e��

		double sum = 0;
		for(int i = 0; i < weatherData.length; i++) {  // �}�C�����ޭȳ̤j < ���סA�]�����ޭȥû����|�O����-1
			sum+=weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length;   // ���קY���Ȫ��ӼơA�G /���� �Y��������
		return avg;
	}

	@Test
	public void listTest() {
		// �ŧi
		List<String> list1= Arrays.asList( "1", "2" );  // �L�k�W�R
		List<Integer> list2= List.of( 99, 100 );   // �L�k�W�R
		List<Character> list3= new ArrayList<>();  // �i�H���N�ק�
		List<String> list7= new ArrayList<String>();  // �᭱�����A���@�˥i�H��J��ƫ��A�A���]���ܳ·СA�q�`���|�g
		List<String> list8= new ArrayList<>(list1);  // �ŧi�P�ɵ���
//		System.out.println(list8.get(0));
		
		// �ϥ� ArrayList �~����ק� List �����e
//		list8.add("3");
//		System.out.println(list8.get(0));
//		list8.remove("1");
//		System.out.println(list8.get(0));

		// Q ������O new ArrayList ?
//		List<Character> list5= new List<>();
		// A �]�� list �O interface ����Ʈ榡�A�G��S�������@(��ڪ��ާ@�B�J)�A�L�k�Q�Ы�
		//   �p�G�չ� new List �|�ɭP���~
//		list3 = new LinkedList<Character>();
		// Q �����򤣨ϥ� ArrayList �Ӹ� new ArrayList �����G ?
//		ArrayList<Character> list4= new ArrayList<>();
//		list4 = new LinkedList<Character>();    
		// A (1) �]�� ArrayList �O��@ List �̭��w�q�n����k�A�G ArrayList �i�H�Q�����O List ���@��
		//       �G List ���|�� ArrayList ���ƥ������A�i�H�˶i ArrayList
		//       ==> �u�n�O��@ interface �����O(class)�A���i�H�� interface �@����e��(�ܼ�) ����ƫ��A
		//   (2) �]�� interface �i�H�Q�h�����O��@�A��� interface �ӻ��A���P��@���O�L���@��
		//       �ӹ藍�P��@(class)�ӻ��A���������۳q�A�G�S����k�˶i�����̭�
		//       �]���ĥ� interface �@���e������ƫ��A�A�i�H���˦U���U�˪���@���O(class)

//		System.out.println(list1.get(1));
		// Arrays.asList �M List.of �����׵L�k�ܧ�A�Y���ϥ� add(�s�W) �� remove(�R��)�A�N�|����
//		list1.add("3");  
//		list1.remove(0);
//		list2.add(98);
//		list2.remove(0);
		
		// **** �Ҥl ****
		double[] weather = {30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9};	// �ϥΰ}�C�i�H�٥h�h�Ӭۦ����ܼơA��K�޲z
		List<Double> weatherList1= new ArrayList<>();
		weatherList1.add(30.0);
		weatherList1.add(26.5);
		weatherList1.add(27.5);
		weatherList1.add(23.3);
		weatherList1.add(21.8);
		weatherList1.add(28.5);
		weatherList1.add(35.9);

		List<Double> tempList = Arrays.asList( 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 );
		List<Double> weatherList2 = new ArrayList<>(tempList);
		List<Double> weatherList3 = new ArrayList<>(List.of( 30.0, 26.5, 27.5, 23.3, 21.8, 28.5, 35.9 ));		
//		for(int i = 0; i < weatherList3.size(); i++) {
//			System.out.print(weatherList3.get(i)+ "  ");
//		}
//		weatherList3.remove(weatherList3.indexOf(30.0));
		// (1) �j�M index of 30.0�A�j�M�����^�� index of 30.0
		// (2) �ھ� index of 30.0�A�����������ޭ� 
		
//		System.out.println(weatherList3.contains(30.0));
	}
	
	// ******** �m�� *********
	@Test
	public void practiceTest() {
		int[] score = { 60, 61, 62, 59, 58};
		this.avgScore(score);
		this.avgScoreBySort(score);
	}
	
	public double avgScore(int[] score) {
		System.out.println("�z��J���}�C���G" + Arrays.toString(score));
		int sum = 0;
		int max = score[0];
		int min = score[0];
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];				
			}
			sum += score[i];
		}
		System.out.printf("�̤j�ȡG%d\n�̤p�ȡG%d\n�o���G%d\n", max, min, (sum-max-min)/(score.length-2));
		return (sum-max-min)/(score.length-2);
	}
	
	public double avgScoreBySort(int[] score) {
		System.out.println("�z��J���}�C���G" + Arrays.toString(score));
		Arrays.sort(score);   // �L�^�ǭȡA�u�n�I�s���o�Ӥ�k�A�O���餺���}�C�N�|�ƧǦn�F
		System.out.println("�Ƨǫᬰ�G" + Arrays.toString(score));
		int sum = 0;
		for(int i = 1; i < score.length-1; i++) {   // �]���w�g�ƧǦn�F�A�G�p���`�M�ɡA�ٲ� index 0 �M index last ���ƧY�i
			sum += score[i];
		}
		System.out.printf("�̤j�ȡG%d\n�̤p�ȡG%d\n�o���G%d", score[0], score[score.length-1], sum/(score.length-2));
		return sum/(score.length-2);		
	}


}