package com.example.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

public class CollectionTest20241016 {

	@Test
	public void listTest() {
		String str = new String();
		Bank bank = new Bank();
		// List 是介面 (interface)，只是用來定義方法而已，並無任何實作內容，所以無法使用new建立實例
		// ArrayList 是用來實現定義在 List 中方法的實作類別 (class)
		List<Bank> bankList = new ArrayList<>(); // 後面的角括號可寫類別可不寫
		// List的角括號中的資料型態，不能放8種基本資料型態，意思就是只能放類別(class)
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(1);
		intList.add(3);
		intList.add(2, 5); // 在index為2的位置新增5，後面遞延
		for (Integer item : intList) {
			System.out.println(item);
		}
		System.out.println("//=======================");
		intList.remove(2); // 移除在index為2的資料
		for (Integer i : intList) {
			System.out.println(i);
		}
	}

	@Test
	public void listTest1() {
//		ArrayList<String> list = new ArrayList<>();  
//		不這樣寫是因為List可以轉換成ArrayList和LinkedList，較靈活
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("C");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("A");
		strList.add("C");
		System.out.println(strList.get(0));
		System.out.println(strList.get(strList.size() - 1));

		for (int i = strList.size() - 1; i >= 0; i--) { //
			if (strList.get(i).equals("B")) {
				strList.remove(i);
			}
		}

//		for(String i : strList) {
//			if(strList.get(i) .equals("B")) {
//				strList.remove(i);
//			System.out.println(strList);
//			}
//		}
	}
	
// ctrl+shft+f:自動排版，ctrl+shift+o:自動import
// 按左方ProjectExplorer視窗的LinlWithEditor可快速找到正在使用的檔案

	
	@Test	
	public void hashSetTest1() {
		// HashSet
		//1.相同元素只會保留一個(不允許重複的元素)
		//2.無序(不會依照新增元素的順序來排列)，以上兩點跟List差別最大
		Set<String> strSet = new HashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");
		
		for(String item : strSet) {
			System.out.println(item);
		}
	}
	
	@Test	
	public void linkedHashSetTest1() {
		// LinkedHashSet
		//1.相同元素只會保留一個(不允許重複的元素)
		//2.有序(會依照新增元素的順序來排列)，跟HashSet的差別在這
		Set<String> strSet = new LinkedHashSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");
		
		for(String item : strSet) {
			System.out.println(item);
		}
	}
	

	@Test	
	public void treeSetTest1() {
		// LinkedHashSet
		//1.相同元素只會保留一個(不允許重複的元素)
		//2.由小到大(字元依照ASCII code去排序)
		Set<String> strSet = new TreeSet<>();
		strSet.add("A");
		strSet.add("C");
		strSet.add("A");
		strSet.add("B");
		strSet.add("F");
		strSet.add("D");
		strSet.add("E");
		strSet.add("B");
		
		for(String item : strSet) {
			System.out.println(item);
		}
	}
	
	@Test
	public void setPracticeTest(){
		//前面需要是TreeSet才能使用.first()和.last()方法
		TreeSet<Integer> intSet = new TreeSet<>();	
		
//		//若使用一般for迴圈，當隨機數字與上一次相同時，插入不會成功但依然會迭代運算，造成最後少一個元素
//		//所以for迴圈可以不用初始值也不用迭代
//		for(;intSet.size()<5;) {
//			intSet.add((int)(Math.random()*(10-1+1)+1));
//		}
		
//		//使用while迴圈的兩種寫法
		//1.Math.random()
//		while(intSet.size() < 5) {
//			intSet.add((int)(Math.random()*(10-1+1)+1));   //(Math.random()*(上限-下限+1)+下限)
//		}
		
		//2.import java.util.Random
		Random ran = new Random();
		while(intSet.size() < 5) {
//			int number = (ran.nextInt(10)+1);
//			intSet.add(number); 	
//			上述兩行可以簡化成下面一行
			intSet.add(ran.nextInt(10)+1); 
			//產生1~10的亂數，因為只用一次所以可以匿名(不用變數去接)  
			//java17後的版本可以用intSet.add(ran.nextInt(1,11); ，來產生大於1小於11的隨機整數
		}
		
		System.out.println("min" + intSet.first()); 
		System.out.println("max" + intSet.last());				
		System.out.println("從小到大" + intSet);
		System.out.println("從大到小" + intSet.descendingSet()); //用這方法會轉成NavigableSet
		//若最一開始不用TreeSet去接而是Set則這裡要轉型(Cast)
		//因為.first()和.last()方法是寫在TreeSet裡
		//例如:System.out.println(((TreeSet<Integer>) intSet).first()); 
		
		//轉型:將值的資料型態轉換成另一種資料型態
		//1. 被轉型的資料型態一定要有小括號(TreeSet<Integer>)intSet
		//2. 使用小括號將要轉換到的資料型態和值框在一起，這樣後面才能接轉換後資料型態的方法 
		//3. 慎用，能不轉型就不轉型
		
		//轉換成List
		List<Integer> list = new ArrayList<>(intSet);
		System.out.println("min" + list.get(0));
		System.out.println("max" + list.get(list.size()-1));
		//由小到大，因為TreeSet已排序好，所以直接列印就可以了
		System.out.println("從小到大" + list);
		//由大到小，用Collections的.reverse方法去反轉排序，若是String可以轉成StringBuffer然後用.reverse()
		Collections.reverse(list);
		System.out.println("從大到小" + list);
	}
	
