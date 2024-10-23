package com.example.demo11;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3TestTeacher {

	// 遞迴的概念
	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	public int recurrence(int x) {
		// 當拆解到最小問題時，直接傳回答案
		if (x == 1) {
			return 1;
		}
		// 每一次的答案會是 原本傳進來的參數 + 以(參數-1)來呼叫此方法的結果
		// 程式碼內自己呼叫自己，就稱為遞迴
		int sum = x + this.recurrence(x - 1);
		return sum;
//		return x + this.recurrence(x-1);  // 匿名變數寫法 (省略 sum)
	}

	// 條件控制 - if
	@Test
	public void ifTest() {

		String weather = "大太陽";

		// if 
//		if(weather == "下雨") {  // 如果符合 if 內的條件
//			System.out.println("帶雨傘");  // 符合才會執行 if 大括號後的內容
//		}
//		System.out.println("不用帶雨傘");  // 執行完 if 內的內容後，會接著往下執行之後的程式碼，所以一樣會印出"不用帶雨傘"

		// if ... else ...
//		if (weather == "下雨") {  // 如果符合 if 內的條件
//			System.out.println("帶雨傘");  // 符合才會執行 if 大括號後的內容
//		} else {  // 否則 ( 即不符合 if 內的條件的狀況 )
//			System.out.println("不用帶雨傘");  // 執行 else 大括號後的內容
//		}
		
		// if ... else if ... else
//		if(weather == "下雨") {  // 如果符合 if 內的條件
//			System.out.println("帶雨傘");  // 符合才會執行 if 大括號後的內容			
//		} else if (weather == "大太陽") {  // 否則 ( 即不符合 if 內的條件的狀況 )，如果符合 else if 內的條件 
//			                             // => 當不符合第一個 if 時，才再次判斷
//										 // => 故若一開始就符合，不會進入此判斷
//			System.out.println("戴墨鏡");  // 符合才會執行 else if 後的內容
//		} else {  // 否則 ( 此時剩下的即既不符合 if 也不符合 else if 條件的狀況 )
//			System.out.println("不用做任何事情");  // 以上兩個 if 篩選沒過的，才來執行最後一個
//		}

		int a = 11;

		// 假設來玩 11 點，則 > 11 就輸了， < 11 也輸了，只有在 == 11 的時候，才會贏
		if(a == 11) {
			System.out.println("贏了");			
		} else if ( a <= 11) {
			System.out.println("比較小輸了");
		} else {
			System.out.println("比較大輸了");			
		}

	}

	// 條件控制 - switch
	@Test
	public void switchTest() {
		
		String book = "序";
		
		// 可以把 switch 想成要程式讀一本書
		switch(book) {  // 小括號內放的是要程式開始讀的條件
		case "序":  // 程式會依序對應每一個 case，從符合條件的 case 開始往下閱讀，case 底下沒有程式碼也無妨
		case "第一章":
			System.out.println("11111111");
			break;  // 讀到 break 的時候，程式就會收到結束閱讀的通知，離開 switch 的大括號
		case "第二章":
			System.out.println("22222222");
					// 而若沒有加上 break 的話，程式就會接著執行，直到把整本「書」給讀完
		default:  // 若程式根據輸入的條件，找不到相符的 case，就會自動從 默認(default) 的位置開始執行
			System.out.println("END");
		}  // default 通常放在最後，因為後面沒有別的 case，且會遇上右大括號，故無須特別加上 break 就會自行離開
	}

	@Test
	public void guessNumberPrepare() {
		// ***** 螢幕輸入 ******
//		System.out.println("請輸入內容");
//		Scanner scan = new Scanner( System.in );
//		int digital = scan.nextInt();
//		System.out.println("您輸入的數字是：" + digital);
//		String str = scan.next();
//		System.out.println("您輸入的內容是：" + str);
//		String str2 = scan.nextLine();
//		System.out.println("您輸入的內容是：" + str2);
//		char ch = str2.charAt(2);
//		System.out.println("索引位置 2 的字元是：" + ch);
		
		// ***** 隨機產生數字 *****
//		System.out.println((int)(Math.random()*100 + 1));
//		System.out.println((int)(Math.random()*100) + 1);
//		System.out.println((int)(Math.random()*100) + 1);
//		System.out.println((int)(Math.random()*100) + 1);
		Random random = new Random();
//		System.out.println(random.nextInt(2, 4));
//		System.out.println(random.nextInt(2, 4));
//		System.out.println(random.nextInt(2, 4));
//		System.out.println(random.nextInt(2, 4));
//		System.out.println(random.nextInt(2, 4));
		
	}
	
	// ****** 練習 ********
	@Test
	public void practiceTest() {
//		this.getPrice(20);
		System.out.println(this.convertGrade(98));
	}
	
	public int getPrice(int age) {

		// 用變數將票價裝起來，方便之後維護 (如漲價需要修改，只需更動此處即可)
		int price = 150;

		if(age <= 6 || age >= 80) {  // 先篩選邊界值，會較方便之後的運算，因為切割出來的段落比較少且連貫
									 // 用 小於等於6歲且大於等於80歲 切割後剩下的人群會是 => 7~79
									 // 用 7~12或60~79 切割後剩下的人群會是 => <=6 13~59 >=80
									 // 用 13~59 切割後剩下的人群會是 => <=12 >=60 
			return (int)(price*0.2);
		} else if (age <= 12 || age >= 60) {  // 因為第一層 if 已經篩選掉未滿七歲或大於八十歲的人群，故剩下的人一定會在 7~79 之間，可忽略 7和79歲的條件
			return (int)(price*0.5);
		} else {   // 最終剩下的即一般票價的人
			return price;
		}
		
		// 單純 if 的寫法雖然較為冗長，但閱讀上較 if... else if... else 輕鬆
//		if(age <= 6 || age >= 80) {
//			return (int)(price*0.2);	// return 會直接將結果回傳並中止此方法，	故滿足條件的人會自動離開	
//		}
//		if(age >= 7 && age <= 12 || age >= 60 && age <= 79) {
//			return (int)(price*0.5);			
//		}
//		return price;
		
	}

	public char convertGrade(int score) {
		// 因為回傳的字串長度只有 1 ，故也可以使用字元來儲存
		/* 
		 * 字串 vs 字元
		 * 字串：將宣告的內容用 " " 包起來，不限 "" 內的文字長度
		 * 字元：將宣告的內容用 ' ' 包起來，限制 '' 內的文字長度只能為 1
		 */ 

		// 整數/整數=整數，小數點會被自動省略
		switch(score/10) {  // 根據輸入的條件，搜尋對應的 case，需要完全相符才會進入該 case 內
		case 10:  // 因為 case 10 和 case 9 要執行的內容都一樣，故可以直接刪除 case 10 的內容，直接讓他執行和 9 一樣的方法
				  // 因為 case 只是程式要執行的起點位置，即使這個起點位置內沒有程式碼也無妨，只是會順著繼續往下執行
		case 9:
//			char res = 'A';  // 此為最終要回傳的轉換結果
			return 'A';  // 因為 switch 執行完之後，只是要將 res 的內容值回傳，而使用 return 可以達到和 break 相同的效果，並可以同時回傳值

		case 8:
			return 'B';

		case 7:
			return 'C';

		case 6:
			return 'D';

		default:  // 當程式找不到相符的 case 時，最終就會進入此區塊執行裡面的方法
			return 'F';
		}
	}
	

}
