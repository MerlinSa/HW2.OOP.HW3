package main.clients;
@FunctionalInterface
public interface Wakeupable {

    void wakeup();
    default double getWakeSpeed(){
        return 10;
    }
}
