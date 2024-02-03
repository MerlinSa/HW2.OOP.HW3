package main.clients;
@FunctionalInterface
public interface Sleepable {

    void sleep();
    default double getSleepSpeed(){
        return 0;
    }
}
