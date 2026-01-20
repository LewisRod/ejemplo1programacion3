package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio14 {
    
   static void main(){
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite un numero: ");
     int num = scanner.nextInt();

    for(int i = 0; i <= num; i++){
        if( num % i == 0){
            System.out.println("El numero es primo");
        }
    }
    System.out.println("No es primo");
    }

   }