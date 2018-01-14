package com.zhy;

public class TestStatic {
	
	
	private static Integer sex=1;
	private static Integer sex1;
	private static int age1 ;
	private static int age =10;
	private static String name1;
	private static String name ="qq";
	
	private String address;
	static{
		name= "123";
	}
	
	public static void main(String[] args) {
//		int age = TestStatic.age;
//		System.out.println(getName());
		TestStatic test = new TestStatic();
		test.getAddress();
	}
	
	public static String getName(){
		return "xxx";
	}
	
	public String getAddress(){
		return this.address;
	}

}
