package com.pimposservices.services;

import java.util.List;

import com.pimposservices.dto.RecipeDto;

public interface IRecipeService {

    public List<RecipeDto> getRecipes();
    public String getRecipe(String idRecipe);
    public RecipeDto save(RecipeDto recipeDto);
    public String delete(String idRecipe);

}
