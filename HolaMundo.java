
import java.util.Scanner;
/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        //Imprimir datos en pantalla/consola/terminal
        //Imprimir con salto de linea:
        System.out.println("Hola Ximena");
        System.out.println(10);

        //Imprimir seguido cualquier tipo de dato
        System.out.print("Como van las cosas ");
        System.out.print(10); //num entero
        System.out.print(10.5); // num decimal
        System.out.println('A'); //Caracter con comilla simple
        System.out.print("Mi nombre es " + "Ximena" + " y tengo " + 15 + " años ");

        //Imprimir con una plantilla realizada:
        System.out.printf("Aqui va una cadena : %s%n", "Cesar");
        System.out.printf("Aqui va un entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Cesar Diaz", 15);
        System.out.printf("Su nombre es: %s y ella tiene %d años%n", "Ximena Sierra", 35);

        var entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre: ");
        var entero = entrada.nextLine(); //Aca se dira leame el siguiente nombre
        System.out.println(entero); // Presenta el dato ingresado

        entrada.close(); // siempre se coloca para que se cierre
    }   
    
}