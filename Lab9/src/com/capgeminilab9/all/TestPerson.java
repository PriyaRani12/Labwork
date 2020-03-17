package com.capgeminilab9.all;



import org.junit.Test;

public class TestPerson {

	@Test
	public void  testGetFullName()  {
		System.out.println("from TestPerson");   
		Person per = new Person("Robert","King");   
		assertEquals("Robert King",per.getFullName()); 
		}   
	@Test (expected=IllegalArgumentException.class) 
	public void testNullsInName() {   
		System.out.println("from TestPerson testing exceptions");  
		Person per1 = new Person(null,null);    
		} 
	}


