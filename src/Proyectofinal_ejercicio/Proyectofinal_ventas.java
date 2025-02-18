
package Proyectofinal_ejercicio;

import java.util.Scanner;

public class Proyectofinal_ventas {
    public static void main(String[]args){
        //declarar variable
        String nombre_empleado;
        double venta1, venta2, venta3, sueldo_mensual, comision, pagototal;
        Scanner lectura=new Scanner(System.in);
        System.out.print("ingresar nombre del empleado:");
        nombre_empleado=lectura.next();
        System.out.print("Sueldo mensual:");
        sueldo_mensual=lectura.nextDouble();
        System.out.print("Ingresar la venta1:");
        venta1=lectura.nextDouble();
        System.out.print("Ingresar la venta2:");
        venta2=lectura.nextDouble();
        System.out.print("Ingresar la venta3:");
        venta3=lectura.nextDouble();
        //proceso de datos
        comision=(venta1+venta2+venta3)*0.10;
        pagototal=sueldo_mensual+comision;
        //salida de datos
        System.out.println("La comision de la venta es:"+comision);
        System.out.println("El sueldo neto es:"+pagototal);
        //cambios
        
      
       
               
        
    }
    
}
