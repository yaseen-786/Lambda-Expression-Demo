
package com.lambda.demo;

interface LambdaException{
	void func(int a[]) throws NegativeElementException;
	
}
class NegativeElementException extends Exception{
	NegativeElementException(){
		super("Elements entered in array is negative");
	}
	
}

public class LambdaAndException {
	
	public static void main(String[] args) throws NegativeElementException {
		int []a = {10,20,-30,40,50};
		LambdaException l = (n)->{
			int length = n.length;
			for(int i=0;i<length;i++) {
				if(n[i]>0) System.out.println("Elements in array"+n[i]);
				else throw new NegativeElementException();
				
			}
			
		};
		l.func(a);
		
	}

}
