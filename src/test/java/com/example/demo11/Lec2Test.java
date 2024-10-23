package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec2Test {

	private Object chickenRabbit;

	@Test
	void reviewLec1(){
		
		int a;
		
		String b ="1111";
		
		//單行註解
		/*多行註解，用斜線星號和星號斜線
		 * 可以寫比較多行的筆記
		 * 滑鼠移到下面的CommentTest就可看到下面註解的內容
		 */
		this.fileCommentTest(0);
	}
	
	/**
	 * @parum test 書本的ISBN編號
	 * @return 書本名稱
	 */
	
	public String fileCommentTest(int Test) {
		return null;
	}
	
	@Test
	public void computeTest() {
		int a = 10;
		System.out.println(a);
		System.out.println(a++ * 10); //先算a*10，再算a=a+1
		//a++ 的寫法稱為後置運算 ，運算子在變數之後，表示先執行其他動作再進行運算
		System.out.println(a);
		System.out.println("*************");
		
		a = 10;
		System.out.println(a);
		System.out.println(++a * 10); //先算a=a+1，再算a*10
		//--a 的寫法稱為前置運算，運算子在變數之前，表示先運算再執行其他動作
		System.out.println(a);
		
	}
	
	@Test
	public void computeTest2(){
		
		int a = 1;
		int b = 5;
		
		System.out.println(a += 9);
		System.out.println(a -= 1); 
		System.out.println(a *= 5);
		System.out.println(a = b / 5);
		System.out.println(a %= b );
		System.out.println(a = b % a);
		
	}
	

	@Test
	public void logicTest() {
		
		boolean res1 = (1!=1);
		boolean res2 = (1==1);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res1 && res2);
		System.out.println(res1 || res2);
	}

	//從1加到100的兩種寫法
	@Test
	public void practice1() {
		int res3 = this.sum1(1 , 100);
		System.out.println(res3);
	}

	public int sum1(int start, int end) {
		int sum1 = ( (start + end)*(end-start+1) )/2;
		return sum1;
	}

	
	@Test
	public void practice2() {
		int res4 = this.sum2(1, 100, 1);
		System.out.println(res4);		
	}
	
	public int sum2(int start, int n, int diff) {
		int sum2 = (start*n) +((n*(n - 1)*diff )/2);
		return sum2;
	}
	//如果直接寫成return (start*n) +((n*(n - 1)*diff )/2); 也可以
	//此方法稱為匿名變輸數
	
	
	//練習從攝氏轉換到華式，以及轉換回來
	@Test
	public void practice3() {
		double res5 = this.ctof(25.0);
		System.out.println(res5);
	}
	public double ctof(double cel) {
		double ctof = (cel * (9/5)) + 32;
		return ctof; 
	}
	
	@Test
	public void practice4() {
		double res6 = this.ftoc(57);
		System.out.print(res6);
	}
		
	public double ftoc(double fah) {
		double ftoc = (fah - 32) / (9 / 5);
		return ftoc;
	}
	
	//for迴圈，用;隔開，最左邊代表變數i初始值=1，中間代表判斷為true迴圈就要繼續
	//最右邊代表每次執行變數i都要+1
	//for(初始值,判斷條件,迭代運算)
	@Test 
	public void forLoopTest1() {
		this.forLoop1();
	}
	
	public void forLoop1(){
		int sum = 0;
		
		for(int i =1; i <=100 ; i= i+ 1) {
			sum = sum + i;
			System.out.println(sum);
		}
	}
	
	
	@Test 
	public void forLoopTest2() {
		this.forLoop2(1,100,1);
	}
	
	public void forLoop2(int a, int b, int c){
		int sum = 0;
		
		for(int j = a; j <= b ; j=j + c) {
			sum = sum + j;
			System.out.print("sum的內容會是:"+ a + "~" + j +"的總和");
			System.out.println(sum);
			//System.out.println(sum);若將列印結果寫在for迴圈裡面
			//則執行幾次就會顯示幾次結果
		}
		System.out.println("總和為"+sum);
	}	
	
	
	@Test
	public void forNestLoop() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d*%d=%2d  ",j, i, i*j); //最前面i跟j互換也可
//				System.out.print(i + "*" + j + "=" + i*j +"  ");
//	%d為幫數字佔位1位，%2d為佔2位，%s為幫字串佔位		
			}
				System.out.printf("\n");
//           	System.out.println();跟上述寫法一樣
		}	
	}
	

