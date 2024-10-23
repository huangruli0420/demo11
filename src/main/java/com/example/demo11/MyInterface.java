package com.example.demo11;

// 介面本身就預設是一個抽象的物件，因此介面和介面裡的方法的 abstract 關鍵字可有可無
// 完整的寫法是: public abstract interface
// 抽象物件無法使用關鍵字 new 來生成實例
public interface MyInterface {

	// 定義在介面中的屬性
	// 1. 權限只能是 public 或是 no modifier
	// 2. 必須要給初始值
	int NUM = 10;
	public int NUM2 = 10;
	// 3. 完整的寫法(或是被編譯後的寫法)
	// 4. 常數(固定不變的數): 變數名稱全大寫，不同英文單字間用底線串接，一般的屬性或變數則用小駝峰方式命名變數
	// 被加上 static 的方法或變數不用先創建一個擁有他們的類別就可呼叫，若是一個類別被加上 final 則無法被繼承
	public static final int NUMBER = 10;

	// 因為介面是一個抽象物件，所以定義裡面的方法都是抽象方法
	// 只是關鍵字 abstract 一樣可以省略: public abstract void fly();
	public void fly();

	public void flying();

	// 介面中可以有預設的方法實作內容(有大括號)，但一定是要加上關鍵字 default
	// 預設方法不強制一定要重新定義
	public default void flying(String name) {
		System.out.println(name + "~~flying");
	};

	// 定義在介面中的 static方法，一定要有實作內容
	// 因為 static 關鍵字會讓方法無法被重新定義
	public static void flying2(String name) {
		System.out.println(name + "~~flying");
	};
}
