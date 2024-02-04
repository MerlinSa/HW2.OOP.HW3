package main;

import main.clients.*;
import main.personal.Doctor;
import main.personal.Nurse;
import main.personal.VetClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic("Ветклиника - 'Томас'", "г.Бишкек, 12 мкр., дом 30/1");

        Doctor doc = new Doctor("Елена", "Иванова", LocalDate.of(1985,06, 15),
                "Ветврач II", 123456);
        Nurse nurse = new Nurse("Арина", "Сидорова", LocalDate.of(2000, 01, 01),
                "II категория", 123457);
        //список персонала
        vetClinic.addDoctor(doc);
        vetClinic.addNurse(nurse);

        vetClinic.getDoctors();
        vetClinic.getNurses();

        doc.toTreat("Пушок");
        doc.toDiagnose("Котика");

        //список животных
        List<Goable> list = new ArrayList<>();
        List<Flyable> list2 = new ArrayList<>();

        Cat cat = new Cat("Пушок", new Owner("Айнура"),LocalDate.of(2021, 10, 05),
                new Illness("болячка"), 10D );
        Dog dog = new Dog("Скай", new Owner("Стивен"),LocalDate.of(2022, 10, 05), new Illness("болячка"), 10D);
        Dolphin dolphin = new Dolphin("Blue", new Owner("Аквариум"), LocalDate.of(2020, 01, 30), new Illness("болячка"));
        Swan swan = new Swan("Лебедь", new Owner("Питомник"), LocalDate.of(2020,05,05), new Illness("болячка"));

        vetClinic.addPatient(cat);
        vetClinic.addPatient(dog);
        vetClinic.addPatient(dolphin);
        vetClinic.addPatient(swan);

        vetClinic.getPatients();
        vetClinic.addFlyingAnimals(swan);
        vetClinic.addGoingAnimals(dog);
        vetClinic.addGoingAnimals(cat);
        vetClinic.addSwimAnimals(dog);
        vetClinic.addSwimAnimals(swan);
        vetClinic.addSwimAnimals(dolphin);

        vetClinic.getFlyingAnimals();
        vetClinic.getGoingAnimals();
        vetClinic.getSwimAnimals();


//        list2.add(swan);
//        System.out.println("Goable:" + list);
//        System.out.println("Flyable:" + list2);
        //у класса есть состние и методы,абс.класс хранит в себе и состояние и поведения, а интерфейсы только поведения
//        Animal animal = new Animal() { //аноним.класс, Animal animal- ссылка на аномим.кл.
//            @Override
//            public void eat() {}
//        }; //аноним.класс

    }
}
