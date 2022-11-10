package org.example;

public class HumanClient implements Client {
    boolean started;
    boolean ended;
    OrderingStrategy strategy;
    public HumanClient(OrderingStrategy strategy) {
        started = false;
        ended = false;
        this.strategy = strategy;
    }
    @Override
    public void happyHourStarted(Bar bar) {
        this.started = true;
        strategy.happyHourStarted((StringBar) bar);

    }

    @Override
    public void happyHourEnded(Bar bar) {
        this.ended = true;
        strategy.happyHourEnded((StringBar) bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink,recipe,bar);
    }
}
