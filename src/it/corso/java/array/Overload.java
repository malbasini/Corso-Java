package it.corso.java.array;

public class Overload {
    public void varargs(int ... arg){
        System.out.print("Parametri interi: ");
        for(int a : arg)
            System.out.print(a + " ");
        System.out.println();
    }
    public void varargs(double ... arg){
        System.out.print("Parametri double: ");
        for(double a : arg)
            System.out.print(a + " ");
        System.out.println();
    }
}
