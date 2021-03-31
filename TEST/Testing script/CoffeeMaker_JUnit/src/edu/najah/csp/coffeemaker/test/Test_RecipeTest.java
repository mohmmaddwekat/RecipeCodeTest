package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class Test_RecipeTest {

	@Test
	public void testToString() {
		String expected="name: price:0.0 amtCoffee:0 amtMilk:0 amtSugar:0 amtChocolate:0";
		String actual ="";
		Recipe objRecipe = new Recipe();
		actual=objRecipe.toString();
		assertTrue(expected.equals(actual));
	}

	@Test
	public void testEqualsObject() { 
		boolean expected=true;
		Recipe objtest=new Recipe();
		boolean actual =false;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.equals(objtest);

		assertTrue(expected==actual);
	}
	
	@Test
	public void testEqualsObjectNull() {
		boolean expected=false;
		Recipe objtest=null;
		boolean actual =false;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.equals(objtest);
		assertTrue(expected==actual);
	}
	
	@Test
	public void testEqualsObjectName() {
		boolean expected=true;
		Recipe objtest= new Recipe();
		objtest.setName("cake");
		boolean actual =false;
		Recipe objRecipe = new Recipe();
		objRecipe.setName("cake");
		actual=objRecipe.equals(objtest);

		assertTrue(expected==actual);
	}
	
	@Test
	public void testEqualsObjectNameNull() {
		boolean expected=false;
		Recipe objtest= new Recipe();
		objtest.setName("");
		boolean actual =false;
		Recipe objRecipe = new Recipe();
		objRecipe.setName("cake");
		actual=objRecipe.equals(objtest);

		assertTrue(expected==actual);
	}

}
