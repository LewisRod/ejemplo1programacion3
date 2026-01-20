package ejemplo1programacion3.ejerciciosClase1;

public class ejercicio10 {
    static void main(){

            //Conversion implicita
        int x  = 10;
        double y = x;

        System.out.println("Entero" + x + "Luego de la convercion: " + y);


            //Conversion explicita
        
            double a = 5.22;
            int b = (int)a;

            System.out.println("Decimal" + a + "Luego de la conversion: " + b);
            
    }
}
