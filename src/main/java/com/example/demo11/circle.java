package com.example.demo11;

public class circle extends Shape {

	@Override
	public void draw() {
		System.out.println("畫圈圈");
	}

	//被繼承的 Shape 類別中，因為有定義抽象方法 draw1() ，所以這個方法必須要被重新定義
	@Override
	public void draw1() {
		System.out.println("畫圈圈，一圈又一圈");
	}


}
