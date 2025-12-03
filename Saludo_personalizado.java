package Saludo;
import java.util.Scanner;
public class Saludo_personalizado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola " + nombre + "!");
    }
}
