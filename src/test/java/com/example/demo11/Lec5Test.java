package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5Test {

	
	@Test
	public void mathTest() {
		int a = Math.max(99, 2);
		System.out.println(a);
		int b = Math.min(99, 2);
		System.out.println(b);
		int c =Math.max(1, Math.max(99, 2));
		System.out.println(c);
		
		int d = Math.abs(-1);
		System.out.println(d);
		int e1 = (int)Math.round(3.4);
		int e2 = (int)Math.round(3.5);
		System.out.println(e1);
		System.out.println(e2);
		
		int f1 =(int)Math.rint(2.5); //最接近的整數值，但小數點是5時，回傳最接近的偶數值
		int f2 =(int)Math.rint(3.5);
		System.out.println(f1);
		System.out.println(f2);
		
		int g1 =(int)Math.ceil(2.5);
		int g2 =(int)Math.floor(2.5);
		System.out.println(g1);
		System.out.println(g2);
		
		int h1 = (int)Math.sqrt(4);
		int h2 = (int)Math.cbrt(27);
		System.out.println(h1);
		System.out.println(h2);
		
		int i = (int) Math.pow(10, 2);
		System.out.println(i);
	}
	
	@Test
	
	public void stringTest() {
		//長度
		String str = "123456";
		int a =str.length();
		System.out.println(a);
		
		//判斷內容有無意義
		String str1 ="";    //空字串 empty String，什麼都沒有
		String str2 =" ";   //空白字串，有空白格但沒有有意義的文字
		boolean b1 =str1.isEmpty();
		boolean b2 =str2.isEmpty();
		System.out.printf("字串長度為%d,isEmpty的結果為%b\n",str1.length(),b1);
		System.out.printf("字串長度為%d,isEmpty的結果為%b\n",str2.length(),b2);
		 
		boolean b3 =str1.isBlank();
		boolean b4 =str2.isBlank();
		System.out.printf("字串長度為%d,isBlank的結果為%b\n",str1.length(),b3);
		System.out.printf("字串長度為%d,isBlank的結果為%b\n",str2.length(),b4);
		
		String str4 = new String(); //預設空字串，有佔記憶體位置
		String str5 = null;			//沒佔記憶體位置
		System.out.println(str4);
//		System.out.println(str5);	//會報錯
		if(str5 != null) {
			boolean b21 =str5.isEmpty();
			System.out.println(b21);
		}		
		
		boolean b5 =StringUtils.hasLength(str1);
		boolean b6 =StringUtils.hasLength(str2);
		boolean b7 =StringUtils.hasLength(str5);
		System.out.printf("字串長度為%d,hasLength的結果為%b\n",str1.length(),b5);
		System.out.printf("字串長度為%d,hasLegnth的結果為%b\n",str2.length(),b6);
		System.out.printf("字串長度為%d,hasLegnth的結果為%b\n",0,b7);
		
		boolean b8 =StringUtils.hasText(str1);
		boolean b9 =StringUtils.hasText(str2);
		boolean b10 =StringUtils.hasText(str5);
		System.out.printf("字串長度為%d,hasText的結果為%b\n",str1.length(),b8);
		System.out.printf("字串長度為%d,hasText的結果為%b\n",str2.length(),b9);
		System.out.printf("字串長度為%d,hasText的結果為%b\n",0,b10);
		
		//搜尋
		String s1 = "小龍女與楊過與楊與楊";
		System.out.println(s1.contains("不"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf("楊"));
		System.out.println(s1.indexOf("不")); //如果找不到搜尋內容，會回傳-1
		System.out.println(s1.lastIndexOf("楊")); //若有兩個相同字，找index只會回傳一個，故從左或右的值會不同
		System.out.println(s1.indexOf("楊",4)); //從索引值4開始找，故會找到索引值為4的楊
		System.out.println(s1.indexOf("楊",5)); //從索引值5開始找，故會找到索引值為7的楊
		System.out.println(s1.lastIndexOf("楊",9)); 
		System.out.println(s1.lastIndexOf("楊",8)); 
		
		//裁剪，使用String方法絕大部分不會改變原有字串，若想改變源字串要新增變數
		System.out.println(s1.substring(7));    //index>=7
		System.out.println(s1.substring(7,9));  //9>index>=7,故只會有7跟8
		String s2 = " 小龍女與楊過 與楊與楊 ";
		System.out.println(s2.trim());			//去除頭尾的空白格，但無法去除中間空白格
		System.out.println(s2.replace("與","&"));
		System.out.println(s2.replace(" ","")); //replace可以將用trim取代不掉的中間的空白格替換成空字串
		
		String s3 = "小龍女與楊";
		String s4 = "過";
		System.out.println(s3.concat(s4)); //System.out.println(s3 + s4);
		
		//轉換資料型態
		String[] ar1 = s1.split("與");				//遇到"與"就刪除並切割	
		String[] ar2 = s1.split("");            	//用空字串切割可以將每個字都分開
		System.out.println(Arrays.toString(ar1));
		System.out.println(Arrays.toString(ar2));
		System.out.println(String.join("+",ar1));
		System.out.println(String.join("",ar2));  	//用空字串連接，可將陣列內所有索引值的內容變成一個字串
		System.out.println(s1.toCharArray());		//char array是陣列中的特例，不會印出記憶體位置，而可以直接印出內容值，但不會用逗號分隔
		System.out.println(Arrays.toString(s1.toCharArray()));
		
		char[] ch = new char[2];
		s1.getChars(7,9,ch,0);
		System.out.println(ch);
		
		String q1 = String.valueOf(1); //將非字串的基本資料型態轉成字串
		String q2 = String.valueOf(0.0);
		String q3 = String.valueOf(true);
		q1 = 1 + "";
		
		Integer z1 =Integer.valueOf("1");
		int z2 = Integer.parseInt("1");
		
		//比較內容值
		String st1 = "a";				 //st1和st2其實是同一個記憶體位置的"a"，因為用=創建字串，其實會先到字串池找尋有沒有同內容，因為字串是方法(半個基本資料型態)
		String st2 = "a";				 //如果有寫 new就會新增一個記憶體位置	
		String st3 = new String("a");    //寫這個new就代表會字串st3會占用一個記憶體位置，另外還存入方法
		String stn = null ;				 //有占用記憶體空間，但沒有值也沒有存入方法
		String st4 = "A";
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st1.equalsIgnoreCase(st4)); //忽略大小寫	
	}
	
	//算出輸入一串只有ABCD的字串裡面共有幾個ABCD
	@Test
	public void abcdStringTest() {
		String abcd = "ABBCCCDDD";
		String[] str = abcd.split("");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
	
		for(int k = 0; k < str.length; k++){
			if(str[k].equals("A")) {
				a += 1;
			}
			if(str[k].equals("B")) {
				b += 1;
			}
			if(str[k].equals("C")) {
				c += 1;
			}
			if(str[k].equals("D")) {
				d += 1;
			}
		}
		System.out.printf("%d個A %d個B %d個C %d個D",a,b,c,d);		
	}
	
	@Test //indexOf寫法
	public void m2Test() {
		String abcd = "ABBCCCDDD";
		
		int a = 0;
		int i = 0;
		while(abcd.indexOf("A") != -1) {
			a ++ ;
			i = abcd.indexOf("A",-1) + 1;
		}
	}
	
}