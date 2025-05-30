package rectangulo;
import java.util.Scanner;

public class menu_testings {
    public static void main(String[] args){
        
        Scanner lectura = new Scanner (System.in);
        int opcion = 0;
        
        do{System.out.println("""
                              
                              ----- Menu de Testings ------
                              
                              - Ejercicio 1
                              - Ejercicio 2
                              - Ejercicio 3
                              - Ejercicio 4
                              - Ejercicio 5
                              - Ejercicio 6
                              - Ejercicio 7
                              - Ejercicio 8
                              - Ejercicio 9
                              - Ejercicio 10
                              - Salir 11
                              
                              Ingrese opción """);
        
        if(lectura.hasNextInt()){
                opcion = lectura.nextInt();
                lectura.nextLine();
            }else{
            System.out.println("La entrada no es un número entero válido");
            lectura.nextLine();
        }
        
        switch(opcion){
            case 1 -> {
                rectangulo rectangulo1 = new rectangulo();
                rectangulo1.ancho = 50;
                rectangulo1.alto = 75;
                System.out.println("El área es " + rectangulo1.calcularArea());
                System.out.println("El perímetro es " + rectangulo1.calcularPerimetro());
                if(rectangulo1.esCuadrado()){
                    System.out.println("Es un cuadrado");
                }else{System.out.println("No es un cuadrado");}
                }
            case 2 -> {
                circulo circulo1 = new circulo();
                circulo1.radio = 20;
                System.out.println("El área es " + circulo1.calcularArea());
                System.out.println("La circunferencia es " + circulo1.calcularCircunferencia());
                }
            case 3 -> {
                
                }
            case 4 -> {
                }
            case 5 -> {
                }
            case 6 -> {
                }
            case 7 -> {
                }
            case 8 -> {
                }
            case 9 -> {
                }
            case 10 -> {
                }    
        }
        
        }while(opcion != 11);
    
        System.out.println("¡Hasta luego!");
        lectura.close();
    }
}
