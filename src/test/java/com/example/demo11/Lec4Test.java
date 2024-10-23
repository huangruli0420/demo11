package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Lec4Test {

	@Test
	public void arrayTest(){
		
		//宣告陣列
		int[] arr1 = new int[3];
		Integer[] arr1Class = new Integer[7];
		int arr2[] = new int[7];
		int arr3[] = {1,2,3,4,5,6,7};     //宣告同時賦值
		
		System.out.println(arr1[0]);      //使用基本資料型態宣告，會自動放入預設值
		System.out.println(arr1Class[0]); //如果使用類別宣告，不會有預設值，會是空的
//		System.out.println(arr3[7]); 	  //因為索引值是從0開始，arr3的索引值為0~6，故要找值為7的資料會找不到	
	
		// 放值
		arr1 [0] = 99;
		System.out.println(arr1[0]);
		
		//practice
		double[] weather = {30.0, 26.5, 27.5, 23.3, 21.0, 28.5, 35.9}; //使用陣列可以省略多個相似的變數，方便管理
		
		System.out.print(this.avgWeather(weather));
		}
	@Test
	public void avgWeatherTest() {
		double[] weather = {30.0, 26.5, 27.5, 23.3, 21.0, 28.5, 35.9};
		System.out.print(this.avgWeather(weather));
	}
	
	public double avgWeather(double[] weatherData){
		System.out.println(weatherData.toString());		  //只要不是基本資料型態變數，則儲存的會是記憶體位置，故直接把變數名稱轉換成字串，會印出記憶體位置
		System.out.println(Arrays.toString(weatherData)); //需要使用Arrays提供的方法才能正確印出內容值
		
		double sum = 0;
		for(int i = 0; i< weatherData.length; i ++) {
			sum += weatherData[i];
			System.out.println(weatherData[i]);
		}
		double avg = sum / weatherData.length; //長度即為值的個數，故除以長度=平均
		return avg;
	}
	
	@Test
	public void avgGradeTest() {
		int[] grade = {100, 50, 60, 70, 10};
		System.out.print("有效分數:" + this.avgGrade(grade));
	}
	
	public int avgGrade(int[] gradeData) {
		System.out.println("評審分數:" + Arrays.toString(gradeData));
		
		int sum= 0;
		int max = gradeData[0];
		int min = gradeData[0];
		
		for(int i=1; i<=4; i ++) { 
			if(gradeData[i] > max) {
				max  = gradeData[i];
			}
			if(gradeData[i] < min) {
				min = gradeData[i];
			}
		}	
		for(int j =0; j<=4; j ++) {
			sum += gradeData[j];
		}	
				
		sum = sum - max - min;	
		int avg = sum / (gradeData.length-2); 
		return avg;
	}
	
	@Test      //使用Arrays.sort(); 的寫法
	public void avgGrade2Test() {
		int[] grade = {100, 50, 60, 70, 10};
		this.avgGrade2(grade);
	}
	
	public int avgGrade2(int[] gradeData) {
		System.out.println("評審分數:" + Arrays.toString(gradeData));
		Arrays.sort(gradeData);//排序完後會自動回傳
		System.out.println("排序過後的評審分數:" + Arrays.toString(gradeData));
		
		int sum= 0;
		for(int j =1; j<gradeData.length-1; j ++) {
			sum += gradeData[j];
			System.out.println(sum);
		}	
		System.out.printf("最大值:%2d\n最小值:%2d\n得分%d", gradeData[0], gradeData[gradeData.length-1],sum /(gradeData.length-2));
		return  sum / (gradeData.length-2); 
	}
	
//List
	
	@Test
	public void ListTest(){
		List<String> list1 = Arrays.asList("1","2"); //無法增刪
		List<Integer> list2 = List.of(99,100);		 //無法修改
		System.out.println(list1.get(1));
//		Array.asList 和 List.of的長度無法變更，若對其使用add或remove就會報錯
//		list1.add("3"); 							//無法新增第三個字串"3"，
//		list1.remove(0); 							//無法移除第一個字串
		
		List<Character> list3 = new ArrayList<>();	//最常使用，可以修改長度，前面也可寫ArrayList，List是介面，ArrayList是類別
		list3 = new LinkedList<Character>();		
		List<String> list7 = new ArrayList<String>();	//後面角括號一樣可以填資料型態，但因麻煩通常都不會寫
		List<String> list8 = new ArrayList<>(list1);	//宣告同時給值
		//使用ArrayList才能夠修改List的內容
		list8.add("3");
		System.out.println(list8.get(2));
		list8.remove("1");
		System.out.println(list8.get(0));
		
		// Q 為什麼是 new ArrayList ?
//		List<Character> list5= new List<>();
		// A 因為 list 是 interface 的資料格式，故其沒有任何實作(實際的操作步驟)，無法被創建
		//   如果試圖 new List 會導致錯誤
//		list3 = new LinkedList<Character>();
		// Q 為什麼不使用 ArrayList 來裝 new ArrayList 的結果 ?
//		ArrayList<Character> list4= new ArrayList<>();
//		list4 = new LinkedList<Character>();    
		// A (1) 因為 ArrayList 是實作 List 裡面定義好的方法，故 ArrayList 可以被視為是 List 的一種
		//       故 List 不會對 ArrayList 有排斥反應，可以裝進 ArrayList
		//       ==> 只要是實作 interface 的類別(class)，都可以用 interface 作為其容器(變數) 的資料型態
		//   (2) 因為 interface 可以被多個類別實作，對於 interface 來說，不同實作都是他的一種
		//       而對不同實作(class)來說，彼此互不相通，故沒有辦法裝進彼此裡面
		//       因此採用 interface 作為容器的資料型態，可以盛裝各式各樣的實作類別(class)

//		System.out.println(list1.get(1));
		// Arrays.asList 和 List.of 的長度無法變更，若對其使用 add(新增) 或 remove(刪除)，就會報錯
//		list1.add("3");  
//		list1.remove(0);
//		list2.add(98);
//		list2.remove(0);
		} 
	
	@Test   //以下三種寫法都會印出一樣的結果，但第一種最常用，
	public void weatherListTest() {
///		double[] weather = {30.0, 26.5, 27.5, 23.3, 21.0, 28.5, 35.9};
		List<Double> weatherList = new ArrayList<>();
		weatherList.add(30.0);
		weatherList.add(26.5);
		weatherList.add(27.5);
		weatherList.add(23.3);
		weatherList.add(21.0);
		weatherList.add(28.5);
		weatherList.add(35.9);
		for(int i =0; i <weatherList.size();i++) {      	//i<weathersize，因為索引值最大是長度<1
			System.out.println(weatherList.get(i) + "");
		}	
			
		List<Double> tempList = Arrays.asList(30.0, 26.5, 27.5, 23.3, 21.0, 28.5, 35.9);
		List<Double> weatherList2 = new ArrayList<>(tempList);	
		for(int j =0; j <weatherList2.size(); j++) {
			System.out.println(weatherList2.get(j) + "");
		}	
			
		List<Double> weatherList3 = new ArrayList<>(List.of(30.0, 26.5, 27.5, 23.3, 21.0, 28.5, 35.9));
		for(int j =0; j <weatherList3.size(); j++) {
			System.out.println(weatherList3.get(j) + ""); //List.of也可改成Arrays.asList
		}
		System.out.println(weatherList3); //直接印出整個清單
		
//		List的方法
		int a = weatherList3.indexOf(30.0); //找到此數值的索引值，可以再跟想要刪除的值
//		System.out.println(a);
//		weatherList3.remove(a);             //可以直接將這兩行合併成下面一行
		weatherList3.remove(weatherList3.indexOf(30.0));
		System.out.println(weatherList3);   //30.0已被移除這個清單      
		
		System.out.println(weatherList3.contains(30.0)); //尋找清單是否含有這兩個值
		System.out.println(weatherList3.contains(26.5));		
	}
	
	@Test
	public void avgWeatherByListTest () {
		List<Double> weatherList = new ArrayList<>();
		weatherList.add(30.0);
		weatherList.add(26.5);
		weatherList.add(27.5);
		weatherList.add(23.3);
		weatherList.add(21.0);
		weatherList.add(28.5);
		weatherList.add(35.9);
		
		double sum = 0;
		for(int i = 0; i<weatherList.size();i ++) {
			sum += weatherList.get(i);
		}
		System.out.println(sum/weatherList.size());
		
		//遍歷寫法
		//item是可自定義的變數名稱，用來代稱冒號後面的List裡的每一筆資料，可增加可讀性
		for(Double item : weatherList) {           
			if(weatherList.indexOf(item) == 0) {
//				weatherList.add(0);
//				weatherList.remove(0.0);
			}
			System.out.println(item);
		}
		
		//lamda寫法
//		double sum2 = 0;
//		weatherList.forEach(item ->{
//			sum2 += item;
//			System.out.println(item); 
//		});		
	}
	
	

	@Test
	public void fourDigitNumberTest() {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(0);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		
		for(int i=1; i <=4; i++) {
			int index =(int)(Math.random()*numberList.size());
			System.out.print(numberList.get(index));
			numberList.remove(index);
		}		
	}
	
	@Test
	public void fourDigitNumberTest2() {
		System.out.println(this.fourDigitNumber2());
	}
	
	public String fourDigitNumber2() {
		List<Integer> numberList = new ArrayList<>();
		
		while(numberList.size()<4) {
			int num =(int)(Math.random()*(9-0+1)+1);
			
			if(!numberList.contains(num)) {
				numberList.add(num);
			}		
		}
		
		String completeList = ""; 
		for(int i=0; i<numberList.size(); i++) {
			completeList += String.valueOf(numberList.get(i)) + " ";
		}
		
		return completeList;
	}	
}
