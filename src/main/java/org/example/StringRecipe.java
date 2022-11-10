package org.example;

import java.util.List;

public class StringRecipe {

    private final List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> list) {
        transformers = list;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }

}
