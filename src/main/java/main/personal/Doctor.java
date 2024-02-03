package main.personal;

import java.time.LocalDate;

public class Doctor extends Staff implements Diagnoseable, Treatable{

    public Doctor(String firstName, String lastName, LocalDate birthDate, Post post, Shift shift){
        super();

    }

    public Doctor() {
        super();
    }

    @Override
    public void diagnose(){
        System.out.println("Доктор ставит диагноз");
    }

    @Override
    public void treat (){
        System.out.println("Доктор назначает лечение");
    }

}
