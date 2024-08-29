/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_p3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ernes
 */
public class Guevara_Ernesto_Prueba1P2 {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        Random r=new Random();
        
        String palabras[ ] = {"radar","level","world","civic","java","deified","python","rotor","language","madam","refer","stats","noon","hello","moon","wow","racecar","kayak","apple","deed"};
        
        System.out.println("Listado de Palabras:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Palabra"+"["+i+"]: "+palabras[i]);
        }
        
        int llave=0, capacidad=0;
        
        do{
        System.out.println("Ingrese el tamaño del arreglo (num. maximo 20): ");
        capacidad=lea.nextInt();
        
        if(capacidad>20){
            System.out.println("Escriba una capacidad menor a 20");
        }else if(capacidad<=20){
            llave=1;
        }
    }while(llave==0);
    
        String[] arregloA=new String[capacidad];
        String[] arregloB=new String[capacidad];
        
        for (int i = 0; i < arregloA.length; i++) {
            int random=r.nextInt(20);
            String palabratemp=palabras[random];
            String alreves="";
            for (int j = palabratemp.length()-1; j >=0; j--) {
                char letratemp=palabratemp.charAt(j);
                alreves+=letratemp;
            }
            
            if(alreves.equals(palabratemp)){
                arregloA[i]=palabratemp;
            }else{
                i--;
            }
        }
        
        System.out.println("Lista de palabras Arreglo A: ");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println("ArregloA"+"{"+i+"} "+arregloA[i]);
        }
        
        for (int i = 0; i < arregloB.length; i++) {
            int random=r.nextInt(20);
            String palabratemp=palabras[random];
            String alreves="";
            for (int j = palabratemp.length()-1; j >=0; j--) {
                char letratemp=palabratemp.charAt(j);
                alreves+=letratemp;
            }
            
            if(alreves.equals(palabratemp)){
                arregloB[i]=palabratemp;
            }else{
                i--;
            }
        }
        
        System.out.println("\nListado Palabras del Arreglo B: ");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.println("ArregloB"+"{"+i+"} "+arregloB[i]);
        }
        
        String palabrasfaltan="";
        for (int i = 0; i < arregloA.length; i++) {
            for (int j = 0; j < arregloB.length; j++) {
                if(!arregloA[i].equals(arregloB[j])){
                    palabrasfaltan+=arregloA[i]+"\n";
                }
            }
        }
        
        System.out.println("Palabras del Arreglo A que no estan en el B: ");
        System.out.println(palabrasfaltan);
}
}