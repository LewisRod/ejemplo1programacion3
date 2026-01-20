package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio8 {
    
    static void main(){
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la temperatura a calcular(Digite 1 para farenheit o 2 para celcius): ");
        int temperatura = scanner.nextInt();

        if(temperatura == 1){
            System.out.println("Se convertira de celcius a farenheit");

            System.out.print("Digite los celcius: ");
            int celcius = scanner.nextInt();

            int farenheit = (celcius * 9/5) + 32;

            System.out.println("La temperatura en farenheit es: " + celcius);
        }
        else if(temperatura == 2) {

             System.out.println("Se convertira de farenheit a celcius");

            System.out.print("Digite los farenheit: ");
            int farenheit2 = scanner.nextInt();

            int celcius2 = (farenheit2 - 32) * 5 /9;

            System.out.println("La temperatura en celcius es: " + celcius2); 
        }
        else{
            System.out.println("Opcion invalida");
        }
        

    }
}
