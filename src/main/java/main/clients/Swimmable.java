package main.clients;
@FunctionalInterface
public interface Swimmable {

    double swim();

    default double getSwimSpeed(){
        return 10;
    }
}
