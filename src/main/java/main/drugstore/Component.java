package main.drugstore;
//род.класс
public abstract class Component implements Comparable<Component> { //Интерф.Comparable позвол-т сортировать компоненты
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() { //переопределие 3 компонентов созданных в клиент.классе!
        return String.format("Title = %s, power = %s, weight = %s", title, power, weight);
    }

    @Override //для этого удалили abstract и потом вернули
    public int compareTo(Component o) {
        return Integer.compare(this.power, o.power);

//        if (this.power < o.power) {
//            return -1;
//        }
//        else if (this.power > o.power) {
//            return 1;
//        }
//        else {
//            return 0;
//        }
    //}
    }

//    //public int getPower() {
//        return power;
//    }
    public double getWeight() {
        return weight;
    }
}
