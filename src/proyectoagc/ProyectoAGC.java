/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoagc;

/**
 *
 * @author Adrian
 */
public class ProyectoAGC {

    public static String veredicto(String valor1, String valor2) {
       String nota1=valor1;
       String nota2=valor2;
        if (nota1.equals(nota2)) {
         return "Perfecto. Has tenido buen criterio";
}
        
    if (Integer.valueOf(nota1) < Integer.valueOf(nota2)){
        return "Has mejorado, o te ha llegado el éxito inesperado.";
}

return "Te has confiado. Falta realismo.";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String valor1= args[1];
    String valor2=args[2];
    
    System.out.println(veredicto(valor1, valor2));
   
       // System.out.println("La calificacion de " + args[0] + " : " + args[2]);
    }
    
}
