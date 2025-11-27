package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.pages.Box;
import org.example.pages.YandexPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoxProcessor {

    public static void main(String[] args) {
        // Создаем исходную коллекцию коробок
        List<Box> boxes = new ArrayList<>();
        Box box1 = new Box(24, 37, 35);
        Box box2 = new Box(29, 42, 66);
        Box box3 = new Box(36, 24, 45);
        //Добавим коробки в коллекцию boxes
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);

        // Создаем вторую коллекцию для коробок с шириной > 30 см
        List<Box> bigBox = new ArrayList<>();
//Перемещаем коробки шириной >30 см во вторую коллекцию, для перебора используем итератор
        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30){
                bigBox.add(box);
                iterator.remove();
            }
            }
        //Выводим результат
        System.out.println("Коробки >30см:" + bigBox);
        System.out.println("Коробки <30см:");
        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}

