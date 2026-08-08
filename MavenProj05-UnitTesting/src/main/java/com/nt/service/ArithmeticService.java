package com.nt.service;

public class ArithmeticService {

	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String args[]) {
		System.out.println("ArithmeticService.main()");
		ArithmeticService ar=new ArithmeticService();
		System.out.println("Result is::"+ar.sum(10, 20));
		
	}
}
