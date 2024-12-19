package bsu.rfe.java.group6.lab1.Krishtop.var10;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;

        // Цикл для обработки продуктов
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                    System.out.println(arg);
                    String[] parts = arg.split("/");
                    if (parts[0].equals("Lemonade")) {
                        breakfast[itemsSoFar] = new Lemonade(parts[1]);
                        itemsSoFar++;
                    } else if (parts[0].equals("Cheese")) {
                        breakfast[itemsSoFar] = new Cheese();
                        itemsSoFar++;
                    } else if (parts[0].equals("Apple")) {
                        breakfast[itemsSoFar] = new Apple(parts[1]);
                        itemsSoFar++;
                    }
            }
        }


        // Цикл для обработки специальных параметров
        for (String arg : args) {
            if (arg.startsWith("-")) {
                switch (arg) {
                    case "-calories":
                        double totalCalories = 0;
                        for (Food item : breakfast) {
                            if (item != null) {
                                totalCalories += item.calculateCalories();
                            }
                        }
                        System.out.println("Общая калорийность завтрака: " + totalCalories);
                        break;
                    case "-sort":
                        Arrays.sort(breakfast, new FoodComparator());
                        System.out.println("Завтрак отсортирован:");
                        for (Food item : breakfast) {
                            if (item != null) {
                                System.out.println(item);
                            }
                        }
                        break;
                    default:
                        System.out.println("Неизвестный параметр: " + arg);
                }
            }
        }

        Food[] breakfast1 = breakfast;
        Arrays.sort(breakfast1, new FoodComparator());
        for(int i=0; breakfast1[i]!=null; i++){
            int curCount =1;
            String curName = breakfast1[i].toString();
            for (int j=i+1;breakfast1[j]!= null; j++) {
                if(breakfast1[j].equals(breakfast1[i])){
                    curCount++;
                }
                else
                    break;

            }
            i+=curCount-1;
            System.out.println(curCount + " " + curName + " in breakfest" );
        }

        // Вывод завтрака
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else {
                break;
            }
        }

        System.out.println("Всего хорошего!");
    }
}