package main.clients;
@FunctionalInterface
public interface Flyable {

    void fly();
    default double getFlySpeed(){
        return 100;
    }
}
