/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espoch.edu.ec.clases;

/**
 *
 * @author USER
 */
public class Calculadora {
    private int rehacer;
    private int deshacer;
    private int suma;
    private int resultado;

    public Calculadora(int resultado) {
        this.suma=suma;
        suma=resultado;
    }
    
    public int getRehacer() {
        return rehacer;
    }

    public void setRehacer(int rehacer) {
        this.rehacer = rehacer;
    }

    public int getDeshacer() {
        return deshacer;
    }

    public void setDeshacer(int deshacer) {
        this.deshacer = deshacer;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public void mostrar (int resultado){
        resultado=suma;
        System.out.println("Mostrar el resultado actual"+resultado);
    }
    
    
}
