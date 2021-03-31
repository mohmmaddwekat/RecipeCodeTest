package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class TestPrice_RecipeTest {

	@Test
	public void testGetPrice() {
		double expected=0;
		double actual =0;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getPrice();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetPrice() {
		double expected=4;
		double actual =0;
		String setprice="4";
		Recipe objRecipe = new Recipe();
		try {
			objRecipe.setPrice(setprice);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RecipeException e) {
			e.printStackTrace();
		}
		actual=objRecipe.getPrice();
		assertTrue(expected==actual);
	}

}
