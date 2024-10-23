package com.example.demo11;

public class Employee {

	private String id;

	private String name;

	private int age;

	private String gender;

	// 把自己定義的整個 HomeTown類別 當成 Employee 的屬性之一，因為每一個類別其實都可以是一種資料型態(如:String、Integer等)
	private HomeTown hometown;

	public Employee() {
		super();
	}

	public Employee(String id, String name, int age, String gender, HomeTown hometown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hometown = hometown;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public HomeTown getHometown() {
		return hometown;
	}

}
