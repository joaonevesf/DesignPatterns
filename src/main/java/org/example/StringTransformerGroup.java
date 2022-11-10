package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    List<StringTransformer> list;

    public StringTransformerGroup(List<StringTransformer> list) {
        this.list = list;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformer : list) {
            transformer.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        for (StringTransformer transformer : list) {
            transformer.undo(drink);
        }
    }
}
