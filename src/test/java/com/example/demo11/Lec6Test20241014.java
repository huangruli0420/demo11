package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec6Test20241014 {

	@Test
	public void main() {
		//在測試檔案裡回傳值一定是void，非測試一定方法名稱要寫main
		
		//8種基本資料型態都能夠大寫變成類別，只有int變類別是Integer，其餘都直接開頭大寫
		//整數預設值為0，浮點數為0.0，字元為空字元，布林值為False
		//加上字串也是一種類別，只要開頭大寫都是類別
		//類別預設值都是Null
		int a = 10;
		Integer b = 20;
		Integer c = new Integer(30); //會有黃蚯蚓，不會報錯但是不建議的寫法
		// class類別
		String str = "abc" ;
		String str1 = new String("abc"); //只有字串作為類別可以直接用等號給值
		//====================================
		int aaa; //預設值為0;
		Integer bbb; //預設值為null,因為Integer是類別(class)
	}
	
	@Test
	public void StringTest(){
		String str = "abc";
		String aaa = "abc"; 
		//若創建字串時沒有指定new，則都會指向字串池的同個字串，同個記憶體位置
		str = str + "ABC"; // str = "abcABC"
		//用+連接字串就會在新記憶體位置創造一個新字串為abcABC，原本的abc還在
		//若使用StringBuffer則會在原本位置改變原本的值，則abc會改變變成abcABC			
	}
	
	@Test
	public void StringTest2() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str == str1);   
		System.out.println(str1 == str2);  //上述兩行其實都是在比較記憶體位置
		//用.equals或.equalsIgnoreCase才會比較對人類來說有意義的內容
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}
	
	@Test
	//若測試權限寫成private則無法測試，通常都寫public或不寫
	public void stringBufferTest() { 
		
		StringBuffer strBuf = new StringBuffer();  //因為StringBuffer是一個值，所以右邊賦值要有new
		strBuf.append("ABC");
		strBuf.append("DEF").append("GHI").append(false); //StringBuffer串接都是用.append
		System.out.println(strBuf.toString()); //類別要列印前，要先轉字串，用類別名稱.toString		
	} 
	
	@Test
	public void stringReverseTest() {
		//用for迴圈反轉字串
		String str = "abcde";
		String[] strArray = str.split(""); // [a,b,c,d,e] index:0 1 2 3 4
		
		String newStr = "";
		for(int i = strArray.length-1; i >= 0; i-- ) {
			String item = strArray[i];
			newStr = newStr + item;
			//第一次: i = 4; item = "e";  newStr從 "" --> "" + "e" = "e"
			//第二次: i = 4; item = "d";  newStr從 "e" --> "e" + "ed" = "ed"
			//第三次: i = 4; item = "c";
			//第四次: i = 4; item = "b";
			//第五次: i = 4; item = "a";
		}
		System.out.println(newStr);

		//用StringBuffer類別的反轉字串方法	
		String str1 = "abcde";
		StringBuffer rvstr1 = new StringBuffer(str);
//		rvstr1 = rvstr1.reverse();
//		System.out.println("reverse str1:" + rvstr1);
		System.out.println("str1:" + str1);
		System.out.println("reverse str1:" + rvstr1.reverse() );   //匿名變數
	}
	
	@Test
	public void tttTest() {		
		int a = 5;
		if (a >= 18)
			System.out.println("年齡:" + a); //若不寫{}則迴圈或判斷條件就只會套用一行，因此只會印出"已成年"
			System.out.println("已成年");
	}
	
	
	
	
	
}
