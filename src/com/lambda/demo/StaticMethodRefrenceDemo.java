package com.lambda.demo;

interface Stringfunc{
	String func(String n);
}
class StringOperation{
	
	protected static String strReverese(String m) {
		 String S = "";
		for(int i=m.length()-1;i>=0;i--) {
			S += m.charAt(i);
		}
		return S;
	}
}
public class StaticMethodRefrenceDemo {
	
	
	public static  String stringOp(Stringfunc sp,String inpstr) {
		return sp.func(inpstr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imp ;
		imp = " Static Method refrence in java ";
		String outst = stringOp(StringOperation::strReverese, imp);
		System.out.println("Input String :-"+imp);
		System.out.println("Output String:-"+ outst);
	}

}
