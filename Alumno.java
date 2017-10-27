/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;


public class Alumno {
 private int matricula;
        private String nombre;
        private double cuotaMensual;
        //constructor vacio.
        public Alumno(){
            this.nombre="";
            this.matricula=0;
        this.cuotaMensual=0.0;
        }
        //constructor de parametros
        public Alumno(int matricula,String nombre,double cuotaMensual){
            this.matricula=matricula;
            this.nombre=nombre;
            this.cuotaMensual=cuotaMensual;
        }
        
        public Alumno(Alumno t){
            this.matricula = t.matricula;
            this.nombre = t.nombre;
            this.cuotaMensual = t.cuotaMensual;
            
        }
        public void imprimir(){
            System.out.println("nombre: "+nombre);
            System.out.println("Matricula: "+matricula);
            System.out.println("cuota mensual: "+cuotaMensual);
        }
        
    public double calcularCuotaCuatrimestre(double cuota) {
        
        return (cuota * 4);
    }
    public void setMatricula(int matricula){
    this.matricula=matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
       
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    
}
