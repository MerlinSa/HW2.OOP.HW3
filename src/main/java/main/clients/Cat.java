package main.clients;
import java.time.LocalDate;

//все наследники абс.кл-са обязаны реали-ть все его нереализ-ные методы

public class Cat extends Animal implements Goable {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); //todo сначала конструктор супер-класса (род.класс), потом this.
        this.discount = discount;
    }

//    public Cat() {
//        //super(); //todo тестовый конструктор Animal test
//        this.discount = 10D;
//    }

    @Override
    public void eat() {
        System.out.println("Кошка ест рыбу");
    } //все наследники абс.кл-са обязаны реали-ть/переопред. все его нереализ-ные методы

    @Override
    public void toGo(){
    }

    @Override
    public double run() {
        return 48.0; // скорость бега кошки 48км/ч
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