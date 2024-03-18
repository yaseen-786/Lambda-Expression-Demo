package com.lambda.demo;
/* 18-Mar-24
 * In this we are going  to  see how to  work
 * lambda  expression   it  was  introduced in 
 * java 8 feature the  simple  explanation of 
 *  it is whenever there is a  functional 
 *  Interface  we can implement  it  directly using
 *  lambda expression
 *     
 * */
public class lamdaIntro {
	
	public static void main(String[] args) {
		
		LambdaDemo d = (n)->{System.out.println("the number is "+n);
									return n*2;};
		System.out.println(d.numberOperation(5));
	}
	

}
