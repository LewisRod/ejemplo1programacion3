package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio15 {
    static void main(){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite la cantidad de lineas: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print("*");
            }
            System.out.println(); 
    }

     System.out.println(); 
      System.out.println(); 

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}
