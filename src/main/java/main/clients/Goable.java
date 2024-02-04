package main.clients;

import java.util.ArrayList;
import java.util.List;

public interface Goable {

    void toGo();
    double run();

    //по дефолту "все" методы публичные и абс-ные, поэтому серые(public abstract) и писать не надо.


    default double getRunSpeed(){
        return 10;
    }



}
