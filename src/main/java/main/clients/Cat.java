package main.clients;

import java.time.LocalDate;

//все наследники(Cat) абс.кл-са обязаны реали-ть все его нереализ-ные методы
public class Cat extends Animal implements Wakeupable, Goable, Huntable, Eatable, Sleepable {

    //todo напомнить в чем разница в double
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //todo сначала конструктор супер-класса (род.класс), потом this.
        this.discount = discount;
    }

    public Cat() {
        super(); //todo тестовый конструктор Animal test
        this.discount = 10D;
    }

    public void wakeup() {
        System.out.println("Кошка проснулась в ");
    }

    @Override
    public void toGo(){
    }

    @Override
    public void hunt(){
    }
    @Override
    //все наследники абс.кл-са обязаны реали-ть/переопред. все его нереализ-ные методы
    public void eat(){
    }

    @Override
    public void sleep(){
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + "Discount(" + discount + ")";
    }
}

