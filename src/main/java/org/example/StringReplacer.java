package org.example;

public class StringReplacer implements StringTransformer{

    private final char in;
    private final char out;

    public StringReplacer(char a, char b) {
        in = a;
        out = b;
    }

    @Override
    public void execute(StringDrink drink) {
        String res = drink.getText();
        res = res.replace(in,out);
        drink.setText(res);
    }

    @Override
    public void undo(StringDrink drink) {
        String res = drink.getText();
        res = res.replace(out,in);
        drink.setText(res);
    }
}
