package com.example.demo11;

public class Bank {

	//每個屬性都可以賦予新的預設值，而不是程式本身的預設值
	private String branch = "TTA 分行";					//屬性:分行名稱，屬性前面加上private就代表只屬於Bank這個class
	
	private static String user ;					//屬性:用戶名稱
	
	public static int a = 8;

	private int balance ;					//屬性:存款餘額
	
	public final static int aaa = 500;     //加上final代表這是個常數，一定要有初始值且無法被重新更改
	
	public static int k() {
		return a;
	}
	
	//預設建構方法，格式:方法存取權限 類別名稱(){}		跟一般方法不同無法自定義名稱
	//                     public      Bank(){}
	//預設建構方法 --> 就是沒有參數的建構方法，也完全沒有回傳值資料型態，甚至不能寫void
	//當類別中沒有帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也能使用
	//當類別中  有帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	//為了銜接資料庫，兩個都寫(多重建構overload)就100%不會出錯，沒寫沒參數的建構方法就會出錯
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//帶有參數的建構方法，實作內容等同於setXXX 方法，實際作用為減少程式碼行數，有用到再寫但要記得產生沒參數的建構方法
	//當類別的屬性名稱與參數的名稱相同事就可以加上this.來做區別
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}



	//建立屬性的存(get)取(set)方法，才能在這個類別之外存取這些私有屬性
	//一般方法
	//格式: 方法存取權限 方法回傳資料型態 方法名稱(參數資料型態 參數變數名稱){方法實作內容}
	//			public		String		getBranch()  {}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	//方法:存款
	public void saving(int amount) {	
		System.out.println("存款前餘額:" + balance);
		
		//判斷 amount 是否為正數
		if(amount >= 0) {
			//原本的金額+存款金額
			balance += amount;
		} 
		else {
			System.out.println("存款金額不得為負數");
		}
		
		System.out.println("存款後餘額:" + balance);
	}
	
	
//	//方法:提款
//	public void withdraw(int amount) {		
//		System.out.println("提款前餘額:" + balance);
//		
//		if(amount >=0 && amount <= balance) {
//			balance -= amount;
//			System.out.println("提款後餘額:" + balance );
//		}else {
//			System.out.println("提款金額不得大於餘額或為負數");
//		}	
//	}

	//方法:提款
	public void withdraw(int amount) {		
		
		//排除餘額不足
		if(amount > balance) {
			System.out.println("餘額不足" );
			return;										//若只用if和else，或只用if，不寫return就會一直判斷下去，
		}												//會印出後面else或方法內剩下的內容
		//排除金額是負數
		if(amount < 0) {
			System.out.println("提款金額不得為負數" );
			return;
		}
		System.out.println("提款前餘額:" + balance);
		balance -= amount;
		System.out.println("提款後餘額:" + balance);	
	}
	
//	//方法:提款 最基本的寫法，用if、else if、else就會只帶入一個的結果
//		public void withdraw(int amount) {		
//		
//			//排除餘額不足
//			if(amount > balance) {
//				System.out.println("餘額不足" );
//				return;										
//			}
//			//排除金額是負數
//			else if(amount < 0) {
//				System.out.println("提款金額不得為負數" );
//				return;
//			}else {
//				System.out.println("提款前餘額:" + balance);
//				balance -= amount;
//				System.out.println("提款後餘額:" + balance);	
//			}
//		}	
	
	//兩種寫法其實都可，同樣方法名稱但參數個數或資料型態不同稱為多重定義或多載(overload)，主要是用在建構方法
	public void withdraw(Bank bank) {
		System.out.println(bank.getBranch());
		System.out.println(bank.getUser());
		System.out.println(bank.getBalance());
	}
	public void withdraw(String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}
	
	//回傳資料型態如果是類別，而非8種資料型態或字串，就要加上new，字串較特殊，可以直接賦值或回傳值
	public String withdraw(String Branch) {
		return "";
	} 
	public int withdraw1(String Branch) {
		return 0;
	}
	public Bank withdraw2(String Branch) {
		return new Bank();
	}
	
	//可變參數，呼叫時帶入的參數也要照著矩陣內順序，較不靈活
	public void withdraw4(int balance,String ...params) {
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}
	
	//靜態方法
	public void withdraw3(String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}
	public static void withdraw31(String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
	}
}