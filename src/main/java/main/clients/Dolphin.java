package main.clients;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimmable, Eatable, Huntable {
    public Dolphin(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dolphin() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Дельфин ест");
    }

    @Override
    public void swim(){
    }

    @Override
    public void hunt() {
    }
}
