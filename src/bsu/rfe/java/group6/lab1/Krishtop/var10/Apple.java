package bsu.rfe.java.group6.lab1.Krishtop.var10;

class Apple extends Food {
    String size;

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }

    @Override
    public double calculateCalories() {
        switch (size) {
            case "малое":
                return 50;
            case "среднее":
                return 75;
            case "большое":
                return 100;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (" + size + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Apple apple = (Apple) obj;
        return size.equals(apple.size);
    }
}
