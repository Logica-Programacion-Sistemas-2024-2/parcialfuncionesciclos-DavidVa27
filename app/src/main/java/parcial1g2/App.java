/*

 * This source file was generated by the Gradle 'init' task
 */
package parcial1g2;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        // Logica de solución

        

        Scanner gogeta = new Scanner(System.in);
 
        System.out.print("¿Cuántos vehículos desea calcular? ");
        int numVehiculos = gogeta.nextInt();
 
        if (numVehiculos <= 0) {
            System.out.println("El número de vehículos debe ser mayor que 0.");
            return;
        }

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.println("\nVehículo " + i + ":");


            System.out.println("Ingrese la decada: ");
            int decada = gogeta.nextInt();

            if (decada != 90 && decada != 00 && decada != 10 && decada != 20) {
                System.out.println("Década no valida");
            
                i--;
                continue;
            }
            System.out.print("Ingrese el avalúo del vehículo: ");
            double avaluo = gogeta.nextDouble();
 
            if (avaluo <= 0) {
                System.out.println("El avalúo debe ser un número positivo. ");
                i--;
                continue;
            }
           
            double tasaRodamiento = obtenerTasaRodamiento(decada);
            double tasaSeguro = obtenerTasaSeguro(decada);
            double impuestoRodamiento = avaluo * tasaRodamiento;
            double seguro = avaluo * tasaSeguro;
            double totalAPagar = impuestoRodamiento + seguro;
            
            System.out.println("Avalúo: $" + avaluo);
            System.out.println("Década del vehículo: " + decada);
            System.out.println("Total a pagar: $" + totalAPagar);

 
        }

    }


    /*  Implemente una funcion llamada calcularTotalImpuestos que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20, Otra)
            - Un entero que representa avaluo del vehiculo
        * Retorna:
            - Un entero representando el valor total a pagar de los impuestos
        * Controlar errores retornando -1
    */
    //------------------------------------------------------------------

    public static int calcularTotalImpuestos(int decada, int avaluo) {
        try {
            int totalPago = 0;
            double tasaRodamiento = 0;
            double tasaSeguro = 0;
    
            switch (decada) {
                case 70:
                    tasaRodamiento = 0.0376;
                    tasaSeguro = 0.00876;
                    break;
                case 80:
                    tasaRodamiento = 0.0398;
                    tasaSeguro = 0.00854;
                    break;
                case 90:
                    tasaRodamiento = 0.0409;
                    tasaSeguro = 0.00816;
                    break;
                case 00:
                    tasaRodamiento = 0.0434;
                    tasaSeguro = 0.00798;
                    break;
                case 10:
                    tasaRodamiento = 0.0493;
                    tasaSeguro = 0.00712;
                    break;
                case 20:
                    tasaRodamiento = 0.0568;
                    tasaSeguro = 0.00699;
                    break;
                default:  
                    
                    break;

        } catch (Exception e) {
                       
                    }
                
            }
