package org.example;

public class StringCaseChanger implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < drink.getText().length(); i++) {
            if(Character.isLowerCase(drink.getText().charAt(i))) {
                char c = Character.toUpperCase(drink.getText().charAt(i));
                res.append(c);
            }
            else {
                char c = Character.toLowerCase(drink.getText().charAt(i));
                res.append(c);
            }
        }
        drink.setText(res.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }

}
