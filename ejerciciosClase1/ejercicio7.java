package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio7 {
    static void main(){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite el primer numero: ");
    int a = scanner.nextInt();

    System.out.print("Digite el segundo numero: ");
    int b = scanner.nextInt();

        
    int suma = a + b;
    int resta = a - b;
    int multiplicacion = a * b;
    int divicion = a / b;
    int modulo = a % b;

    System.out.println("La suma es: "  + suma);
    System.out.println("La resta es:" + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La division es: " + divicion);
    System.out.println("El modulo es: " + modulo);
    }
}
