package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio12 {
    static void main(){

        int a = 5;
        int b = 5;

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{  
            System.out.print("1. para suma");
            System.out.print("2. para resta");
            System.out.print("3. para multiplicacion");
            System.out.print("4. para division");
            System.out.print("5. para salir");

             System.out.print("Digite una opcion");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   int suma = a + b;
                   System.out.println("La suma es" + suma); 
                    break;
                case 2:
                    int resta = a - b;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = a * b;
                    System.out.println("La multiplicacion es: " + multiplicacion);
                    break;
                case 4:
                    int division = a / b;
                    System.out.println("La divicion es: " + division);

                case 5:
                default:
                    break;
            }



       
        }while(opcion != 5);

    }
}
