package main.personal;

public class Shift {
    String shift;
    public Shift(String shift){
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "shift='" + shift + '\'' +
                '}';
    }
}

