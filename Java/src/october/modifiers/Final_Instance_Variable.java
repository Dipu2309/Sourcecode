/*
  If the value of a variable is varied from object to object such type of variables are
  called instance variables.
  
  If the instance variable declared as the final compulsory we should perform
  initialization explicitly and JVM won't provide any default values.
  whether we are using or not otherwise we will get compile time error.
 */
package com.modifiers;

public class Final_Instance_Variable {
	final int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Instance_Variable obj=new Final_Instance_Variable();
		System.out.println(obj.i);
	}

}