//	public void forLoopTest1() {
//		this.forLoop1();
//	}
//	
//	public void forLoop1(){
//		int sum = 0;
//		
//		for(int i =1; i <=100 ; i+= 1) {
//			System.out.println(i);
//		}
//	}
	
	@Test
	public void whileLoopTest1() {
			this.whileLoop1();
	}
	
	public void whileLoop1() {
		int sum = 0;
		int i = 1; 
		while (i <= 100) {
			sum += i;
			i ++;
		}
		System.out.print(sum);	
	}
	
	@Test
	public void whileNestLoop(){
		this.whileLoop2();
	}	
	
	public void whileLoop2() {
		int i = 1;
		//int j=1;若放在這裡，則會J=10但不會重新宣告
		while(i <= 9){
			int j = 1;
			while(j <= 9) {
				System.out.printf("%d*%d=%2d  ",i ,j , i*j);	
				j++;
			}
			i ++;
			System.out.printf("\n");
		}		
	}
	
	@Test
	public void doWhileLoopTest() {
		this.whileLoop3();
		System.out.println("**********");
		this.doWhileLoop();
	} 
	
	public void whileLoop3() {
		boolean i = true;
		while(!i) {
			System.out.println("I'm in~");
		}		
	}
	
	public void doWhileLoop() {
		boolean i = true;
		do {
			System.out.println("I'm in~");		
		}while(!i);
	}
	//do while 迴圈會先執行再做判斷
	
	@Test
	public void dowhileLoopTest2() {
		this.doWhileLoop2();
		}
	
	public void doWhileLoop2() {
		int sum = 0;
		int a = 1;		
		do {
			sum += a;
			a += 1;
		}while(a <= 100);
		
		System.out.println(sum);
	}
	@Test
	public void infiniteLoop2(){
//		while (true) {
//			System.out.println("Hi");
//		}
		int i = -1;
		for(;;) {
			i++;
			if(i ==1) {
//				continue;
//				return;
				break;
			}
			if(i ==5) {
//				break;
				continue;
			}
			System.out.println(i);
			}
		System.out.println("Bye");
		}
	
	@Test
	public void nestedLoopBreakTest(){
		a: for(int k = 0; k < 10; k+=2) {
			System.out.println(k);
			for(int l =1; l < 10; l+=2) {
				System.out.println(l);
				//break; //預設會對最近的迴圈作用，故會跳出j的迴圈，所以每次印出來都會是1，不會迭代+2
				break a; //若要對外層迴圈作用，要在外層迴圈加上標籤，再註明標籤名稱，
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}
		
	@Test
	public void chickenRabbitTest() {
		this.chickenRabbit(35,130);
	}
	
	public void chickenRabbit(int head, int feet) {
		//判斷是否為偶數，能否被2整除，若不是偶數就不用浪費時間往下測了
		if(feet%2 == 1)
		{
			System.out.println("你輸入的不是偶數，不給測");
			return;
		}
		//假設兔子數目是0支
		int r = 0;
		//以下方法需重複執行，所以用while包起來
		while(true) {
			int c = head - r;				//利用兔子數目反推雞的數目
			if(r*4 + c*2 == feet) {			//case1:剛好符合
				System.out.printf("兔%d隻，雞%d隻\n",r,c); //因為只有唯一解，離開迴圈
//				break;
				return;						//因為離開迴圈沒有要做其他事，所以離開整個方法也行
			}
			r ++;							//case2:下一輪
			
			if(r > head) {					//一直加到兔的數量>全部頭的數量就為無解，跳出迴圈
				System.out.println("無解");
//				break;
				return;						//因為離開迴圈沒有要做其他事，所以離開整個方法也行
			}
		}
	}
	
	
	@Test
	public void chickenRabbitTest2() {
		this.chickenRabbit2(35,36);
	}
	
	public void chickenRabbit2(int head, int feet) {
		if(feet%2 == 1) {
			System.out.println("你輸入的不是整數");
			return;
		}
		for(int r = 0; r<=head; r++) {
			int c = head - r;
				if(r*4 + c*2 == feet) {
					System.out.printf("兔%d隻，雞%d隻\n",r,c);
					break;
				}else if(r == head){
					System.out.println("無解");
				}
		}
	}
	
	@Test
	public void chickenRabbitTest3() {
		this.chickenRabbit3(35,50);
	}
	public void chickenRabbit3(int head, int feet) {
		if(feet%2 == 1) {
			System.out.println("你輸入的不是整數");
			return;
		}
		for(int r = 0; r<=head; r++) { 
			int c = head - r;
				if(r*4 + c*2 == feet) {
					System.out.printf("兔%d隻，雞%d隻\n",r,c);
					return; //此時不能使用break,不然會繼續執行下面的印出無解
				}
		}
		System.out.println("無解");
	}
	
	
	
	

	
}

	











