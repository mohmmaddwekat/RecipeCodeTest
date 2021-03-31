package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class TestCoffee_RecipeTest {

	@Test
	public void testGetAmtCoffee() {
		int expected=0;
		int actual =0;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetAmtCoffee() {
		int expected=4;
		int actual =0;
		String setCoffee="4";
		Recipe objRecipe = new Recipe();
		try {
			objRecipe.setAmtCoffee(setCoffee);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RecipeException e) {
			e.printStackTrace();
		}
		actual=objRecipe.getAmtCoffee();
		assertTrue(expected==actual);
	}

}
