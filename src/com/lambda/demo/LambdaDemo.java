package com.lambda.demo;
/* A functional Interface is a interface which
 * has only one method A functional interface may 
 * specify any public method defined by Object, such as equals( ), 
without affecting its “functional interface” status. 
The public Object methods are considered implicit 
members of a functional interface because they are 
automatically implemented by an instance of a 
functional interface
 * */
@FunctionalInterface
public interface LambdaDemo {
	int numberOperation(int n);
	public boolean equals(Object o);
}
