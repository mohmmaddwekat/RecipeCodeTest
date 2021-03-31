package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class testSugar_RecipeTest {

	@Test
	public void testGetAmtSugar() {
		int expected=0;
		int actual =0;
		Recipe objRecipe = new Recipe();
		actual=objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetAmtSugar() {
		int expected=5;
		int actual =0;
		String setsugar="5";
		Recipe objRecipe = new Recipe();
		try {
			objRecipe.setAmtSugar(setsugar);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(RecipeException e) {
			e.printStackTrace();
		}
		actual=objRecipe.getAmtSugar();
		assertTrue(expected==actual);
	}

}
