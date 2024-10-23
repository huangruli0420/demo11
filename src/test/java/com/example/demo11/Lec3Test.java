package com.example.demo11;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.mockito.ArgumentMatchers.intThat;

import java.util.Scanner;
import java.util.Random;
import org.junit.jupiter.api.Test;

public class Lec3Test {
	
	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}
	
	public int recurrence(int x) {
	//當拆解到最小問題時，直接回傳答案
		if (x==1) {
		return 1;
		}
		// 每一次的答案會是 原本傳進來的參數 +以(參數-1)來呼叫此方法的結果
		// 程式碼內自己呼叫自己，就稱為遞迴
		int sum = x + this.recurrence(x-1);
		return sum;
		//return x + this.recurrence(x-1);
	}
	
	@Test
	public void ifTest() {
		String weather = "下雨";
		//if
		if(weather == "下雨") {				//如果符合if內的條件
			System.out.println("帶雨傘"); 	//符合才會執行if大括號後的內容
		}
		System.out.println("不用帶雨傘");	//執行完if的內容後，會執行下面的程式碼，故一樣會印出不用帶雨傘
		
		//if... else...
		if (weather == "下雨") {				//如果符合if內的條件
			System.out.println("帶雨傘");	//符合才會執行if大括號後的內容
		}else {								//否則(即不符合if內條件的情況)
			System.out.println("不用帶雨傘");//執行else大括號後的內容
		}		
		
		//if... else if... else...
		if (weather == "下雨") {
			System.out.println("帶雨傘");
		}else if(weather == "大太陽"){
			System.out.println("戴墨鏡");
		}else {
			System.out.println("不用做任何事");
		}
	}
		
		
	@Test
	public void priceTest() {
		this.price(12,100);
		this.price(7,100);
		this.price(60,100);
		this.price(6,100);
		this.price(-1,100);
	}
	public void price(int age,int price) {
		if(12<age && age<60 ) {
			System.out.printf("票價為%3d元\n",price);
		}else if(7 <= age && age <=12) {
			price = price*5/10;
			System.out.printf("票價為%3d元\n",price);
		}else if(60 <= age && age <= 79) {
			price = price*5/10;
			System.out.printf("票價為%3d元\n",price);
		}else if(0<=age && age<=6 ){
			price = price*2/10;
			System.out.printf("票價為%3d元\n",price);
		}else if(80<=age ){
			price = price*2/10;
			System.out.printf("票價為%3d元\n",price);	
		}else 
			System.out.println("請輸入0以上的整數");
		}
	
	@Test		//沒有防呆但比較好的兩種寫法
	public void price2Test() {
		this.price2(12,100);
	}
	public int price2(int age,int price) {
		if(age <=6 || age >=80 ) {
			return (int) (price*0.2);
		}else if(age <= 12 || age >=80) {
			return (int)(price*0.5);
		}else {
			return price;
		}
	}
	
	@Test
	public void price3Test() {
		this.price3(12,100);
	}
	public int price3(int age,int price) {
		if(age <=6 || age >=80 ) {
			return (int) (price*0.2);
		}
		if(7<=age &&age <= 12 || 60 <=age && age <=79) {
			return (int)(price*0.5);
		}
			return price;
		}

//條件控制 Switch
	@Test
	public void switchTest() {
		
		String book = "序";
//		String book = "第一章";
		
		//可以把switch想成要讀一本書
		switch(book) {  //小括號內放的是要程式開始讀的條件
		case "序":		//程式會依序對應每一個case，從符合條件的case開始向下閱讀，case底下沒有程式碼也無妨 
		case "第一章" :
			System.out.println("111");
			break;		//讀到break的時候，程式就會收到結束閱讀的通知，離開switch的大括號
		case "第二章" :
			System.out.println("222");
						//而若沒有加上break的話，程式就會接著執行直到讀完整本書
		default :		//若程式根據輸入條件找不到相符的case，就會自動從default開始執行
			System.out.println("END");
		}	//deafault通常放到最後，因為後面沒有別的case，故不用加break就會自動離開
	}
	
	@Test    //簡潔的寫法
	public void convertGradeTest() {
		System.out.println(this.convertGrade(10));
	}
	
	public String convertGrade(int grade) {  //返回的值也可以從字串改成字元，String改成char
											 //字元要放在''裡，並且文字長度只能為1
		switch(grade/10) {
		case 10:
//			return "A"; //可寫可不寫，直接跳過到下一個case不影響100跟90~99分結果為相同 
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	
	}
	
	
	@Test    //原本的寫法
	public void convertGrade2Test() {
		this.convertGrade2();
	}
	
	public void convertGrade2() {
		int grade = 100;
		grade = grade/10;
		
		switch(grade) {
		case 10:
//			System.out.println("A"); //可寫可不寫
		case 9:
			System.out.println("A");
		case 8:
			System.out.println("B");
		case 7:
			System.out.println("C");
		case 6:
			System.out.println("D");
		default:
			System.out.println("F");
		}
	}
	
	@Test
	public void guessNumberTest() {
		Random gen = new Random();
		int answer = (int)(Math.random()*(99 - 1 + 1)) + 1;  //gen.nextInt(98)+1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("這是一個猜數字的遊戲，請輸入1~99的整數");
		int up = 99;
		int low = 1;

		for(int c = 5; c >= 1; c --) {
			System.out.printf("你還剩%d次機會\n", c);
			int guess = scan.nextInt();
			
//			if(guess > up || guess < low) {
//				System.out.println("請正確輸入範圍內的數字");
//				continue;      //若是沒有設定幾次內猜到正確答案可以加這段防呆
//			}
						
			if(guess == answer) {
				System.out.printf("恭喜你猜對了，答案是%2d", answer);
				break;
			}
			if(c == 1) {
				System.out.printf("沒猜中，答案是%2d", answer);
			}else {
				System.out.print("沒猜中，");
				if(guess > answer) {
					System.out.printf("猜小一點，範圍在%2d到%2d\n", low, guess);
					up = guess;
				}
				if(guess < answer) {
					System.out.printf("猜大一點，範圍在%2d到%2d\n", guess, up);
					low = guess;
				}
				//System.out.printf("範圍在%2d到%2d\n", up, low); //若這樣寫則上面兩行可以省略成一行
			}	
		}
	}
	
	
	
	
	
}

	
	
