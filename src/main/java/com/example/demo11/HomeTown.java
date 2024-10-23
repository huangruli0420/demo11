package com.example.demo11;

//與Employee，Employee2是一組的練習
public class HomeTown {
	
	// 屬性
	private String city;

	private String state;

	private String country;
	
	//兩種建構方法
	public HomeTown() {
		super();
	}
	
	public HomeTown(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	// 一般方法:屬性的 get 方法
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

}