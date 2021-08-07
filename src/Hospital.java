import java.util.Scanner;

public class Hospital {
    Patient patient = new Patient();
    final int maxPatients = 10;
    int registeredPatients = 0;
    Patient[] patients = new Patient[maxPatients];
    Scanner sc = new Scanner(System.in);

    void patientsReader (){
        for (Patient patient1 : patients) {
            if (patient1 != null) {
                System.out.println("Imię: " + patient1.getFirstName());
                System.out.println("Nazwisko: " + patient1.getLastName());
                System.out.println("PESEL: " + patient1.getPesel());
                System.out.println();
            } else break;
        }
    }

    void addPatient(){
        if (registeredPatients < maxPatients) {
            for (int i = registeredPatients; i == registeredPatients; registeredPatients++) {
                patients[i] = new Patient();
                System.out.println("Podaj imię pacjenta: ");
                patients[i].setFirstName(sc.nextLine());
                System.out.println("Podaj nazwisko pacjenta: ");
                patients[i].setLastName(sc.nextLine());
                System.out.println("Podaj PESEL pacjenta: ");
                patients[i].setPesel(sc.nextLine());
            }
        } else System.out.println("Został osiągnięty limit zapisów");
    }

}
