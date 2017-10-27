/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import java.util.Scanner;

/**
 *
 * @author villa
 */
public class PruebaAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        Alumno t = new Alumno();
        System.out.print("meta nombre:");
        String nombre = captura.nextLine();
        //captura.nextLine();
        System.out.print("meta matricula:");
        int matricula = captura.nextInt();
        //captura.nextInt();
        System.out.print("meta cuota mensual: ");
        double cuotaMensual = captura.nextDouble();
        Alumno t2 = new Alumno(matricula,nombre,cuotaMensual);
        Alumno t3 = new Alumno (t2);
        t3.setNombre("emmanuel");
        t3.setMatricula(201603012);
        t3.setCuotaMensual(20.32);
        
        System.out.println("estas son las de get/set!!!!!!");
        System.out.println("nombre:"+t3.getNombre());
        System.out.println("matricula:"+t3.getMatricula());
        System.out.println("cuotamensual:"+t3.getCuotaMensual());
       //impresiones
        System.out.println("RESULTADOS:");
        System.out.println("CONS VACIO:");
        t.imprimir();
        System.out.print("cuota por cuatrimestre:"+t.calcularCuotaCuatrimestre(t.getCuotaMensual()));
        System.out.print("\n\nCONS PARAMETROS:");
        t2.imprimir();
        System.out.print("cuota por cuatrimestre:"+t2.calcularCuotaCuatrimestre(t2.getCuotaMensual()));
        System.out.print("\n\nCONS COPIA:");
        t3.imprimir();
        System.out.print("cuota por cuatrimestre:"+t3.calcularCuotaCuatrimestre(t3.getCuotaMensual()));
        
        /*Alumno t2 = new Alumno (30,"manny","help",34.43);
        System.out.println(""+t2.calcularCuotaCuatrimestre(matricula));*/
    }
    
    }
