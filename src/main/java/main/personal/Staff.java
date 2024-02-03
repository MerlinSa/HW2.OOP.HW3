package main.personal;

import main.clients.Illness;
import main.clients.Owner;

import javax.swing.text.Position;
import java.time.LocalDate;

public abstract class Staff {
    protected String firstName;
    protected String lastName;
    protected LocalDate birthDate;
    protected Post post;
    protected Shift shift;


    // Это пустой конструктор(по умолчанию)
    public Staff (String firstName,String lastName, LocalDate birthDate, Post post, Shift shift) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.post = post;
        this.shift = shift;
    }

    public Staff() {
        this("Имя", "Фамилия", LocalDate.now(), new Post("должность"),new Shift("Ночная/Дневная"));
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Post getPost() {
        return post;
    }

    public Shift getEducation() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return String.format("firstName = %s, lastN = %s, post = %s, shift = %s",
                firstName, lastName, post, shift);
    }
}


