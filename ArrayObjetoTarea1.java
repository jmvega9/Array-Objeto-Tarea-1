/*
 * Diseñe un algoritmo de tal manera que le permita crear una matriz de objetos
como una matriz de elementos de datos de tipo primitivo.
 */
package arrayobjetotarea1;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
import java.util.Scanner;
class Falla{

    public int porcentaje_falla;
    public String tipo_falla;

    Falla(int porcentaje_falla, String tipo_falla){
        this.porcentaje_falla=porcentaje_falla;
        this.tipo_falla=tipo_falla;
    }
}

public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Caratula
        System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
        System.out.println("             Ingenieria  Automotriz ");
        System.out.println("              Jessica Maribel Vega ");
        System.out.println("        Programacion Orientada  a objetos ");
        System.out.println("            Ing. Luis Alberto Guerra ");
        System.out.println("                      7450 \n");
        System.out.println("    Matriz de elementos de datos de tipo primitivo \n");
         // Declarar una array
        Falla[] arreglo;

        //asignar menoria para 17 objetos de la clase Falla
        arreglo=new Falla[17];

        //inicializan los elementos del array
        arreglo[0]=new Falla(0,"Sin falla");
        arreglo[1]=new Falla(5,"Fuga de aire");
        arreglo[2]=new Falla(10,"Fuga de aire");
        arreglo[3]=new Falla(15,"Fuga de aire");
        arreglo[4]=new Falla(20,"Fuga de aire");
        arreglo[5]=new Falla(25,"Obstrucción en la válvula EGR");
        arreglo[6]=new Falla(50,"Obstrucción en la válvula EGR");
        arreglo[7]=new Falla(75,"Obstrucción en la válvula EGR");
        arreglo[8]=new Falla(100,"Obstrucción en la válvula EGR");
        arreglo[9]=new Falla(20,"Sobre lectura en el sensor de temperatura");
        arreglo[10]=new Falla(10,"Sobre lectura en el sensor de temperatura");
        arreglo[11]=new Falla(10,"Baja lectura en la temperatura del sensor");
        arreglo[12]=new Falla(20,"Baja lectura en la temperatura del sensor");
        arreglo[13]=new Falla(10,"Sobre lectura en el sensor de presión");
        arreglo[14]=new Falla(20,"Sobre lectura en el sensor de presión");
        arreglo[15]=new Falla(20,"Baja lectura en el sensor de presión");
        arreglo[16]=new Falla(10,"Baja lectura en el sensor de presión");

       //accediendo a los elementos del array
        for(int i=0;i<arreglo.length;i++)
            System.out.println("Elemento en ("+i+"): tiene "+arreglo[i].porcentaje_falla +
                    "% de falla, es decir: "+arreglo[i].tipo_falla);
    }

}
