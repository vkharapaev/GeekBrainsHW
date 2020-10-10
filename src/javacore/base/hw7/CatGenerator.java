package javacore.base.hw7;

import jdk.management.resource.internal.ResourceNatives;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Класс для генерации котов
 */
public class CatGenerator {

    /**
     * @param count       Количество котов
     * @param minAppetite Минимальный аппетит
     * @param maxAppetite Максимальный аппетит
     */
    public static List<Cat> generate(int count, int minAppetite, int maxAppetite) {
        List<Cat> cats = new ArrayList<>(count);
        Random random = new Random();
        for (int i = 1; i <= count; i++) {
            int appetite = random.nextInt(maxAppetite - minAppetite) + minAppetite;
            cats.add(new Cat("Cat" + i, appetite));
        }
        return cats;
    }
}
