import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand= new Random();

        int a=7,b=15;
        int wylosowana=rand.nextInt(b-a+1)+a;
        System.out.println(wylosowana);


        System.out.println(getName());
        System.out.println(getAge());

        Scanner in= new Scanner(System.in);
        System.out.println("Podaj a= ");
        int a= in.nextInt();
        System.out.println("Podaj b= ");
        int b= in.nextInt();


        obliczenia(a,b);
        if(parzysta(a)) System.out.println("parzysta ");
        else System.out.println("nie parzysta ");

        if(zadanie4(a)) System.out.println("Podzielna przez 3 i 5 ");
        else System.out.println("nie podzielna prze 3 i 5 ");

        System.out.println("liczba do potegi trzeciej "+potega(a));
        System.out.println("Pierwiastek z liczby "+pierwiastek(a));

    }
    public static String getName(){
        return "Jan";
    }
    public static int getAge(){
        return 23;
    }
    public static void obliczenia(int a,int b){
        System.out.println((a+" + "+b+ " = "+(a+b)));
        System.out.println((a+" - "+b+ " = "+(a-b)));
        System.out.println((a+" * "+b+ " = "+(a*b)));
    }

    public static boolean parzysta(int a){
        if(a%2==0) return true;
        return false;
    }
    public static boolean zadanie4(int a){
        if(a%3==0 && a%5==0) return true;
        return false;
    }
    public static int potega(int a){
        return (int) Math.pow(a,3);
    }
    public static int pierwiastek(int a){
        return (int) Math.sqrt(a);
    }

}
import java.util.Random;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand= new Random();

        int a=7,b=15;
        int wylosowana=rand.nextInt(b-a+1)+a;
        System.out.println(wylosowana);


        System.out.println(getName());
        System.out.println(getAge());

        Scanner in= new Scanner(System.in);
        System.out.println("Podaj a= ");
        int a= in.nextInt();
        System.out.println("Podaj b= ");
        int b= in.nextInt();


        obliczenia(a,b);
        if(parzysta(a)) System.out.println("parzysta ");
        else System.out.println("nie parzysta ");

        if(zadanie4(a)) System.out.println("Podzielna przez 3 i 5 ");
        else System.out.println("nie podzielna prze 3 i 5 ");

        System.out.println("liczba do potegi trzeciej "+potega(a));
        System.out.println("Pierwiastek z liczby "+pierwiastek(a));

    }
    public static String getName(){
        return "Jan";
    }
    public static int getAge(){
        return 23;
    }
    public static void obliczenia(int a,int b){
        System.out.println((a+" + "+b+ " = "+(a+b)));
        System.out.println((a+" - "+b+ " = "+(a-b)));
        System.out.println((a+" * "+b+ " = "+(a*b)));
    }

    public static boolean parzysta(int a){
        if(a%2==0) return true;
        return false;
    }
    public static boolean zadanie4(int a){
        if(a%3==0 && a%5==0) return true;
        return false;
    }
    public static int potega(int a){
        return (int) Math.pow(a,3);
    }
    public static int pierwiastek(int a){
        return (int) Math.sqrt(a);
    }

}
