package main.clients;
@FunctionalInterface
public interface Flyable {
    double fly();

    default double getFlySpeed(){
        return 10;
    }
}
