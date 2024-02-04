package main.clients;

import java.time.LocalDate;

public class Swan extends Animal implements Goable, Flyable, Swimmable {
    public Swan(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); //Сходи в род.класс и вызови 4 параметра
    }
//    public Swan() {
//      super();
//    }
    @Override
    public void eat(){

    }

    @Override
    public void toGo() {
    }

    @Override
    public double run() {
        return 5;
    }

    @Override
    public double fly() {
        return 65D; //скорость черношейного лебедя
    }

    public double swim() {
        return 25D;
    }
}
