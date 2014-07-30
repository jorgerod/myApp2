package com.pimposservices.services.impl;

import java.util.List;

import com.pimposservices.dto.RecipeDto;
import com.pimposservices.services.IRecipeService;

public class RecipeService implements IRecipeService{

    @Override
    public List<RecipeDto> getRecipes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getRecipe(String idRecipe) {
        return "Bacon cheese fries";
    }

    @Override
    public RecipeDto save(RecipeDto recipeDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String delete(String idRecipe) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
