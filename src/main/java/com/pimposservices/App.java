package com.pimposservices;

import com.pimposservices.controller.RecipeController;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new RecipeController();

    }

}
