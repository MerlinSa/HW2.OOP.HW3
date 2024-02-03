package main.clients;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {

    //по дефолту "все" методы публичные и абс-ные, поэтому серые(public abstract) и писать не надо.

    void toGo();
    default double getRunSpeed(){
        return 10;
    }



}
