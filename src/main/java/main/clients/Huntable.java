package main.clients;
@FunctionalInterface
public interface Huntable {

    void hunt();
    default double getHuntSpeed(){
        return 10;
    }
}
