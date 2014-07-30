package com.pimposservices.controller;



import static spark.Spark.*;
import spark.Request;
import spark.Response;
import spark.Route;

import com.pimposservices.services.IRecipeService;
import com.pimposservices.services.impl.RecipeService;

public class RecipeController {
    public IRecipeService recipeService = new RecipeService(); //añadir inyección de control
    
    public RecipeController() {       
        
        post("/api/recipes", new Route() {
            
            @Override
            public Object handle(Request request, Response response) {
            // process request
            return recipeService.getRecipes();
            }
        });
        
        get("/api/recipe", new Route() { 
            
            @Override
            public Object handle(Request request, Response response) {
            // process request
            return recipeService.getRecipe("zzz");
            }
        });
    }
}
