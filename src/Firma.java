import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        // declare object and assign it to tab
        DanePracownika tab[];
        tab = new DanePracownika[3];

        Scanner no = new Scanner(System.in);
        Scanner text = new Scanner(System.in);



        for (int i = 0; i < 3; i++) {
            // create new employee
            tab[i] = new DanePracownika();
            System.out.println("Dodaj nowego pracownika");
            System.out.println("Podaj imię: ");
            String imie = text.nextLine();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = text.nextLine();
            // check if earnings is higher than 1500
            double zarobki = 0;
            while(zarobki<=1500) {
                System.out.println("Podaj pensję (>1500):");
                zarobki = no.nextDouble();
            }

            // insert data to class instance
            tab[i].wprowadz(imie, nazwisko, zarobki);
        }

        // print employee data on screen
        for (DanePracownika p: tab){
            p.wyswietl();
        }

    }
}

class DanePracownika {

    // private fields
    private String imie;
    private String nazwisko;
    private double zarobki;
    static String nazwa;

    // default constructor
    DanePracownika(){
        this.imie = "";
        this.nazwisko = "";
        this.zarobki = 0.0;
        nazwa = "Company";
    }

    // insert data
    public void wprowadz(String name, String last, double earnings) {
        this.zarobki = earnings;
        this.imie = name;
        this.nazwisko = last;
    }

    //show data
    public void wyswietl() {
        System.out.println("imie: " + imie + " nazwisko: " + nazwisko + " pensja: " + zarobki);
    }


}
