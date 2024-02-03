package main;

import main.clients.*;
import main.personal.Doctor;
import main.personal.Helpable;
import main.personal.Nurse;
import main.personal.Treatable;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    public static void main(String[] args) {
        //список персонала
        List<Treatable> lst = new ArrayList<>();
        List<Helpable> lst1 = new ArrayList<>();

        Doctor doc = new Doctor();
        Nurse nurse = new Nurse();
        lst.add(doc);
        lst1.add(nurse);
        System.out.println("Doctor:" + lst);
        System.out.println("Nurse:" + lst1);
        doc.treat();

        System.out.println("****************");

        //список животных
        List<Goable> list = new ArrayList<>();
        List<Swimmable> list1 = new ArrayList<>();
        List<Flyable> list2 = new ArrayList<>();
        List<Huntable> list3 = new ArrayList<>();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Seagull seagull = new Seagull();
        list.add(cat);
        list.add(dog);
        list1.add(dolphin);
        list2.add(seagull);
        System.out.println("Cat and Dog:" + list);
        System.out.println("Dolphin:" + list1);
        System.out.println("Seagull:" + list2);
        cat.wakeup();

        //у класса есть состние и методы,абс.класс хранит в себе и состояние и поведения, а интерфейсы только поведения
//        Animal animal = new Animal() { //аноним.класс, Animal animal- ссылка на аномим.кл.
//            @Override
//            public void eat() {
//
//            }
//        }; //аноним.класс



    }
}
