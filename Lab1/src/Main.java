import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


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
        int x=(int)(Math.random()*b)+a;
        int y=(int)(Math.random()*b)+a;
        int z=(int)(Math.random()*b)+a;
        System.out.println("liczby:  "+x+y+z);
        if(trojkat(x,y,z)) System.out.println("Jest to trojkat prostokatny ");
        else System.out.println("nie jest to trojkat prostokatny ");

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
    public static boolean trojkat(int a,int b,int c){
        if((a*a)+(b*b)==(c*c)||(b*b)+(c+c)==(a*a)||(c*c)+(a*a)==(b*b)) return true;
        return false;
    }
}


