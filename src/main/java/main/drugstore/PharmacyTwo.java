package main.drugstore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component>, Comparable<PharmacyTwo> { //заменили интерфейс на другой -> Iterable


    // и у него надо реализ-ть 1 метод iterator
    private List<Component> components = new ArrayList<>(); //инициализация поля, положить туда значение.
    private int index = 0;

    //удобный метод для взаимодействия с классом Pharmacy:
    public void addComponents(Component ... components){ // это переменная количества аргументов
        // т.е.мы можем доб-ть от 0добезконеч-ти комп-в. ([] == ...)
        for (Component c : components){ //массив компонентов хотим добавить в поле "components", "c" бежим по компонентам.
            this.components.add(c); // это добавляет в списов List компоненты итеративно
        }
    }


    @Override
    public Iterator<Component> iterator() { //нереализ.метод итератор интерфейса Iterable,возвращает какую-то реализацию
        //Интерфейса Iterable в виде анонимного класса.
        return new Iterator<Component>(){ //у интерфейса нет конструктора, new исполь-ся в аноним. классе
            //итератор в виде аноним класса, вернули объект аноним.класса из метода итератор
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        double weightIndex = 0; //счетчик для веса
        for (Component c : components) { //пробежка по компонентам
            weightIndex = weightIndex + c.getWeight(); // 0+вес лекарства
        }
        return "PharmacyTwo{" +
                "components=" + components + " общий вес лекарства: " + weightIndex +'}';
    }


    @Override
    public int compareTo(PharmacyTwo o) {
        double sum1 = 0D;
        double sum2 = 0D;
        for (Component c : components) {
            sum1 += c.getWeight();
        }
        for (Component c : o.components) {
            sum2 += c.getWeight();
        }
        return Double.compare(sum1, sum2);
    }
}
