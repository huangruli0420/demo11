package com.example.demo11;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ClassTest20241014 {

	@Test	
	public void dogTest() {
		
		Dog myDog = new Dog();  //使用關鍵字new建立一個新的實例，以狗這個類別來說就是一支新的狗
		
//		System.out.println("我的狗的品種:" + myDog.breed); //若讓程式碼停在這行並執行，結果會是null，因為還未跑到下面賦值給breed
		myDog.running();
		
		//設定每個實力不同的屬性(特性)
		myDog.breed = "柴犬";
		myDog.color = "淺黃";
		myDog.name = "霸氣的總柴";
		myDog.age = 1 ;
		
		System.out.println("我的狗的品種:" + myDog.breed);
		System.out.println("我的狗的毛色:" + myDog.color);
		//===============================================
		//使用方法(行為)
		myDog.run();
		myDog.running();
		myDog.eat("胖總柴");
		myDog.run(myDog.name);
		myDog.run(myDog.name,5);
		myDog.run(5,myDog.name);		
	}
	
	@Test
	public void bankTest() {
		Bank bank = new Bank();
		
//		bank.branch = "TTA 分行";		//當屬性的存取權限為私人就只能用getter和setter
//		bank.user = "xdd";
//		bank.balance = 1000;
		bank.setUser("AAA");
		bank.setBalance(1000);
		
		System.out.println("名稱為:" + bank.getUser());
		//存款
	    bank.saving(1000);
	    //提款
		bank.withdraw(2500);
	}
	
	@Test
	public void bankTest2() {
		Bank bank = new Bank();
		System.out.println("bank : " + bank);
		Bank bank1 = new Bank();
		System.out.println("bank1: " + bank1);
		Bank bank2 = bank;
		System.out.println("bank2: "+ bank2);
		System.out.println(bank == bank1);		// ==用在基本資料型態會比較值，用在類別比較的是記憶體位置;
		System.out.println(bank == bank2);		//在定義一個方法時，小括號內可以是任何資料型態
		
	}
	
	@Test
	public void stringTest() {
		String str = "ABC";
		String str1 = "ABC";
		String str2 = new String();
		String str3 ;
		Bank bank = new Bank();
		bank.withdraw4(1000, "title", "TTA分行", "AAA"); //可變參數
		
	}
	
	@Test
	public void bankTest3() {
		Bank bank = new Bank();
		bank.setBranch("TTA");
		bank.setUser("AAA");
		bank.setBalance(1000);
		//===================
		//帶有參數的建構方法，實作內容等同於setXXX 方法，實際作用在於減少程式碼的行數
		Bank bank1 = new Bank("TTA", "BBB", 2000);	
		System.out.println("====================");
		
	}
	
	@Test						//靜態方法，static和finals
	public void bankTest4() {
		//withdraw31 是靜態方法，可以直接透過類別名稱.靜態方法呼叫
		Bank.withdraw31("TTA分行","AAA",0);
		//withdraw3是一般方法，必須要先建立一個new的類別，才能呼叫
		Bank bank = new Bank();
		bank.withdraw3("TTA分行","AAA",0);
		//=====================================
		Math.random();				//Math類別裡的靜態方法random可以直接呼叫，通常是工具類方法會是靜態方法
		Random ran = new Random();
		ran.nextInt();				//無法直接寫Random.nextInt，因為Random類別裡的nextInt不是靜態方法
		System.out.println(bank.aaa);
	}
	
	@Test							//正規表達式			
	public void stringRegexTest() {			
		String str = "ABCADAQW";
		String newStr = str.replace("A","Z");
		String newStr1 = str.replaceAll("A","Z");
		System.out.println(newStr);
		System.out.println(newStr1);
		
		String newStr2 = str.replaceAll("[A-C]", "Z"); //replaceAll可以用正規表達式
		System.out.println(newStr2);
		String newStr3 = str.replace("[A-C]", "Z"); //replace無法用正規表達式
		System.out.println(newStr3);
	}

	@Test							//正規表達式
	public void stringRegexTest2() {		
		// 要比對手機號碼格式:數字4碼-數字3碼-數字3碼
		// \d表示數字0~9的任意其中一個
		// \在JAVA中代表跳脫符號，用來跳脫有特殊意義的符號，讓\右邊有特殊意義的符號變成單純的字串
		// \\ --> 第一個跳脫符號是讓第二個跳脫符號從有特殊意義變成單純的字串
		String pattern1 = "\\";
		System.out.println(pattern1);
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("請輸入手機號碼，格式為:數字4碼-數字3碼-數字3碼" );
		String input = scan.nextLine();
		boolean check = input.matches(pattern); //若這行有寫，if內只要寫check，判斷條件參數如果不寫就是==true
		if (check) {								
			System.out.println(input + "符合手機號碼");
		}else {
			System.out.println(input +"不符合手機號碼");
		}
		//=================================================
		// 上面的 input.matches(pattern)的結果用變數check接回來
		// 但在後續程式碼中，變數check指使用了一次
		// 所以可以用匿名的方式來改寫，不用變數名稱來接等號右邊的結果
		if (input.matches(pattern)) {								
			System.out.println(input + "符合手機號碼");
		}else {
			System.out.println(input +"不符合手機號碼");
		}	
	}
	
	public void stringRegexTest3() {		
		// 要比對手機號碼格式:數字4碼-數字3碼-數字3碼
		// \d表示數字0~9的任意其中一個
//		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		//使用大括號處理 pattern中 重複出現的字串，但僅限於{}前面的那個字串
//		String pattern1 = "\\d{4}-\\d{3}-\\d{3}";
//		上一行-\\d{3} 重複出現兩次，-\\d{3}式包含了-，\\d，{3}這3個字串
		//所以需要用小括號將這3個字串框成同一組(-\\d{3})，再用大括號{2}處理重複的部分
		String pattern ="\\d{4}(-\\d{3}){2}";
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("請輸入手機號碼，格式為:數字4碼-數字3碼-數字3碼" );
		String input = scan.next();
		
		if (input.matches(pattern)) {					//等同於 input.matches(pattern) == true				
			System.out.println(input + "符合手機號碼");
		}else {
			System.out.println(input +"不符合手機號碼");
		}	
	}
	
	@Test
	public void stringRegexTest4() {
		//市話格式1: 數字2碼-數字7碼
		//市話格式2: (數字2碼)-數字7碼
		String pattern1 ="\\d{2}-\\d{7}";
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 請輸入台南市話號碼，格式為:數字2碼-數字7碼，或是(數字2碼)-數字7碼 " );
		String input = scan.next();
		
		if (input.matches(pattern2) || input.matches(pattern1)) {
			System.out.println(input + " 符合市話號碼格式 ");
		}else {
			System.out.println(input + " 不符合市話號碼格式 ");
		}	
		//====================================================================================
		//合併 pattern1 和 pattern2
		String pattern3 = "\\d{2}-\\d{7}||\\(\\d{2}\\)-\\d{7}" ;         //正規表達式不能隨意加空白字串
		if (input.matches(pattern3) || input.matches(pattern1)) {
			System.out.println(input + " 符合市話號碼格式 ");
		}else {
			System.out.println(input + " 不符合市話號碼格式 ");
		}	
		//另一種合併方式
		String pattern4 = "(\\d{2}||\\(\\d{2}\\))-\\d{7}";
		if (input.matches(pattern4) || input.matches(pattern1)) {
			System.out.println(input + " 符合市話號碼格式 ");
		}else {
			System.out.println(input + " 不符合市話號碼格式 ");
		}	
	}
	
	@Test
	public void stringRegexTest5() {
		//市話格式: 數字2碼-數字7碼或8碼
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		String pattern1 = "\\d{2}-\\d{7,8}";        // \\d{7,8}，表示\\d至少可出現7至多可出現8次
		
	}
	
	//以下兩個Test為2024/\10/15回家作業
	@Test
	public void stringRegexHomeworkTest() {
		String pattern = "(\\d{2}-|\\(\\d{2}\\))\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println ("請輸入市話號碼，格式為:數字2碼-或(數字2碼)，加上數字7到8碼" );
		String input = scan.nextLine();
		if(input.matches(pattern)){
			System.out.println(input + " 符合市話號碼格式 ");
		}else {
			System.out.println(input + " 不符合市話號碼格式 ");
		}	
	}
	
	@Test
	public void stringRegexHomeworkTest2() {
		String pattern ="0\\d{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println (" 請輸入市話號碼，格式為:區碼0開頭共2~4碼，以-連接，加上數字7到8碼 " );
		String input = scan.nextLine();
		
		if(input.matches(pattern)) {
		System.out.println(input + " 符合市話號碼格式 ");
		}else {
		System.out.println(input + " 不符合市話號碼格式 ");
		}	
	}
	
	@Test
	public void staticTest() {
//		Bank.a = 1;
		Bank b = new Bank();
		System.out.print(b.a);
	}
	
	@Test
	public void regexTest() {
		String pattern = "[A-CSW-Z]";    //符合的字母有A B C S W X Y Z，參照ASCII code的順序，若寫A-z中間會有特殊符號
		String str = "_";
		System.out.println(str.matches(pattern));
	}
	
	@Test
	public void numberTest() {
		System.out.println("輸入市話號碼，格式為:區碼0開頭加上1~3碼不得為0，共2~4碼，再以-連接，加上數字7到8碼");
		
		String pattern = "0[1-9]{1,3}-\\d{7,8}";
//		String pattern = "0[//d&&[^0]]{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		if(input.matches(pattern)) {
			System.out.println(input + " 符合市話號碼格式 ");
		}else {
			System.out.println(input + " 不符合市話號碼格式 ");
		}	
	}
	
	@Test
	public void idTest() {
		System.out.println("輸入非六都身份證字號，長度10碼，第一碼英文字母(不分大小寫)，第二碼數字1或2，加8碼數字");
		String pattern = "[\\w&&[^ABDEFHabdefh0-9_]][12]\\d{8}";   // 0-9也可改成\\d
//		String pattern = "[A-Za-z&&[^ABDEFHabdefh]][12]\\d{8}";
		
		
		Scanner scan = new Scanner(System.in);
		String id = scan.next();
		
		if(id.length() !=10) {
			System.out.println("你輸入身分證字號的長度不是10碼");
			return;
		}
		if(id.matches(pattern)) {
			System.out.println(id + " 符合非六都身分證字號格式 ");
		}else {
			System.out.println(id + " 不符合非六都身分證字號格式 ");
		}
	}
	
