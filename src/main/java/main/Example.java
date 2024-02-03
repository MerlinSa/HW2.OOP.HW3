package main;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = (a, b) -> a+b;
        Mathematics x = Double::sum; //лямда функция. лямбда будет работать, только если интерфейс функциональный
        System.out.println(x.add(15, 45)); // если будет 2 метода неопред-ных тогда только ч/з анонимный класс.

    }
}
interface Mathematics {
    double add(double a, double b);
}

class Calculator{
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0]+arr[1]);
        map.put('-', arr -> arr[0]-arr[1]);
        map.put('*', arr -> arr[0]*arr[1]);
        map.put('f', arr -> Math.sqrt(arr[0]));
    }
    public static void main(String ... args) {
        System.out.println(calculate1('f', 9, 17));

    }
    public static double calculate (char op, double x, double y){
        if(op == '+') return x+y;
        if(op == '-') return x-y;
        if(op == '*') return x*y;
        else throw new UnsupportedOperationException("не реализуется");

    }
    public static double calculate1 (char op, double x, double y){
       return map.get(op).calc(x, y);
    }
}

interface Calculable {
    double calc(double ... arr);
}
