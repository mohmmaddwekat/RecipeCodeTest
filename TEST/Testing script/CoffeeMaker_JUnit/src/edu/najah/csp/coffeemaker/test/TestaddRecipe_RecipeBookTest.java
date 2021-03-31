package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class TestaddRecipe_RecipeBookTest {

	@Test
	public void testAddRecipeExisting() {
		boolean expected=true;
		boolean actual =false;	
		Recipe recipe= new Recipe();
		RecipeBook objRecipeBook = new RecipeBook();
		actual=objRecipeBook.addRecipe(recipe);
		assertTrue(expected==actual);
	}

	@Test
	public void testAddRecipeNotExisting() {
		boolean expected=false;
		boolean actual =false;		
		Recipe recipe= new Recipe();
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(recipe);
		actual=objRecipeBook.addRecipe(recipe);
		assertTrue(expected==actual);
	}
	@Test
	public void testAddRecipFull() {
		boolean expected=false;
		boolean actual =false;		
		Recipe recipe1= new Recipe();
		Recipe recipe2= new Recipe();
		Recipe recipe3= new Recipe();
		Recipe recipe4= new Recipe();
		Recipe recipe5= new Recipe();
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(recipe1);
		objRecipeBook.addRecipe(recipe2);
		objRecipeBook.addRecipe(recipe3);
		objRecipeBook.addRecipe(recipe4);
		actual=objRecipeBook.addRecipe(recipe5);
		assertTrue(expected==actual);
	}
	@Test
	public void testAddRecipeFullandExisting() {
		boolean expected=false;
		boolean actual =false;		
		Recipe recipe1= new Recipe();
		Recipe recipe2= new Recipe();
		Recipe recipe3= new Recipe();
		Recipe recipe4= new Recipe();
		RecipeBook objRecipeBook = new RecipeBook();
		objRecipeBook.addRecipe(recipe1);
		objRecipeBook.addRecipe(recipe2);
		objRecipeBook.addRecipe(recipe3);
		objRecipeBook.addRecipe(recipe4);
		actual=objRecipeBook.addRecipe(recipe2);
		assertTrue(expected==actual);
	}
}
