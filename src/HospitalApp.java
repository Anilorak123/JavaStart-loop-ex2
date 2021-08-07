import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();
        Hospital hospital = new Hospital();
        int choice;

        System.out.println("Witaj w programie Hospital");

        do {
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("0- wyjście z programu");
            System.out.println("1- dopisanie pacjenta");
            System.out.println("2- wyświetlenie listy zapisanych pacjentów");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    hospital.addPatient();
                    break;
                case 2:
                    System.out.println("Zapisani pacjenci: ");
                    hospital.patientsReader();
                    break;
            }
        } while (choice != 0);

        System.out.println("Żegnaj użytkowniku");
        System.out.println("Koniec programu");

        sc.close();
    }
}
