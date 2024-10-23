package com.example.demo11;

import org.junit.jupiter.api.Test;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

public class HelloTest {
	@Test
	public void helloTest() {
		System.out.println(this.helloMaker("hello"));
		System.out.println(this.helloMaker2("hello","bye"));
}

public String helloMaker(String A) {	
	return A + "world";
}

public String helloMaker2(String... B) {
	return B[1] + "World" ;
}

@Test
public void staticFinalTest() {
System.out.println(Math.PI);
}

@Test
public void variableTest() {
	byte a = (byte)128;
	short b = 3;
	int c = 4;
	a = (byte)c;
	long d = 5L;
	long e = 5l;
	long f = 5;
	System.out.println(a);
	
	float g = (float) 0.5;
	double h = 0.5;
	// 字元
	char i = '1';
	char l = 65;
	System.out.println(l);
 	// 布林值
	boolean j = true;		
	boolean k = false;
	//容器賦值的流程
	int res = 5/2;
	System.out.println(res);
	// 當無小數點時,程式會自動將數字理解為 int(整數)，因此計算結果也會用整數呈現
	System.out.println(5/2);
	System.out.println(5/2.0);
	System.out.println(5.0/2);
	//只要有任一數是小數，程式就能以小數的方式去計算出結果
	double res2 = (double)(5/2);
	//程式執行的順序會是整數5和整數2相除，再將相除出來的整數轉換為小數，最後塞入小數的容器中，因此結果是2.0而非2.5
	System.out.println(res2);
}

@Test
public void hardCodeTest() {

	// 將實作內容直接寫死數字，不易未來維護與利用
	int sum = 4 + 5;
	System.out.println(sum);
	
	int add1 = 4;
	int add2 = 5;

	//將實作內容用兩個變數包裝起來，方便未來修改值的內容(只要修改變數即可)
	int sum2 = add1 + add2;
	System.out.println(sum2);
	
	//省略掉只使用一次的 sum2，稱之為匿名變數
	System.out.println(add1 + add2);
}

	@Test
	public void stringTest() {
		//
		int a = 1;
		int b = 1;
		System.out.println(a == b);
		
		String c = "a";
		String d = "a";
		String e = new String("a");
		System.out.println(c == d);
		System.out.println(e);
		System.out.println(c == e);
		
		//類別與基本資料型態的差異
// 		int		
		
	}
	
}