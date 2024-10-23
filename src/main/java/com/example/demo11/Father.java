package com.example.demo11;

//與Son Daughter是一組的練習
public class Father {

	protected String name;
	
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Father(String name) {
		super();
		this.name = name;
	}

	public void walk() {
		System.out.println(name + " is walking!");
	}	
}