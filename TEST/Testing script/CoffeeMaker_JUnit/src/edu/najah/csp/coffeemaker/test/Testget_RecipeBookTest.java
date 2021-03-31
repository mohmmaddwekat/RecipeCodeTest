package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class Testget_RecipeBookTest {

	@Test
	public void testGetRecipes() {
		int expected=4;
		int actual =0;
		Recipe recipeArray[];
		RecipeBook objRecipeBook = new RecipeBook();
		recipeArray=objRecipeBook.getRecipes();
		actual=recipeArray.length;
		assertTrue(expected==actual);
	}
}