//	20241120 程式異常處理
	@Test
	public void test() {
//		List<String> list = null;
//		for(String str :list) {
//			System.out.println(str);
//		}
		
		String str = null;
		getLength(str);
	}
	
	public void getLength(String str) {
		//try裡面要放的是預期會發生錯誤的程式碼，基本上不會去改Exception，因為是所有Exception的父類別，若是他之下的兄弟類別則互相抓不到
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("AAA");
		}
		//=============================
		// finally區塊裡面無論如何都會執行
		try {
			System.out.println(str.length());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
		System.out.println("BBB");
		}
	}
	
	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		try  {
			String input = scan.next();
		} catch(Exception e) {
			
		} finally {
			//scan 屬於 I/O類，new出來後系統會建議在不使用時(程式碼最後)將其關閉(close)以避免資源的浪費
			// 若沒有關閉不會報錯，頂多就是浪費資源
			scan.close();
		}
		//=========================================================================================
		// try-with-resources:
		// 1. 將 new 出來的 I/O 類寫在 try 後面的小括號中
		// 2.程式碼離開 try-catch 的區塊後會自動執行 close將資源關閉
		// 3.小括號中若有多個 I/O 類時，用分號區隔
		try (Scanner scanA = new Scanner(System.in);
				Scanner scanB = new Scanner(System.in);) {
			String input = scanA.next();
		} catch (Exception e) {
			
		} 
	}
	
}

