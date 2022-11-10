package org.example;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder res = new StringBuilder(drink.getText());
        res.reverse();
        drink.setText(res.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
