package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Wakeupable, Goable, Huntable, Eatable,  Sleepable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

public Dog(){
        super();
}

    @Override
    public void toGo() {

    }
    @Override
    public void hunt() {
    }
    @Override
    //все наследники абс.кл-са обязаны реали-ть/переопред. все его нереализ-ные методы
    public void eat() {

    }
    @Override
    public void sleep() {

    }

    @Override
    public void wakeup() {

    }
}
