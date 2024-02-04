package main.clients;

import java.time.LocalDate;
//абс.класс-класс кот-й может иметь, и не иметь 1и более абс.мето-в.
//экзем-р абс.кл-са нельзя создать ч/з ключ-е слово New. Абс.метод достаточно объявить,реализацию писать не нужно!

public abstract class  Animal {
    //видно в классе и во всех наследниках
    protected String nickName;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    // Это пустой конструктор(по умолчанию)
    public Animal(String nickName,Owner owner, LocalDate birthDate, Illness illness ) {
        this.nickName = nickName;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }


//    //public Animal() {
//        this("Кличка", new Owner("Хозяин"), LocalDate.of(2020, 12, 12),
//                new Illness("болеет"));//соответсвует принципу DRY.
//    }

    public abstract void eat();

//    public void lifeCycle(){
//        wakeUp("12");
//        hunt();
//        eat();
//        sleep();  }

    public String getNickName() {
        return nickName;
    }
    public Owner getOwner() {
        return owner;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }


    public String getType(){
        return getClass().getSimpleName();
    }
    public String getName() {
        return getClass().getName();
    }


    /* private void wakeUp(String time){
        System.out.println(getType() + " wakes up " + time);
    }

    private void hunt(){
        System.out.println(getType() + " hunts.");
    }

    private void eat(){
        System.out.println(getType() + " eats.");
    }

    private void sleep(){
        System.out.println(getType() + " sleeps.");
    }/* */
    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s, illness = %s",
                nickName, birthDate, owner, illness);
    }
}

