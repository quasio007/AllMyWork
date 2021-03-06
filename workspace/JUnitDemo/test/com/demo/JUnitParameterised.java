package com.demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitParameterised {
Sum s=new Sum();
private int output,input1,input2,input3;


public JUnitParameterised(int output, int input1, int input2, int input3) {
//	super();
	this.output = output;
	this.input1 = input1;
	this.input2 = input2;
	this.input3 = input3;
}

@Parameters
public static Collection<Integer[]> param(){
	Integer[][] par ={{3,2,1,1},{-1,3,-4,4},{5,3,2,2}};
	return  Arrays.asList(par);
}
//Or we can use :
//public static Integer[][] param(){
//	 Integer[][] par ={{3,2,1,2},{-1,3,4,3},{5,3,2,4}};
//	 return par;

	@Test
	public void test1() {
		assertEquals(output, s.sum(input1, input2));
	}
	@Test
	public void test2() {
		assertEquals(output, s.sum(input1, input3));
	}

}
