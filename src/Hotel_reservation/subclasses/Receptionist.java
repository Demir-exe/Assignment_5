package Hotel_reservation.subclasses;

import Hotel_reservation.interfaces.Person;

public class Receptionist extends Person {
    int maas;

    public Receptionist(String name, String surname, int age, String idNo, String gender, String pNo,int maas) {
        super(name, surname, age, idNo, gender, pNo);
        this.maas = maas;
    }

    public void rezerveDegis(){}

    public void newRezerv(){}
}
