package main.clients;

import java.time.LocalDate;

public class Seagull extends Animal implements Flyable, Goable {

    public Seagull(String nickName, Owner owner, LocalDate birthDate, Illness illness){
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }

    public Seagull() {
        super();
    }


    @Override
    public void toGo() {

    }
    @Override
    public void fly() {

    }
}
