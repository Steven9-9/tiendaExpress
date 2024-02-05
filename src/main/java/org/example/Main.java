package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nombreCliente;
        Integer tipoCliente;
        Integer cantidadArticulos;
        Double precioTotal = 0.0;
        Double totalPagar;
        Double precio = 150000.0;
        Double descuento;


        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrsa tu nombre completo: ");
        nombreCliente = leer.nextLine();

        System.out.println("Bienvenido "+ nombreCliente + " a Moda Express.");

        System.out.println("Elige una opcion: ");
        System.out.println("1. Cliente VIP");
        System.out.println("2. Cliente regular");
        tipoCliente = leer.nextInt();

        if(tipoCliente == 1){

            System.out.println("******** Estas en cuenta VIP *********");

            System.out.println("Elige la cantidad de productos que deseas llevar: ");
              cantidadArticulos = leer.nextInt();

            precioTotal = cantidadArticulos * precio;

            if(cantidadArticulos <=3 ){

                System.out.println("******* Tienes un descuento del 10% *******");

                descuento = precioTotal*0.1;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $"+descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);


            }else if(cantidadArticulos >=4 && cantidadArticulos <= 6){

                System.out.println("******* Tienes un descuento del 15% *******");
                descuento = precioTotal*0.15;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $"+descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);

            }else{


                System.out.println("******* Tienes un descuento del 20% *******");
                descuento = precioTotal*0.2;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $"+descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);

            }




        }else if(tipoCliente == 2){

            System.out.println("******** Estas en cuenta regular *********");

            System.out.println("Elige la cantidad de productos que deseas llevar: ");
            cantidadArticulos = leer.nextInt();

            precioTotal = cantidadArticulos*precio;

            if(cantidadArticulos <=3 ){

                System.out.println("******* Tienes un descuento del 5% *******");

                descuento = precioTotal*0.1;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $"+descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);


            }else if(cantidadArticulos >=4 && cantidadArticulos <= 6){

                System.out.println("******* Tienes un descuento del 10% *******");
                descuento = precioTotal*0.15;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $ "+descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);

            }else{


                System.out.println("******* Tienes un descuento del 15% *******");

                descuento = precioTotal*0.2;
                totalPagar = precioTotal-descuento;

                System.out.println("********** Factura *********");
                System.out.println("Sr@ "+nombreCliente);
                System.out.println("El precio normal de la compra es de: $" +precioTotal);
                System.out.println("El descuento es de: $" +descuento);
                System.out.println("La cantidad de productos que llevas es de: "+cantidadArticulos);
                System.out.println("EL precio total a pagar es de: $"+totalPagar);

            }




        }else{

            System.out.println("opcion no valida");
        }

    }
}