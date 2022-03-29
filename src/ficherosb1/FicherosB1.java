package ficherosb1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Samu
 */
public class FicherosB1 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\DAW\\Desktop\\programacion\\Tema2-Java\\Documentos\\Numeros.txt");
        Scanner scF = new Scanner(f);
        int mayor=0;
        int menor=10000000;
        for(int i=0; i<100 ; i++){
            int valor = scF.nextInt();
                if(valor>mayor){
                    mayor=valor;
                }
                if(valor<menor){
                    menor=valor;
                }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}

    

