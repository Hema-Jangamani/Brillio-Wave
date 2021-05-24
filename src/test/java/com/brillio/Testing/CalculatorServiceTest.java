package com.brillio.Testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CalculatorServiceTest {
	

	@BeforeClass  //@BeforeAll --JUnit5
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass   //@AfterAll --JUnit5
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		
		//create the mock object
		CalculatorService dummyObj=Mockito.mock(CalculatorService.class);
	
	    //Add the behaviour of the method
		//When the x method is called then return y
		Mockito.when(dummyObj.addition(10, 10)).thenReturn(100);
		assertEquals(100, dummyObj.addition(10, 10));
		assertEquals(100, dummyObj.addition(10, 10));
		Mockito.verify(dummyObj,times(2)).addition(10, 10);
	
	}
	
	@Test
	public void testSample() {
		
		//create the mock object
		ArrayList list=Mockito.mock(ArrayList.class);
	
	    //Add the behaviour of the method
		//When the x method is called then return y
		Mockito.when(list.size()).thenReturn(5);
		assertEquals(5, list.size());
		
		list.add("1");
		list.add("2");
		list.add("1");
		
		//verify the behaviour
		Mockito.verify(list,times(2)).add("1");
		Mockito.verify(list,times(1)).add("2");
	
	}

}
