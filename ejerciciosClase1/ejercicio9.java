package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio9 {
   static void main(){
     final float PI = 3.14f;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite el radio: ");
    int radio = scanner.nextInt();

    float area = PI * (radio * radio);
    float perimetro =  2 * PI * radio;

    System.out.println("El area es: " + area);
    System.out.println("El perimetro es: " + perimetro);
   }
}
