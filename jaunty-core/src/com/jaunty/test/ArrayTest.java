package com.jaunty.test;

public class ArrayTest {

	public static void main(String[] args) {
		
		//第一个Java程序：Hello World；
		System.out.println("Hello World!");
		
		//1、静态初始化：数组的定义和初始化放在一起；
		int[] a = new int[]{1, 2, 3};
		
		//2、动态初始化：数组的定义和初始化是分开的；
		int[] b = new int[3];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		
		//3、数组的遍历；
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
