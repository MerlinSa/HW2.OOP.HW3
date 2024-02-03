package main.personal;

import java.time.LocalDate;

public class Nurse extends Staff implements Procedureable, Helpable {
    public Nurse(String firstName, String lastName, LocalDate birthDate, Post post, Shift shift){
        super();

    }

    public Nurse() {
        super();
    }
    @Override
    public void perform(){

    }
    public void help(){

    }

}
