//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.ejemplomenú;

import java.util.Scanner;

public class SPPRRiveraBEjemploMenú {

   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
    
        int opEntrada;
        
        System.out.println("Calculadora de áreas, perímetros y volúmenes \n");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular áreas");
        System.out.println("2. Calcular perímetros");
        System.out.println("3. Calcular volúmenes");
        System.out.println("4. Salir.");
        opEntrada=teclado.nextInt();
        
        switch(opEntrada){
            case 1:
                System.out.println("Bienvenido al cálculo de áreas");
                break;
            case 2:
                System.out.println("Bienvenido al cálculo de perímetros");
                break;
            case 3:
                System.out.println("Bienvenido al cálculo de volúmenes");
                break;
            default:
                System.out.println("Adios");
                
        }
            
    
    
    }
    
}
