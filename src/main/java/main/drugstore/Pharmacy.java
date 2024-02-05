package main.drugstore;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {//интерфейс Iterator требует реализ-ть 2 нераелиз-ных метода:hasNext(),next().
    private List<Component> components = new ArrayList<>(); //инициализация поля, положить туда значение.
    private int index = 0;

    //удобный метод для взаимодействия с классом Pharmacy:
    public void addComponents(Component ... components){ // это переменная количества аргументов
        // т.е.мы можем доб-ть от 0добезконеч-ти комп-в. ([] == ...)
        for (Component c : components){ //массив компонентов хотим добавить в поле "components", "c" бежим по компонентам.
            this.components.add(c); // это добавляет в списов List компоненты итеративно
        }
    }

    @Override
    public boolean hasNext() { //метод итератора
        return index < components.size();  //вернет ответ(Да/нет-true/false) на вопрос:есть ли в лекарс-тве след.компонент?
   //it checks whether the current index is less than the size of the list. if yes->true, no->false
    }

    @Override
    public Component next() { //метод allows you to iterate over a list of components.
        return components.get(index++); //The next() method uses the index variable to retrieve the next component
        // in the list and then increments the index variable by 1.
        // This process continues until the end of the list is reached, at which point hasNext() returns false.
    }
    //interface intertor не поддерж-ет цикл for! поэтому we copied class Pharmacy -> into class PharmacyTwo
    //goto PharmacyTwo
}

