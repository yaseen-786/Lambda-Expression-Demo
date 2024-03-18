package com.lambda.demo;
/*
 * In this demo we created generic functional interface 
 * in which we can pass any type
 * 
 * 
 * */
public class LambdaGenericDemo {
 
	public  static  void  main(String[] args) {
		
		
		GenericLambda<String> b = (n)->{System.out.println(n.getClass().getName());
		return n;};
		
		
		GenericLambda<Integer> c = (d)->{
			System.out.println(d.getClass().getName());
			return d%2;};
		System.out.println(b.genricFunc("Generic demo done sucessfully"));
		System.out.println(c.genricFunc(500));
		
	}
}
