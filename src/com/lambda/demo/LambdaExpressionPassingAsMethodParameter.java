package com.lambda.demo;

public class LambdaExpressionPassingAsMethodParameter {
	
	public static void main(String[] args) {
		
		String i = getdemo(( n)->{
			String reverse = "";
			for(int j = n.length()-1;j>0;j--) {
//				System.out.println(n.charAt(j)+j);
				
				reverse += n.charAt(j)	;		}
			return reverse;
		},"this is a string manipulation example");
		
		System.out.println(i);
		
	}
	
	 private static String getdemo(MethodParameter m, String n) {
		// TODO Auto-generated method stub
		return  m.func(n);
	}

	 

}
