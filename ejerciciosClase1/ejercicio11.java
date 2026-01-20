package ejemplo1programacion3.ejerciciosClase1;

import java.util.Scanner;

public class ejercicio11 {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su calificacion");
        int calificacion = scanner.nextInt();

        if(calificacion < 60){
            System.out.println("Su calificacion es una F, no aprobo");
        }
        else if( calificacion > 59 && calificacion < 70){

            System.out.println("Su calificacion es una D, no aprobo");
        }
        else if(calificacion > 69 && calificacion < 80){
            System.out.println("Su calificacion es una C, aprobo");
        }
        else if(calificacion > 79 && calificacion < 90){
            System.out.println("Su calificacion es una B, aprobo");
        }
        else if(calificacion > 89){
            System.out.println("Su calificacion es una A, aprobo");
        }
        else{
            System.out.println("opcion invalida");
        }
    }
}
