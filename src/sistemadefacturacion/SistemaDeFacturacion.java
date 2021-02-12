package sistemadefacturacion;

import java.util.HashMap;
import java.util.Scanner;

public class SistemaDeFacturacion {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String lectura;
        int opc;
        int opc2;
        char categoria;
        boolean procedenciaInternacional = false;
        HashMap<Nevera, Integer> listaNeveras = new HashMap<Nevera, Integer>();
        HashMap<Televisor, Integer> listaTelevisores = new HashMap<Televisor, Integer>();
        Integer contNeveras = 0;
        Integer contTelevisores = 0;

        System.out.println("Sistema de Facturación");

        do {
            System.out.println("Qué desea hacer?");
            System.out.println("1. Agregar un Electrodomestico");
            System.out.println("2. Salir");

            lectura = teclado.nextLine();
            opc2 = Integer.parseInt(lectura);

            switch (opc2) {
                case 1:

                    System.out.println("¿Qué tipo de Eletrodomestico desea ingresar?");
                    System.out.println("1. Nevera");
                    System.out.println("2. Televisor");
                    lectura = teclado.nextLine();
                    opc = Integer.parseInt(lectura);

                    System.out.println("Ingrese Categoria A, B o C");
                    lectura = teclado.nextLine();
                    categoria = lectura.charAt(0);
                    System.out.println("El producto es de procedencia Internacional? S para Si, N para no");
                    lectura = teclado.nextLine();

                    if (("S".equals(lectura)) || ("s".equals(lectura))) {
                        procedenciaInternacional = true;
                    } else if (("N".equals(lectura)) || ("n".equals(lectura))) {
                        procedenciaInternacional = false;
                    } else {
                        System.out.println("El valor ingresado no es correcto, ingrese de nuevo");
                    }

                    if (opc == 1) { //Si se selecciona Nevera

                        float capacidad;

                        System.out.println("Ingrese capacidad en litros de la Nevera");
                        lectura = teclado.nextLine();
                        capacidad = Float.parseFloat(lectura);

                        Nevera nevera = new Nevera(categoria, procedenciaInternacional, capacidad);
                        String precio = String.valueOf(nevera.getPrecio());

                        System.out.println("El precio de la nevera es: " + precio);
                        contNeveras++;
                        listaNeveras.put(nevera, contNeveras);

                    } else if (opc == 2) { //Si se selecciona Televisor

                        float pulgadas;
                        boolean sincronizador = false;

                        System.out.println("Ingrese Pulgadas del televisor");
                        lectura = teclado.nextLine();
                        pulgadas = Float.parseFloat(lectura);

                        System.out.println("Posee Sincronizador TDT? S para Si, N para no");
                        lectura = teclado.nextLine();

                        if (("S".equals(lectura)) || ("s".equals(lectura))) {
                            sincronizador = true;
                        } else if (("N".equals(lectura)) || ("n".equals(lectura))) {
                            sincronizador = false;
                        } else {
                            System.out.println("El valor ingresado no es correcto, ingrese de nuevo");
                        }

                        Televisor televisor = new Televisor(categoria, procedenciaInternacional, pulgadas, sincronizador);
                        String precio = String.valueOf(televisor.getPrecio());

                        System.out.println("El precio de el televisor es: " + precio);
                        contTelevisores++;
                        listaTelevisores.put(televisor, contTelevisores);

                    } else {
                        System.out.println("Electrodomestico no valido, 1 para Nevera o 2 para Televisor");
                    }

                    break;

                case 2:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Valor ingresado no valido");
                    break;
            }
        } while ((opc2 < 2) || (opc2 > 2));
    }

}
