package main.drugstore;

import main.drugstore.components.Azitronite;
import main.drugstore.components.Penicillin;
import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) { //создаем 3 компонента:
        Component water = new Water("Water", 10D, 1);
        Component azitronite = new Azitronite("Azitro", 2D, 14);
        Component penicillin = new Penicillin("Penicillin", 11D, 6);
        //чтобы компоненты хорошо отображались с консоли нужно переопределить (toString)
        // в род.классе(Сomponent)
        Component paracetamol = new Azitronite("paracetamol", 0.5, 9);
        Component alcohol = new Azitronite("alcohol", 7D, 11);



        //на основании 3х компонентов создаем 2 лекар-ва:
        PharmacyTwo p1 = new PharmacyTwo(); //теперь, чтобы добавить компонент надо создать удобный метод в классе Pharmacy.
        // удобный метод для взаимодействия с классом Pharmacy:
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);
        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite, penicillin);

        PharmacyTwo p4 = new PharmacyTwo(); //hw
        p4.addComponents(paracetamol, alcohol);
        PharmacyTwo p5 = new PharmacyTwo();
        p5.addComponents(azitronite, alcohol);

        List<Component> components = new ArrayList<Component>();
        components.add(azitronite);
        components.add(penicillin);
        components.add(water);
        System.out.println(components);
        System.out.println();

        Collections.sort(components, Comparator.reverseOrder()); //goto class Component implement интерф.Comparable
        System.out.println(components);

        System.out.println();

        ArrayList<PharmacyTwo> pharm = new ArrayList<PharmacyTwo>(); //hw
        pharm.add(p1);
        pharm.add(p2);
        pharm.add(p3);
        pharm.add(p4);
        pharm.add(p5);

        Collections.sort(pharm); //сортировка по возрастанию
        for (PharmacyTwo pharmacy2 : pharm) {
            System.out.println(pharmacy2);
        }



//        Iterator<Component> iterator = p1;  // прописали в его классе метод итератора,полиформизм(свойство ооп) использован:
//        //Pharmacy имеет два обличия:Pharmacy(class) и Iterator(interface) //итератор не поддер. for
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//        System.out.println();
//        for (Component c : p2){
//            System.out.println(c);
//        }



    }
}
