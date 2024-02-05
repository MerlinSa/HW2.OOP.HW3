Второе задание исправлено, удалила интерфейсы ненужные.
в классе VetClinic описаны методы добавления и получения плавающих, бегающих, летающих, доктора, пациента, медсестры.

Задание№3:
Интерфейс Copmparable<PharmacyTwo> к классу PharmacyTwo(ЛЕКАРСТВО) добавлен.
Переопределен метод compareTo() по весу лекарств.


Созданы 2 экземпляра Pharmacy (paracetamol, alcohol), 
В Main инициализировала ArrayList<PharmacyTwo> pharm = new ArrayList<>(); чтобы добавить компоненты лекарств , 
и метод, выводящий Pharmacy в отсортированном виде :  Collections.sort(pharm); //сортировка по возрастанию
        for (PharmacyTwo pharmacy2 : pharm) { 
            System.out.println(pharmacy2); }
