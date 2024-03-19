package com.lambda.demo;
interface Stringfunct{
	String func(String n);
}
class StringOperations{
	
	 String strReverese(String m) {
		 String S = "";
		for(int i=m.length()-1;i>=0;i--) {
			S += m.charAt(i);
		}
		return S;
	}
	 
	 String subString(String j) {
		 return j.substring(0, j.length()-3);
	 }
}
public class InstanceMethodRefrenceDemo {
	public static  String stringOp(Stringfunc sp,String inpstr) {
		return sp.func(inpstr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imp ;
		imp = " Instance Method refrence in java ";
		StringOperations strop = new StringOperations();
		String outst = stringOp(strop::strReverese, imp);
		
		String substr = stringOp(strop::subString, imp);
		System.out.println("Input String :-"+imp);
		System.out.println("Output String:-"+ outst);
		System.out.println("Substring:-"+substr);
	}
}
