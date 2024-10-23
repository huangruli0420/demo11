package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving(String name) {
		System.out.println(name + "正在下潛");
	}

	@Override
	public void move(String name) {
		System.out.println(name + "這艘潛水艇正在前進");
	}

}
