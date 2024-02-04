package main.personal;
import main.clients.*;

import main.clients.Animal;
import main.clients.Flyable;
import main.clients.Goable;
import main.clients.Swimmable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;


public class VetClinic {
    private final String name;
    private final String address;
    private HashMap<Animal, LocalDateTime> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;
    private ArrayList<Goable> goables;
    private ArrayList<Flyable> flyables;
    private ArrayList<Swimmable> swimables;

    public VetClinic(String name, String address){
        this.name = name;
        this.address = address;
        this.patients = new HashMap<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
        this.flyables = new ArrayList<>();
        this.goables = new ArrayList<>();
        this.swimables = new ArrayList<>();
    }


    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void addPatient(Animal patient){
        var time = LocalDateTime.now();
        patients.put(patient, time);
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse){
        nurses.add(nurse);
    }

    public void addFlyingAnimals(Flyable animal){

        flyables.add(animal);

    }
    public void addGoingAnimals(Goable animal){
        goables.add(animal);
    }

    public void addSwimAnimals(Swimmable animal){
        swimables.add(animal);
    }

    @Override
    public String toString() {
        return String.format("name: %s, address: %s", name, address);
    }

    public void getPatients(){
        System.out.println("Пациенты: ");
        for (Animal patient : patients.keySet()){
            var date = patients.get(patient);
            System.out.println("Пациент: " + patient.getName() + ". Дата приема: " + date);
        }
    }

    public void getDoctors(){
        System.out.println("Доктор: ");
        for (Doctor doc: doctors) {
            System.out.println(doc);
        }
    }
    public void getNurses(){
        System.out.println("Медсестра: ");
        for (Nurse nurse: nurses) {
            System.out.println(nurse);
        }
    }
    public void getFlyingAnimals(){
        System.out.println("Flying animals: ");
        for (Flyable animal: flyables) {
            System.out.println(animal);
        }
    }
    public void getGoingAnimals(){
        System.out.println("Running animals: ");
        for (Goable animal: goables) {
            System.out.println(animal);
        }
    }
    public void getSwimAnimals(){
        System.out.println("Swimming animals: ");
        for (Swimmable animal: swimables) {
            System.out.println(animal);
        }
    }
}
