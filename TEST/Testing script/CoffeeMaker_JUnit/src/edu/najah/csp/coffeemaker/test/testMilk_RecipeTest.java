package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class testMilk_RecipeTest {

	@Test
	public void testGetAmtMilk() {
		int expected=0;
		int actual =0;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getAmtMilk();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetAmtMilk() {
		int expected=4;
		int actual =0;
		String setMilk="4";
		Recipe objRecipe = new Recipe();
		try {
			objRecipe.setAmtMilk(setMilk);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RecipeException e) {
			e.printStackTrace();
		}
		actual=objRecipe.getAmtMilk();
		assertTrue(expected==actual);
	}
	

}
