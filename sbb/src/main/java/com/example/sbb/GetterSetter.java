package com.example.sbb;

public class GetterSetter {
	
	private String hello;
	private int lombok;
	
	public static void main(String[] args) {
        GetterSetter helloLombok = new GetterSetter();
        helloLombok.setHello("헬로");
        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public int getLombok() {
		return lombok;
	}

	public void setLombok(int lombok) {
		this.lombok = lombok;
	}

}
