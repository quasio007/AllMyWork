package com.demo;

import static org.junit.Assert.*;

import java.util.Arrays;


import org.junit.After;

import org.junit.Before;
import org.junit.Test;

public class JunitTry {
Sum s;
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		System.out.println("Before Class");
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		System.out.println("After Class");
//	}

	@Before
	public void setUp() throws Exception {
		s=new Sum();
	
//		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		s=null;
//		System.out.println("After");
	}

	@Test
	public void test0() {
		assertEquals("Print this line",5,s.sum(2, 3));
//		System.out.println(assertThat(12,Is<12>));
		int[] a ={6,2,7,4,9,6};
		Arrays.sort(a);
		int[] b ={2,4,6,6,7,9};
		
		assertArrayEquals(b, a);
		assertFalse("Check", 2>3);
		System.out.println(2);
		System.out.println(true);
//		System.out.println("In test2");
	}

	@Test
	public void test1() {
//		System.out.println("In test2");
	}

}
