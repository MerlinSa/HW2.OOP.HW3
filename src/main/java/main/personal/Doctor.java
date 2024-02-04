package main.personal;

import java.time.LocalDate;

public class Doctor{

        private String fName;
        private String lName;
        private LocalDate bd;
        private String qualification;
        private int id;

        public Doctor (String fName, String lName, LocalDate bd, String qualification, int id ) {
            this.fName = fName;
            this.lName = lName;
            this.bd = bd;
            this.qualification = qualification;
            this.id = id;

        }

        public String getfName() {
            return fName;
        }

        public String getlName() {
            return lName;
        }

        public LocalDate getBd() {
            return bd;
        }

        public String getQualification() {
            return qualification;
        }

        public int getId() {
            return id;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }

    public void toDiagnose (String patient){
        System.out.println("Doctor #" + getId() + " diagnoses " + patient);}

    public void toTreat (String patient){
        System.out.println("Doctor #" + getId() + " treats " + patient);
        }

        @Override
        public String toString() {
            return String.format("fName = %s, lName = %s, bd = %s, qualification = %s, id = %s",
                    lName, fName, bd, qualification, id);
        }
    }