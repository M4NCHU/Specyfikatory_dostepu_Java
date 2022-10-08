import java.util.Random;
import java.util.*;

class Loteria {
    public static void main(String[] args) {
        // calling objects
        Losowanie liczba1 = new Losowanie();
        Losowanie liczba2 = new Losowanie(10);
        Losowanie liczba3 = new Losowanie(2, 10);
    }
}

class Losowanie {
    // variables visible inside class Losowanie
    private int x, y, liczbaLosowa;
    // common value
    static int counter = 0;

    // call Random class
    Random r = new Random();

    // 0 arguments
    public Losowanie(){
        counter++;
        this.liczbaLosowa = r.nextInt(100);
        show();
    }

    // 1 arguments
    public Losowanie(int a){
        counter++;
        this.x = a;
        this.liczbaLosowa = r.nextInt(x);
        show();
    }

    // 2 arguments
    public Losowanie(int a, int b){
        counter++;
        this.x = a;
        this.y = b;
        this.liczbaLosowa = r.nextInt(x, y);
        show();
    }

    // show results
    public void show(){
        System.out.println(liczbaLosowa);
    }

}