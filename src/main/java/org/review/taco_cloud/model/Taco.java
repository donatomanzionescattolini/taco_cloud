package org.review.taco_cloud.model;

import lombok.Data;

import java.util.List;

@Data
public class Taco {

    private String name;




    private List<Ingredient> ingredients;

}