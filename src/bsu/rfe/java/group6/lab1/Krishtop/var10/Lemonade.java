package bsu.rfe.java.group6.lab1.Krishtop.var10;

class Lemonade extends Food {
    private String taste;

    public Lemonade(String taste) {
        super("Lemonade");
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public void consume() {
        System.out.println(this + " выпит");
    }

    @Override
    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false;
        if (!(arg0 instanceof Lemonade)) return false;
        return taste.equals(((Lemonade) arg0).taste);
    }

    @Override
    public String toString() {
        return super.toString() + " со вкусом '" + taste + "'";
    }

    @Override
    public double calculateCalories() {
        // Калорийность в зависимости от вкуса (пример)
        switch (taste) {
            case "lemon":
                return 50;
            case "orange":
                return 60;
            case "grapefruit":
                return 45;
            default:
                return 55;
        }
    }
}
