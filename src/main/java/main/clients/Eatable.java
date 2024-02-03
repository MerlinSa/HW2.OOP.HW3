package main.clients;
@FunctionalInterface
public interface Eatable {
    void eat();
    default double getEatSpeed(){
        return 5;
    }
}
