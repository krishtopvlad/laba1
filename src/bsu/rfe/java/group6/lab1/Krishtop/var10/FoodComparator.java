package bsu.rfe.java.group6.lab1.Krishtop.var10;

import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
    @Override
    public int compare(Food f1, Food f2) {
        if (f1 == null) return 1; // null элементы в конец
        if (f2 == null) return -1;

        if (f1 instanceof Apple && f2 instanceof Apple) {
            Apple a1 = (Apple) f1;
            Apple a2 = (Apple) f2;
            return a2.getSize().compareTo(a1.getSize());
        } else if (f1 instanceof Lemonade && f2 instanceof Lemonade) {
            Lemonade l1 = (Lemonade) f1;
            Lemonade l2 = (Lemonade) f2;
            return l2.getTaste().compareTo(l1.getTaste());
        }else
            return f2.getName().compareTo(f1.getName()); // обратный порядок
    }
}
