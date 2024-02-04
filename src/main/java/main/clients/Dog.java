package main.clients;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimmable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness, double v) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

//public Dog(){
//        super();
//}

    @Override
    public void toGo() {
    }

    @Override
    //все наследники абс.кл-са обязаны реали-ть/переопред. все его нереализ-ные методы
    public void eat() {
        System.out.println("Собака ест корм");
    }

    public double run(){
        return 15D; //average speed of a running dog
    }
    public double swim () {
        return 5D;
    }

}
