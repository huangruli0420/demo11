package com.example.demo11;

public class Dog{
	//宣告屬性(特性)，就是品種 毛色 名字 年齡一隻狗身上會有的資訊等等
	String breed;
	
	String color;
	
	String name;
	
	int age;

	
	//定義方法(行為)，如吃東西 跑步 睡覺等等，方法後面的()可以在呼叫方法時代入參數
	
	public void run() {
		System.out.println("正在跑!!!");
	}
	public void run(String name) {
		System.out.println(name + "正在跑!!!");
	}
	public void run(int kilo, String name) {
		System.out.println( name + "跑了" + kilo + "公里");
	}
	public void run(String name, int kilo) {
		System.out.println( name + "跑了" + kilo + "公里");
	}
	//定義多個相同名稱的方法，可以用不同的參數個數和資料型態去區別這兩個方法，稱為多載(overload)
	//當參數個數一樣時則會看資料型態，若參數的總個數、資料型態個數與位置都一樣則會報錯
	
	public void running() {
		System.out.println(name + "正在跑!!!");
	}
	
	public void eat(String name) {
		//印出:霸氣的總柴很愛吃變成胖總柴
		System.out.println(this.name + "很愛吃變成" + name); 
	}
	//當類別的屬性名稱和方法的參數名稱一樣時，會在類別的屬性名稱前加上this.
	//當有多個參數時用逗號區隔開，並在前面加上資料型態


}
