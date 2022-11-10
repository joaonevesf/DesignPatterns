package org.example;

public class ImpatientStrategy implements OrderingStrategy{

    boolean started;
    boolean ended;

    public ImpatientStrategy() {
        started = false;
        ended = false;
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink,recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        started = true;
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        ended = true;
    }
}
