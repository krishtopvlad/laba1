package bsu.rfe.java.group6.lab1.Krishtop.var10;

class Cheese extends Food {

    public Cheese() {
        super("Сыр");
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    @Override
    public double calculateCalories() {
        return 150; // Примерное значение
    }
}