	@Test
	public void mapTest1() {
		//Map<Key的資料型態，Value的資料型態>
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		//使用 get(key值) 透過 key 將對應的 value 取出
		String str = map.get(2);
		System.out.println(str);
		//遍歷:使用 foreach 將 map 中的 key-Value 取出
		//將 map 轉成 entryset，item就是包含了 key 和 value，可以使用 getKey 和 getValue 取值
		for(Entry<Integer, String> item: map.entrySet() ) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		System.out.println("======");
		//將 map 轉成 keySet，每個item就表示一個key，透過.get(item)將對應的value取出
		for(Integer item : map.keySet()) {
			System.out.println("Key: " + item);
			System.out.println("Value: " + map.get(item));
		}
		System.out.println("======");
		// 原本 map中，已存在 key = 1以及對應的 value = A;
		// 現在在相同1的位置放入 D，key=1的value就會變成D(相同key，對應的value會後蓋前)，這是最重要的
		map.put(1,"D");
		// 不同的key值可以有相同或不同的對應value值
		map.put(4, "D");
		for(Integer item : map.keySet()) {
			System.out.println("Key: " + item);
			System.out.println("Value: " + map.get(item));
		}
	}
	
	@Test
	public void mapTest2() {
		// key-value 是1對1
		Map<Integer, String> map1 = new HashMap <>();
		// key-value 是1對多
		Map<Integer, String[]> map2 = new HashMap <>();
		Map<Integer, List<String>> map3 = new HashMap <>();
		Map<Integer, Set<String>> map4 = new HashMap <>();
		Map<Integer, Map<String,String>> map5 = new HashMap <>();
	}
	
	@Test
	public void listSetMapEmptyTest1 () {
		// isEmpty() 代表詢問集合(Collection)或是Map其size是否為0;
		List <String> list = new ArrayList<>();
		System.out.println(list.isEmpty());
		
		Set <String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		
		Map <Integer,String> map = new HashMap<>();
		System.out.println(map.isEmpty());
		//==============================================================
		System.out.println("=================");
		List <String> list2 = null;
		//list2沒有創建一個new的記憶體位置，為null，無法用null來呼叫方法，會報錯
		//下行程式碼會報 NullPointerException (空指針錯誤)
//		System.out.println(list2.isEmpty());
		
	}
	
	@Test
	public void mapHomeworkTest() {
		
		int[] nums= {1,5,9,7,3};
		int value = 10;
		
		Map <Integer,Integer> intMap = new TreeMap<>();	
		
		//key是實際的數組，value是index
		for(int i=0 ; i<nums.length ; i++) {
			intMap.put(nums[i],i);
		}
		System.out.println(intMap);

		
		for(Entry<Integer, Integer> item: intMap.entrySet()) {
			// 跳過自己加自己=value
			if(item.getKey()*2 == value) {
				continue;
			}
			
			if(intMap.containsKey(value-item.getKey())) {
				//排除重複的index，最終結果只會出現(小,大)
				if(item.getKey() < value-item.getKey() ) {
					continue;
				}
				
				System.out.println(item.getValue()+ "," + intMap.get(value-item.getKey()));
			}
		}
	}
		
		
		
}