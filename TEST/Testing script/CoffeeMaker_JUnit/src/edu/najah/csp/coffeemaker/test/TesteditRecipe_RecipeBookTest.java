package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class TesteditRecipe_RecipeBookTest {

	@Test
	public void testEditRecipe() {
		String actual =null;	
		Recipe recipe= new Recipe();
		recipe.setName("mohmmed");
		String expected=recipe.getName();
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(recipe);
		actual=objRecipeBook.deleteRecipe(0);
		assertTrue(expected==actual);
	}

	@Test
	public void testEditRecipenull() {
		String actual =null;
		String expected=null;
		Recipe recipe= new Recipe();
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(recipe);
		actual=objRecipeBook.deleteRecipe(1);
		assertTrue(expected==actual);
	}
}
