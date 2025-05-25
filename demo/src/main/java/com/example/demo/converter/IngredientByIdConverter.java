package com.example.demo.converter;

import com.example.demo.data.Ingredient;
import com.example.demo.repository.JdbcIngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.data.Ingredient.Type;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {


    JdbcIngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(JdbcIngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String source) {
        return ingredientRepository.findById(source).orElse(null);
    }
}
