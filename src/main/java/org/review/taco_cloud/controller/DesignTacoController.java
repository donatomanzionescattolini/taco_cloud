package org.review.taco_cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.review.taco_cloud.model.Ingredient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Arrays;
import java.util.List;

@Controller

@Slf4j
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {


    @ModelAttribute
    public void addIngredientsToModel(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO","Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO","Corn Tortilla", Ingredient.Type.WRAP),
                new Ingredient("GRMA","Ground Beef", Ingredient.Type.PROTEIN),
                new Ingredient("CHDR","Chicken", Ingredient.Type.PROTEIN),
                new Ingredient("TMTO","Tomato", Ingredient.Type.VEGGIES),
                new Ingredient("LETC","Lettuce", Ingredient.Type.VEGGIES),
                new Ingredient("CHTN","Cheese", Ingredient.Type.CHEESE),
                new Ingredient("JALB","Jalapeno", Ingredient.Type.VEGGIES),
                new Ingredient("SLSA","Salsa", Ingredient.Type.SAUCE),
                new Ingredient("SRCR","Sour Cream", Ingredient.Type.SAUCE)
                );
        Ingredient.Type[] types = Ingredient.Type.values();

        for(Ingredient.Type t : types ){
            model.addAttribute(t.toString().toLowerCase());

        }

    }
}
